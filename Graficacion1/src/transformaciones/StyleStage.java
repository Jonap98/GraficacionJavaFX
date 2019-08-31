package transformaciones;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class StyleStage
{
	private final StylePanel stylePanel;
    private final Stage stage;
    private Stage demoStage;
 
    public StyleStage(Stage stage) {
        this.stage = stage;
        stylePanel = new StylePanel();
        
        Scene scene = new Scene(stylePanel);
        
        stage.setScene(scene);
        stage.setTitle("Choose style");
        
        stage.setOnCloseRequest((WindowEvent t) -> {
            demoStage.close();
        });
    }
    
    public void add(String name, String styleSheetName) {
        stylePanel.add(name, styleSheetName);
    }    
    
    public void setSceneCreator(final SceneCreator sceneCreator) {
        if (demoStage == null) {
            demoStage = new Stage();
            demoStage.setTitle("Demo");
            demoStage.setX(stage.getX());
            demoStage.setY(stage.getY() + stage.getHeight());
        }
        demoStage.setScene(sceneCreator.createScene());
        demoStage.show();
        stylePanel.selected.addListener((ObservableValue<? extends String> ov, 
            String t, String t1) -> {
            demoStage.setScene(sceneCreator.createScene());
            
            if (t1 != null) {
                demoStage.getScene().getStylesheets().setAll(
                        UIControlCSS.class.getResource(t1).toString());
            }
        });
    }
    
    public static interface SceneCreator {
        Scene createScene();
    }
}
 
class StylePanel extends HBox {
    
    public StringProperty selected = new SimpleStringProperty();
    
    ToggleGroup stylesheetToggleGroup = new ToggleGroup();
 
    public StylePanel() {
        super(5);
 
        StyleButton defaultStylesheetButton = new StyleButton("Default", null);
        defaultStylesheetButton.setSelected(true);
        defaultStylesheetButton.setToggleGroup(stylesheetToggleGroup);
 
        setPadding(new Insets(0, 0, 30, 0));
        setAlignment(Pos.BOTTOM_LEFT);
        getChildren().addAll(defaultStylesheetButton);
    }
 
    public void add(String name, String styleSheetName) {
        StyleButton styleButton = new StyleButton(name, styleSheetName);
        styleButton.setToggleGroup(stylesheetToggleGroup);
        getChildren().addAll(styleButton);
    }
 
    class StyleButton extends ToggleButton {
 
        public StyleButton(String text, final String styleSheetName) {
            super(text);
            selectedProperty().addListener((Observable ov) -> {
                selected.set(styleSheetName);
            });
        }
    }
}
