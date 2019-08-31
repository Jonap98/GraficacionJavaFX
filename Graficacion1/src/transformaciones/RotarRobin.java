package transformaciones;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotarRobin extends Application
{
	public void start(Stage primaryStage)
	{
		Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Robin");
        primaryStage.show();
        drawShapes(gc);
        
        RotateTransition rotate=new RotateTransition(Duration.millis(2000), canvas);
	 	rotate.setAxis(Rotate.Y_AXIS);
	 	rotate.setByAngle(360);
	 	rotate.setCycleCount(500);
	 	rotate.setAutoReverse(true);
		
		TranslateTransition translate=new TranslateTransition(Duration.millis(1000), canvas);
		translate.setByX(200);
		translate.setCycleCount(500);
		translate.setAutoReverse(true);
		
		ScaleTransition scale=new ScaleTransition();
		scale.setByX(.5);
		scale.setByY(.5);
		scale.setCycleCount(8);
		scale.setAutoReverse(true);
		scale.setNode(canvas);
        
        VBox vbox=new VBox();
        StackPane sp=new StackPane();
        vbox.setSpacing(10);
        sp.setMinWidth(500);
        sp.setMinHeight(500);
        
        ToggleButton rotar=new ToggleButton("Rotar");
        rotar.setPrefSize(120, 20);
        rotar.setStyle("-fx-background-color: #ed0051; -fx-text-fill: white;");
        rotar.setOnAction((ActionEvent event) ->{
        	rotate.play();
        });
        ToggleButton transladar=new ToggleButton("Transladar");
        transladar.setPrefSize(120, 20);
        transladar.setStyle("-fx-background-color: #26c872; -fx-text-fill: white;");
        transladar.setOnAction((ActionEvent event) ->{
        	translate.play();
        });
        ToggleButton detenerRotacion=new ToggleButton("Detener rotacion");
        detenerRotacion.setPrefSize(120, 20);
        detenerRotacion.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        detenerRotacion.setOnAction((ActionEvent event) ->{
        	rotate.stop();
        });
        ToggleButton detenerTranslacion=new ToggleButton("Detener translacion");
        detenerTranslacion.setPrefSize(120, 20);
        detenerTranslacion.setStyle("-fx-background-color: #ed0051; -fx-text-fill: white;");
        detenerTranslacion.setOnAction((ActionEvent event) ->{
        	translate.stop();
        });
        ToggleButton escalar=new ToggleButton("Escalar");
        escalar.setPrefSize(120, 20);
        escalar.setStyle("-fx-background-color: #26c872; -fx-text-fill: white;");
        escalar.setOnAction((ActionEvent event) ->{
        	scale.play();
        });
        
        vbox.getChildren().addAll(rotar,transladar,detenerRotacion,detenerTranslacion,escalar);
        root.getChildren().add(vbox);
	}
	
	public void drawShapes(GraphicsContext gc)
	{
        //Parches para rellenar
        /*Capa*/
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("d39c24"));
        gc.beginPath();
        gc.appendSVGPath("M230,380 Q285,370 330,375 L325,230 250,230 230,380");
        gc.fill();
        gc.stroke();
        /*Pantalón*/
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("26c872"));
        gc.beginPath();
        gc.appendSVGPath("M270,320 310,320 310,290 270,290");
        gc.fill();
        
        // Brazo Izquierdo
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        /*Brazo*/
        gc.setFill(Color.valueOf("eba58e"));
        gc.beginPath();
        gc.appendSVGPath("M335,245 Q340,275 339,305 L325,310 Q326,275 320,249 z");
        gc.fill();
        gc.stroke();
        /*Manga y guante*/
        gc.setFill(Color.valueOf("26c872"));
        gc.beginPath();
        gc.appendSVGPath("M320,220 Q335,222 340,245 L315,255 310,220z"
        		+ "M318,310 Q330,307 345,295 Q345,310 340,325 Q345,345 340,360"
        		+ "Q335,362 330,360 Q327,361 323,358 Q318,359 315,350 Q315,344 320,342 Q315,330 325,325 z"
        		+ "M330,360 C330,350 335,353 335,345"
        		+ "M323,358 Q325,352 327,350 M318,353 Q319,350 325,345"
        		+ "M330,327 Q324,332 330,339 C313,353 334,355 337,340");
        gc.fill();
        gc.stroke();
        
        // Torso
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("ed0051"));
        gc.beginPath();
        gc.appendSVGPath("M250,215 255,255 Q267,270 270,300 L315,300 Q315,265 325,255 Q327,233 314,227");
        gc.fill();
        gc.stroke();
        
        //Simbolo de Robin
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M322,235 310,247 322,260 Q329,245 323,235");
        gc.fill();
        gc.stroke();
        gc.setFill(Color.valueOf("ffff32"));
        gc.beginPath();
        gc.appendSVGPath("M321,236 Q310,247 321,259 Q329,247 321,236");
        gc.fill();
        gc.stroke();
        
        // Brazo Derecho
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        /*Brazo*/
        gc.setFill(Color.valueOf("eba58e"));
        gc.beginPath();
        gc.appendSVGPath("M250,253 Q243,275 243,310 L228,305 Q228,270 234,243");
        gc.fill();
        gc.stroke();
        /*Manga y guante*/
        gc.setFill(Color.valueOf("26c872"));
        gc.beginPath();
        gc.appendSVGPath("M225,235 C248,194 273,225 255,255 z"
        		+ "M247,305 220,295 230,330"
        		+ "Q222,345 225,360 Q228,362 230,361 Q233,363 237,362 Q240,366 245,365 Q250,367 255,365 C260,364 250,355 250,340"
        		+ "Q255,340 258,345 C260,342 260,330 247,330 z"
        		+ "M230,360 Q227,350 229,345 M237,362 Q233,350 234,344 M245,365 Q239,350 240,345");
        gc.fill();
        gc.stroke();
        
        // Medias
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        /*280,485 (460 comienza la suela gris) los 15 de más son para el fondo*/
        gc.appendSVGPath("M280,400 280,485 Q270,498 225,485 L250,400 z"
        		+ "M295,401 295,485 Q325,495 350,485 L325,400 z");
        gc.fill();
        gc.stroke();
        
        // Zapatillas
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("93a39c"));
        /*Tacón*/
        gc.beginPath();
        gc.appendSVGPath("M279,487 279,471 274,473 274,489 z"
        		+ "M296,485 296,470 310,480 310,488 z");
        gc.fill();
        gc.stroke();
        /*Parte Superior*/
        gc.beginPath();
        gc.appendSVGPath("M260,470 C260,440 215,420 210,465 Q240,490 260,470"
        		+ "M320,470 C310,455 359,415 361,460 Q340,480 320,470");
        gc.fill();
        gc.stroke();
        /*Suela*/
        gc.beginPath();
        gc.appendSVGPath("M270,470 270,490 Q230,505 200,490 Q200,475 210,467 Q250,475 270,470"
        		+ "M315,490 315,470 Q345,470 365,460 Q372,470 372,485 Q355,500 315,490");
        gc.fill();
        gc.stroke();
        
        // Pantalón
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("26c872"));
        gc.beginPath();
        gc.appendSVGPath("M312,300 312,350 325,400 Q308,405 295,401 L300,350 298,318 Q301,317 303,315"
        		+ "M270,300 267,350 250,400 Q266,405 280,400 L280,350 288,318 298,318");
        /* Ancla para las zapatillas
         * Izquierda: 250,400 280,400
         * Derecha: 325,400 295,401*/
        gc.fill();
        gc.stroke();
        
        // Cinturon
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("ffff32"));
        gc.beginPath();
        gc.appendSVGPath("M265,285 265,305 280,310 280,290z M275,290 275,307"
        		+ "M280,295 310,295 310,305 280,305 z"
        		+ "M310,290 310,310 318,309 318,285 z M314,289 314,310");
        gc.fill();
        gc.stroke();
        gc.strokeOval(289, 289, 16, 23);
        gc.fillOval(290, 290, 14, 21);
        gc.strokeOval(293, 294, 9, 13);
        
        //Detalles de torso
        gc.setFill(Color.valueOf("ffff32"));
        gc.strokeOval(290, 220, 18, 25);
        gc.fillOval(290, 220, 17, 24);
        gc.strokeOval(291, 250, 18, 7);
        gc.fillOval(292, 251, 16, 5);
        
        // Cuello
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M270,190 270,210 250,215 300,235 320,220 295,210 295,200");
        gc.fill();
        gc.stroke();
        
        // Cabeza
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("eba58e"));
        gc.beginPath();
        gc.appendSVGPath("M195,140 C195,160 215,175 225,165"
        		+ "M220,169 C230,190 300,205 310,205 Q380,160 350,90"
        		+ "L335,50 190,50 195,140");
        /* Ancla para la cabeza: 195,140 (Izquierda) 350,90 (Derecha)*/
        gc.fill();
        gc.stroke();
        
        // Cabello
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M195,140 Q165,115 155,75 L185,90 Q170,60 120,50"
        		+ "Q170,20 205,30 L175,15 Q245,-10 290,15 L280,5"
        		+ "Q350,35 350,90 Q340,75 320,60 Q320,70 315,80 L310,75"
        		+ "Q310,80 300,85 C275,60 245,50 225,90 L235,85 Q225,105 225,140"
        		+ "Q210,110 195,140");
        gc.fill();
        gc.stroke();
        
        // Gafas
        gc.setLineWidth(6.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("ddeef2"));
        gc.beginPath();
        gc.appendSVGPath("M255,90 Q290,105 310,135 C335,162 380,152 350,90 Q 330,105 310,135"
        		+ "C295,160 235,165 255,90");
        gc.fill();
        gc.stroke();
          
        // Nariz y Boca
        gc.setLineWidth(1.5);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("eba58e"));
        gc.beginPath();
        gc.appendSVGPath("M310,140 Q325,130 315,150"
        		+ "M300,160 Q315,165 325,158");
        gc.fill();
        gc.stroke();
        
        //Parches para rellenar
        gc.setFill(Color.valueOf("26c872"));
        gc.beginPath();
        gc.appendSVGPath("M330,327 Q324,332 330,339 C313,353 334,355 339,344");
        gc.fill();
        gc.stroke();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
