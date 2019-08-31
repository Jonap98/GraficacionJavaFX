package figuras3D;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Practica3 extends Application
{
	public void start(Stage primaryStage)
	{
		Image image1=new Image(getClass().getResource("Happy.png").toExternalForm());
		Image image2=new Image(getClass().getResource("Planet.jpg").toExternalForm());
		Image image3=new Image(getClass().getResource("TierraPlana.jpg").toExternalForm());
		
		PhongMaterial material1=new PhongMaterial();
		material1.setDiffuseMap(image1);
		
		PhongMaterial material2=new PhongMaterial();
		material2.setDiffuseMap(image2);
		
		PhongMaterial material3=new PhongMaterial();
		material3.setDiffuseMap(image3);
		
		PhongMaterial material4=new PhongMaterial(Color.DARKRED);
		
		Box box=new Box(100,100,100);
		box.setTranslateX(200);
		box.setTranslateY(150);
		box.setTranslateZ(150);
		box.setDrawMode(DrawMode.FILL);
		box.setCullFace(CullFace.BACK);
		box.setMaterial(material4);
		box.setMaterial(material1);
		
		Sphere sphere=new Sphere(100,100);
		sphere.setTranslateX(500);
		sphere.setTranslateY(150);
		sphere.setTranslateZ(150);
		sphere.setDrawMode(DrawMode.FILL);
		sphere.setCullFace(CullFace.BACK);
		sphere.setMaterial(material2);
		
		Cylinder cylinder=new Cylinder(100,10,100);
		cylinder.setTranslateX(800);
		cylinder.setTranslateY(150);
		cylinder.setTranslateZ(150);
		cylinder.setDrawMode(DrawMode.FILL);
		cylinder.setCullFace(CullFace.BACK);
		cylinder.setMaterial(material3);
		
		TranslateTransition translate=new TranslateTransition(Duration.millis(1000));
		translate.setFromZ(10);
		translate.setToZ(950);
		translate.setCycleCount(600);
		translate.setAutoReverse(true);
		translate.setNode(sphere);
		translate.play();
		
		TranslateTransition translate2=new TranslateTransition(Duration.millis(10000));
		translate2.setFromY(150);
		translate2.setToY(800);
		translate2.setCycleCount(400);
		translate2.setAutoReverse(true);
		translate2.setNode(cylinder);
		translate2.play();
		
		RotateTransition rotate=new RotateTransition(Duration.millis(2000),box);
		rotate.setCycleCount(600);
		rotate.setFromAngle(0);
		rotate.setToAngle(360);
		rotate.setAxis(Rotate.Y_AXIS);
		rotate.play();
		
		Group root=new Group(box,sphere,cylinder);
		Scene scene=new Scene(root,1360,695,true,SceneAntialiasing.BALANCED);
		PerspectiveCamera camera=new PerspectiveCamera();
		
		scene.setCamera(camera);
		primaryStage.setTitle("Practica3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch (args);
	}

}
