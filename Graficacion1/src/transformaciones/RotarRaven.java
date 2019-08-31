package transformaciones;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
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

public class RotarRaven extends Application
{
	public void start(Stage primaryStage)
	{
		Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChicoBestia");
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
        rotar.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        rotar.setOnAction((ActionEvent event) ->{
        	rotate.play();
        });
        ToggleButton transladar=new ToggleButton("Transladar");
        transladar.setPrefSize(120, 20);
        transladar.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        transladar.setOnAction((ActionEvent event) ->{
        	translate.play();
        });
        ToggleButton detenerRotacion=new ToggleButton("Detener rotacion");
        detenerRotacion.setPrefSize(120, 20);
        detenerRotacion.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        detenerRotacion.setOnAction((ActionEvent event) ->{
        	rotate.stop();
        });
        ToggleButton detenerTranslacion=new ToggleButton("Detener translacion");
        detenerTranslacion.setPrefSize(120, 20);
        detenerTranslacion.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        detenerTranslacion.setOnAction((ActionEvent event) ->{
        	translate.stop();
        });
        ToggleButton escalar=new ToggleButton("Escalar");
        escalar.setPrefSize(120, 20);
        escalar.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        escalar.setOnAction((ActionEvent event) ->{
        	scale.play();
        });
        
        vbox.getChildren().addAll(rotar,transladar,detenerRotacion,detenerTranslacion,escalar);
        root.getChildren().add(vbox);
        
	}
	
	public void drawShapes(GraphicsContext gc)
	{
		 //ContornoRostro
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.DARKSLATEBLUE);
        gc.beginPath();
        gc.appendSVGPath("M 146 160 C 168 150 150 42 195 32"
                + "L 195, 32 Q 230 20 264 52"
                + "L 264 52 C 280 70 275 109 293 107"
                + "L 293 107 Q 290 115 286 116"
                + "L 280 116 Q 287 158 300 154"
                + "L 300 154 Q 257 210 201 216"
                + "L 201 216 Q 168 201 146 160");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
           gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.PURPLE);
        gc.beginPath();
        gc.appendSVGPath("M 260 60 Q 280 94 280 116");
       // gc.closePath();
        //gc.fill();
        gc.stroke();
        
        //Cara
           gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 160 166 Q 174 105 189 75"
                + "L 189 75 Q 191 98 208 124"
                + "L 208 124 Q 212 109 239 82"
                + "L 239 82 Q 275 140 271 172"
                + "L 271 172 Q 196 240 161 166");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        
        //Barba
           gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        gc.beginPath();
        gc.appendSVGPath("M 185 188 Q 191 169 203 162"
                + "L 203 162 207 166"
                + "L 207 166 213 161"
                + "L 213 161 Q 226 163 237 190"
                + "L 237 190 Q 210 208 185 188");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Boca 
           gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 202 175 Q 206 170 217 174");
       // gc.closePath();
        //gc.fill();
        gc.stroke();
        
         //Ojo Izquierdo 
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        gc.beginPath();
        gc.appendSVGPath("M 172 149 L 204 150"
                + "L 204 150 Q 189 180 172 149");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
         //Ojo Derecho
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        gc.beginPath();
        gc.appendSVGPath("M 216 150 L 253 150"
                + "L 253 150 Q 235 180 216 150");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Ojo Izquierdo Pupila Morada
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLUEVIOLET);
        gc.beginPath();
        gc.appendSVGPath("M 185 150 L 202 150"
                + "L 202 150 Q 193 165 185 149");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Ojo Izquierdo Pupila Negra
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 188 150 L 199 150"
                + "L 199 150 Q 193 158 188 150");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Ojo Derecho Pupila Morada
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLUEVIOLET);
        gc.beginPath();
        gc.appendSVGPath("M 219 150 L 233 150"
                + "L 233 150 Q 227 165 219 150");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Ojo Derecho Pupila Negra
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M 221 150 L 231 150"
                + "L 231 150 Q 227 158 221 150");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Cuerpo
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.DARKSLATEBLUE);
        gc.beginPath();
        gc.appendSVGPath("M 198 215 Q 180 370 183 408"
                + "L 183 408 Q 180 430 262 408"
                + "L 262 408 Q 238 353 232 210"
                + "L 232 209 Q 199 220 198 215");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
         //Broche amarillo
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.YELLOW);
        gc.beginPath();
        gc.appendSVGPath("M 206 216 Q 203 230 212 237"
                + "L 212 237 Q 220 231 218 215");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Broche Rojo
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        gc.beginPath();
        gc.appendSVGPath("M 209 215 Q 206 224 209 227"
                + "L 209 227 Q 218 228 212 215");
       // gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Curva Central
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        gc.beginPath();
        gc.appendSVGPath("M 215 234 Q 211 373 227 415");
       // gc.closePath();
        //gc.fill();
        gc.stroke();
        
        //Curva Central 2
        gc.setLineWidth(1.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        gc.beginPath();
        gc.appendSVGPath("M 216 234 C 215 255 226 293 227 329");
       // gc.closePath();
        //gc.fill();
        gc.stroke();
        
        //Curva Centra 3
        gc.setLineWidth(1.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.RED);
        gc.beginPath();
        gc.appendSVGPath("M 218 229 Q 220 233 229 267 ");
       // gc.closePath();
        //gc.fill();
        gc.stroke();
        
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
