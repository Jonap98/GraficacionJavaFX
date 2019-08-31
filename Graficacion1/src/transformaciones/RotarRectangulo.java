package transformaciones;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


public class RotarRectangulo extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	public void start(Stage primaryStage)
	{
		Rectangle rect=new Rectangle(100,100,50,50);
		rect.setFill(Color.LIMEGREEN);
		
		RotateTransition rotate=new RotateTransition();
		rotate.setAxis(Rotate.Y_AXIS);
		rotate.setByAngle(360);
		rotate.setCycleCount(500);
		rotate.setDuration(Duration.millis(2000));
		rotate.setAutoReverse(true);
		rotate.setNode(rect);
		rotate.play();
		
		Rectangle rect2=new Rectangle(300,100,50,50);
		rect2.setFill(Color.LIMEGREEN);
		
		RotateTransition rotate2=new RotateTransition();
		rotate2.setAxis(Rotate.X_AXIS);
		rotate2.setByAngle(360);
		rotate.setCycleCount(500);
		rotate.setDuration(Duration.millis(2000));
		rotate.setAutoReverse(true);
		rotate.setNode(rect2);
		rotate.play();
		/*
		TranslateTransition translate=new TranslateTransition();
		//Rectangle rect2 = new Rectangle (100, 40, 100, 100);
	     rect.setArcHeight(50);
	     rect.setArcWidth(50);
	     rect.setFill(Color.VIOLET);*/
	 /*
	     TranslateTransition tt = new TranslateTransition(Duration.millis(2000), rect);
	     tt.setByX(200f);
	     tt.setCycleCount(400);
	     tt.setAutoReverse(true);
	 
	     tt.play();*/
		
		Group root=new Group();
		root.getChildren().addAll(rect,rect2);
		//root.getChildren().add(rect2);
		Scene scene=new Scene(root,600,600,Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Rotacion con animacion");
		primaryStage.show();

		
	}

}
