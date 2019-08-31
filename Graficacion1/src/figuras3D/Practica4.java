package figuras3D;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Practica4 extends Application
{
	public void start(Stage primaryStage)
	{
		Image image1=new Image(getClass().getResource("Moon.png").toExternalForm());
		Image image2=new Image(getClass().getResource("TierraPlana.jpg").toExternalForm());
		Image image3=new Image(getClass().getResource("Universe.jpg").toExternalForm());
		Image image4=new Image(getClass().getResource("Moon.png").toExternalForm());
		//ImageView background=new ImageView();
		//background.setImage(image3);
		
		PhongMaterial material1=new PhongMaterial();
		material1.setDiffuseMap(image1);
		PhongMaterial material2=new PhongMaterial();
		Color color_luz=Color.WHITE;
		material2.setSpecularColor(color_luz);
		material2.setSpecularPower(1000);
		material2.setDiffuseMap(image2);
		PhongMaterial material3=new PhongMaterial();
		material3.setDiffuseMap(image4);
		
		Sphere sphere=new Sphere(100,100);
		sphere.setTranslateX(500);
		sphere.setTranslateY(150);
		sphere.setTranslateZ(150);
		sphere.setDrawMode(DrawMode.FILL);
		sphere.setCullFace(CullFace.BACK);
		sphere.setMaterial(material2);
		
		Sphere sphere2=new Sphere(100,100);
		sphere2.setTranslateX(500);
		sphere2.setTranslateY(350);
		sphere2.setTranslateZ(150);
		sphere2.setDrawMode(DrawMode.FILL);
		sphere2.setCullFace(CullFace.BACK);
		sphere2.setMaterial(material3);
		
		RotateTransition rotate=new RotateTransition(Duration.millis(9000));
		rotate.setNode(sphere);
		rotate.setCycleCount(300);
		rotate.setFromAngle(0);
		rotate.setToAngle(360);
		rotate.setAxis(Rotate.Y_AXIS);
		rotate.play();
		
		RotateTransition rotate2=new RotateTransition(Duration.millis(9000));
		rotate2.setNode(sphere2);
		rotate2.setCycleCount(300);
		rotate2.setFromAngle(360);
		rotate2.setToAngle(0);
		rotate2.setAxis(Rotate.Y_AXIS);
		rotate2.play();
		
		
		TranslateTransition translate1=new TranslateTransition(Duration.millis(1000));
		translate1.setFromZ(0);
		translate1.setToZ(1000);
		translate1.setCycleCount(400);
		translate1.setAutoReverse(true);
		translate1.setNode(sphere2);
		translate1.play();
		
		TranslateTransition translate2=new TranslateTransition(Duration.millis(1000));
		translate2.setFromX(150);
		translate2.setToX(800);
		translate2.setCycleCount(400);
		translate2.setAutoReverse(true);
		translate2.setNode(sphere2);
		translate2.play();
		
		Group root=new Group(sphere,sphere2);
		//root.getChildren().add(background);
		Scene scene=new Scene(root,1360,695,true,SceneAntialiasing.BALANCED);
		
		double translateX=0;
		double translateY=0;
		double translateZ=150;
		for(int index=0; index<50; index++)
		{
			translateX=Math.random()*index*50;
			translateY=Math.random()*index*50;
			drawStars(root,material1,translateX,translateY,translateZ);
		}
		
		PerspectiveCamera camera=new PerspectiveCamera();
		scene.setCamera(camera);
		primaryStage.setTitle("Practica4");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void drawStars(Group root,PhongMaterial material,double translateX,double translateY,double translateZ)
	{
		Sphere sphere=new Sphere(5,5);
		sphere.setTranslateX(translateX);
		sphere.setTranslateY(translateY);
		sphere.setTranslateZ(translateZ);
		sphere.setDrawMode(DrawMode.FILL);
		sphere.setCullFace(CullFace.BACK);
		sphere.setMaterial(material);
		root.getChildren().add(sphere);
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
