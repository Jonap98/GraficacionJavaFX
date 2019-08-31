package figuras3D;

import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

public class ProyectoNes extends Application
{
	private static final int WIDTH = 1360;
	private static final int HEIGHT = 695;
	
	public void start(Stage primaryStage)throws Exception
	{
		Image image1=new Image(getClass().getResource("Nes1.jpg").toExternalForm());
		PhongMaterial material1=new PhongMaterial();
		material1.setDiffuseMap(image1);
		
		Image image2=new Image(getClass().getResource("Power.png").toExternalForm());
		PhongMaterial material2=new PhongMaterial();
		material2.setDiffuseMap(image2);
		
		Image image3=new Image(getClass().getResource("Reset.png").toExternalForm());
		PhongMaterial material3=new PhongMaterial();
		material3.setDiffuseMap(image3);
		
		PhongMaterial material4=new PhongMaterial(Color.RED);
		
		Image image4=new Image(getClass().getResource("Nintendo.png").toExternalForm());
		PhongMaterial material5=new PhongMaterial();
		material5.setDiffuseMap(image4);
		
		
		Box box=new Box(400,350,150);
		box.setTranslateX(50);
		box.setTranslateY(30);
		box.setTranslateZ(15);
		box.setCullFace(CullFace.BACK);
		box.setDrawMode(DrawMode.FILL);
		box.setMaterial(material1);
		
		Box led=new Box(10,35,10);
		led.setMaterial(material4);
		led.setTranslateX(-115);
		led.setTranslateY(190);
		led.setTranslateZ(50);
		
		Box power=new Box(60,40,20);
		power.setMaterial(material2);
		power.setTranslateX(-70);
		power.setTranslateY(190);
		power.setTranslateZ(50);
		
		Box reset=new Box(60,40,20);
		reset.setMaterial(material3);
		reset.setTranslateX(5);
		reset.setTranslateY(190);
		reset.setTranslateZ(50);
		
		Box logo=new Box(155,5,25);
		logo.setMaterial(material5);
		logo.setTranslateX(-30);
		logo.setTranslateY(205);
		logo.setTranslateZ(-25);		
		
		SmartGroup root = new SmartGroup();
		root.getChildren().addAll(box,led,power,reset,logo);
		
		Camera camera=new PerspectiveCamera();
		Scene scene=new Scene(root,WIDTH,HEIGHT,true,SceneAntialiasing.BALANCED);
		scene.setCamera(camera);
		
		root.translateXProperty().set(WIDTH/2);
		root.translateYProperty().set(HEIGHT/2);
		root.translateZProperty().set(-1200);
		
		primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
			switch(event.getCode())
			{
			case W:
				root.translateZProperty().set(root.getTranslateZ()+100);
				break;
			case S:
				root.translateZProperty().set(root.getTranslateZ()-100);
				break;
			case Q:
				root.rotateByZ(10);
				break;
			case E:
				root.rotateByZ(-10);
				break;
			case NUMPAD8:
				root.rotateByX(10);
				break;
			case NUMPAD2:
				root.rotateByX(-10);
				break;
			case NUMPAD6:
				root.rotateByY(10);
				break;
			case NUMPAD4:
				root.rotateByY(-10);
				break;
			}
		});
		
		
		primaryStage.setTitle("Nes");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	class SmartGroup extends Group
	{
		Rotate r;
		Transform t=new Rotate();
		
		void rotateByX(int ang)
		{
			r=new Rotate(ang,Rotate.X_AXIS);
			t=t.createConcatenation(r);
			this.getTransforms().clear();
			this.getTransforms().addAll(t);
		}
		
		void rotateByY(int ang)
		{
			r=new Rotate(ang,Rotate.Y_AXIS);
			t=t.createConcatenation(r);
			this.getTransforms().clear();
			this.getTransforms().addAll(t);
		}
		
		void rotateByZ(int ang)
		{
			r=new Rotate(ang,Rotate.Z_AXIS);
			t=t.createConcatenation(r);
			this.getTransforms().clear();
			this.getTransforms().addAll(t);
		}
	}

}

