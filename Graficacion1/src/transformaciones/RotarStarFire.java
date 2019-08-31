package transformaciones;

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
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class RotarStarFire extends Application
{
	public void start(Stage primaryStage)
	{
		Group root = new Group();
        Canvas canvas = new Canvas(700, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 600, 600, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("StarFire");
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
        rotar.setStyle("-fx-background-color: rgb(173, 146, 183); -fx-text-fill: white;");
        rotar.setOnAction((ActionEvent event) ->{
        	rotate.play();
        });
        ToggleButton transladar=new ToggleButton("Transladar");
        transladar.setPrefSize(120, 20);
        transladar.setStyle("-fx-background-color: rgb(226, 40, 112); -fx-text-fill: white;");
        transladar.setOnAction((ActionEvent event) ->{
        	translate.play();
        });
        ToggleButton detenerRotacion=new ToggleButton("Detener rotacion");
        detenerRotacion.setPrefSize(120, 20);
        detenerRotacion.setStyle("-fx-background-color: rgb(173, 146, 183); -fx-text-fill: white;");
        detenerRotacion.setOnAction((ActionEvent event) ->{
        	rotate.stop();
        });
        ToggleButton detenerTranslacion=new ToggleButton("Detener translacion");
        detenerTranslacion.setPrefSize(120, 20);
        detenerTranslacion.setStyle("-fx-background-color: rgb(226, 40, 112); -fx-text-fill: white;");
        detenerTranslacion.setOnAction((ActionEvent event) ->{
        	translate.stop();
        });
        ToggleButton escalar=new ToggleButton("Escalar");
        escalar.setPrefSize(120, 20);
        escalar.setStyle("-fx-background-color: rgb(204, 26, 150); -fx-text-fill: white;");
        escalar.setOnAction((ActionEvent event) ->{
        	scale.play();
        });
        
        vbox.getChildren().addAll(rotar,transladar,detenerRotacion,detenerTranslacion,escalar);
        root.getChildren().add(vbox);
        
	}
	
	public void drawShapes(GraphicsContext gc)
	{

        //CABELLO
        gc.setStroke(Color.BLACK);
        gc.setFill( Color.rgb(226, 40, 112));
        gc.beginPath();
        gc.appendSVGPath("M510,248 L559,396 L565,447 L564,494 L521,548, L453,582 L392,589"
                //PICO
                + "Q390,587 367,580 L400,565 Q331,569 309,555 L335,553"
                + "Q345,553 357,547 L338,546 L315,547 Q306,546 288,529"
                + "L315,527 L335,517 L356,491 L359,441 L312,315 L316,175"
                + "L325,144 L336,116 L365,61 L382,42 L438,43 L490,73"
                + "L496,184"  );
                //MECHON
        gc.appendSVGPath("M393,168 L407,268 L403,293 L402,332 "
                + "Q403,337 405,352 L389,339 L379,304 Q380,300 379,287"
                + "L375,288 Q375,300 373,318 L367,287 L381,246 "
                + "L388,216 L387,175"); 
        //gc.appendSVGPath("M507,255 L521,316 Q522,326 521,340 L539,314 L539,295 L ");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //MECHON DERECHO Y FLECO
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(226, 40, 112));
        gc.beginPath();
        gc.appendSVGPath("M507,255 L521,316 Q522,326 521,340 L539,314 L539,295"
                + "Q537,292 534,284 Q540,289 544,291 L546,280 L543,267 "
                + "L527,240");
        gc.appendSVGPath("M538,63 L536,74 L530,88 L513,115  "
                + "L472,76 L484,47 L512,49Z ");
        //IZQUIERDO
        gc.appendSVGPath("M473,75 L452,38 L440,40 L407,60 L390,81 L392,85 "
                + "L402,99 L447,125 ");
        gc.closePath();
        gc.fill();
        gc.stroke();
       
        //PARPADO2
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M552,96 L561,112 L560,117 L551,127 L558,125 L561,122 L566,128"
                +"L563,131 L563,135  L547,136 L548,142 L501,152 L502,116 L534,114 L543,124"
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
      
        //OJO2
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(147, 237, 165));
        gc.beginPath();
        gc.appendSVGPath("M500,151 L510,205 L551,192 L550,140 L533,129 L505,151 ");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        // Cabeza
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(232, 173, 139));
        gc.beginPath();
        gc.appendSVGPath(
                //"M 394, 207 Q 409, 226 462, 232 L 507, 202 Q 190 200 172, 180"
                          "M 429,116 L 419,92 L 418,106 L 403,99"
        		//+ "L 507, 180 Q 160, 185 155, 163 L 155, 163 Q 205, 10 265, 133z"
                                  +"L403,99 L394,128 L408,140 "
                                  //OJO 1
                                  + "L432,121 L443,125 L469,151 L471,190 L467,196 L449,201"
                                   + " L 410,178 L404,162 L402,151   "
                                   //Cachete derecho
                                   +"L392,154 L402,212 L412,236 L432,250 "
                                   //Barbilla
                                //  +"M443,254 C,486,271 539,235 502,268"
                                  // +"Q 510,197 505,150 T396,135" 
                                   +"L496,267"
                                  //+ " L508,205 "
                                  +"L534,236"
                                  +"L552,216"
                                  +"L560,202"
                                  //+ "L562,184Z "
                                   +"L556,136"
                               //OJO2
          +"L547,137 L551,173 L537,195 L524,199 L510,194 L503,152 L521,116 L532,116 L537,122 L543,122"
                //FRENTE
                +"L542,118 L526,94 L511,108 L514,84 L492,66 L 482,76 L475,76 L445,63 L432,78 L429,89"
                                  + " L446,115"
                        );
        //OREJA 
        gc.appendSVGPath("M387,215 L370,215 L355,189 L360,165 L386,178");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        
        //OJO1
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(147, 237, 165));
        gc.beginPath();
        gc.appendSVGPath("M 404,159 L408,178 L430,194 L441,201 L458,202 L467,196 L472,187 L469,153 "
                          + "L434,134 L405,158 "
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //PARPADO1
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M469,153 L434,134 L405,158 L402,151 L384,151  L383,145"
                +"L400,145 L380,128 L379,124 L384,114 L409,139 L427,120 L444,125 L468,150"
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        
        //CUELLO
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(232, 173, 139));
        gc.beginPath();
        gc.appendSVGPath("M454,257 L459,277 L473,272 L472,262 ");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //PUPILAS
        gc.setFill(Color.rgb(35, 209, 70));
        gc.fillOval(434, 152, 25, 40);
        gc.setFill(Color.BLACK);
        gc.strokeOval(434, 152, 25, 40);
        
        gc.setFill(Color.rgb(35, 209, 70));
        gc.fillOval(507, 152, 25, 40);
        gc.setFill(Color.BLACK);
        gc.strokeOval(507, 152, 25, 40);
        
        gc.setFill(Color.BLACK);
        gc.fillOval(436, 157, 20,30);
        
        gc.setFill(Color.BLACK);
        gc.fillOval(510,157,20,30);
        
        gc.setFill(Color.rgb(242, 244, 242));
        gc.fillOval(507, 152, 10, 15);
        gc.setFill(Color.BLACK);
        gc.strokeOval(507, 152, 10,15);
        
        gc.setFill(Color.rgb(242, 244, 242));
        gc.fillOval(434, 152, 10, 15);
        gc.setFill(Color.BLACK);
        gc.strokeOval(434, 152, 10, 15);
        
        
        //MANOS
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(232, 173, 139));
        gc.beginPath();
        gc.appendSVGPath(" M466,312 L455,308 L430,372 L405,448 L433,470 "
                        + "L430,451 L436,446 L438,454 L442,455 L442,438"
                        + "L443,395 L460,325 "
                //CINTURA
                + "L462,365 L453,422 L451,444 L464,446 L465,423 L477,422 L475,450 L487,447 "
                + "L489,421 L488,369 L484,360 L479,331 "
                //brazo 
                + "L491,331 L530,444 L526,458 L507,472 L502,468 L507,459"
                + "L502,442 L495,454 L495,439 L500,430 L496,395 L491,369"
               
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //BRAZALETES
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(173, 146, 183));
        gc.beginPath();
        gc.appendSVGPath("M433,374 L419,371 L403,412 L401,445 L419,449 L435,437"
                + "L443,438 L446,400 L434,389Z"
        );
        gc.appendSVGPath("M510,368 L531,414 L532,443 L514,441 L506,429 L495,429 L490,397 L499,394"
                + "L501,376"
        );
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //VESTIDO
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(144, 7, 198));
        gc.beginPath();
        gc.appendSVGPath("M469,311 L461,319 L458,342 L485,343 L492,332 L493,310 ");
        gc.appendSVGPath("M457,380 L492,382 L500,422 L489,421 L469,426 L459,421 L442,416 "); 
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //TRAJE
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(173, 146, 183));
        gc.beginPath();
        gc.appendSVGPath("M455,280 L455,300 L451,305 L453,307 L468,312 L476,320 "
                       +"L490,317 L494,300 L480,287 L477,270"
               
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //ZAPATO1
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(173, 146, 183));
        gc.beginPath();
        gc.appendSVGPath(
                 "M405,653 L398,667 L397,676 L414,680 L433,680 L452,676 L450,657"
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //ZAPATO2
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(173, 146, 183));
        gc.beginPath();
        gc.appendSVGPath(
                 "M467,644 L468,672 L483,673 L497,679 L510,681 L532,676 L521,653"
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //BOTAS
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(144, 7, 198));
        gc.beginPath();
        gc.appendSVGPath("M450,463 L441,517 L426,587 L403,652"
               // + " C403,651 452,652 421,681 "
                + "L412,668 L426,668 L451,657 L455,610  L461,464"
        		);
        //2DA
        gc.appendSVGPath("M474,464 L466,589 L465,645 L507,669 L526,661 L507,622 L506,611"
                         + "L489,553 L485,520 L485,464"
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();       
        
        //PARTE GRIS BOTA
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(173, 146, 183));
        gc.beginPath();
        gc.appendSVGPath("M450,464 L451,443 L465,445 L462,465Z ");
        gc.appendSVGPath("M475,449 L475,464 L484,464 L487,445Z ");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //CINTURON
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(173, 146, 183));
        gc.beginPath();
        gc.appendSVGPath("M458,380 L492,381 L489,370 L462,366 ");
        gc.closePath();
        gc.fill();
        gc.stroke();
        gc.fillOval(468, 365, 15, 30);
        gc.setFill(Color.BLACK);
        gc.strokeOval(468,365, 15, 30);
        
        //BOCA
        gc.setLineWidth(2);
        gc.strokeLine(500, 221, 478,219 );
        gc.strokeLine(469,213, 481,219 );
        gc.strokeArc( 498, 194,8,9,-85,191, ArcType.OPEN);
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
