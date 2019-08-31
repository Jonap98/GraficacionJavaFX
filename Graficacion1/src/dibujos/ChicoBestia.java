package dibujos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChicoBestia extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 600, 600, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CHICO BESTIA");
        primaryStage.show();
        
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(67, 99, 51));
        gc.beginPath();
        gc.appendSVGPath("M185,124 Q185,111 188,99 "
        		+ "L188,99 Q185,93 174,91"
        		+ "L174,91 Q176,87 186,90"
        		+ "L186,90 Q186,83 177,76"
        		+ "L177,76 Q182,73 190,82"
        		+ "L190,82 Q197,69 201,68"
        		+ "L201,68 Q197,77 198,81"
        		+ "L198,81 C271,90 290,42 350,83"
        		+ "L350,83 Q320,80 313 87"
        		+ "L313,87 Q345,95 345,98"
        		+ "L345,98 Q320,95 310,100"
        		+ "L310,100 Q335,105 335,107"
        		+ "L335,107 Q305,108 280,105"
        		+ "L280,105 Q302,115 302,120"
        		+ "L302,120 C243,105 207,100 203,111"
        		+ "L203,111 Q206,108 218,111"
        		+ "L218,111 Q202,122 203,146"
        		+ "L203,146 Q194,129 185,124");
        gc.closePath();
        gc.fill();
        gc.stroke();
       //CARA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(105, 214, 51));
        gc.beginPath();
        gc.appendSVGPath("M203,146 C194,129 185,121 140,110"
        		+ "L140,110 C 176,151 159,168 164,171"
        		+ "L164,171 Q165,182 174,181"
        		+ "L174,181 Q183 182 184,182"
        		+ "L184,182 Q197,179 200,174"
        		+ "L198,175 Q196,187 216,195"
        		+ "L216,195 Q264,201 309,196"
        		+ "L309,196 Q330,190 328,179"
        		+ "L328,179 Q335,151 320,107"
        		+ "L320,107 284,107"
        		+ "L280,105 Q302,115 302,118"
        		+ "L302,120 C243,105 207,100 203,111"
        		+ "L203,111 Q206,108 218,111"
        		+ "L218,111 Q202,122 203,146"
        		);
        gc.closePath();
        gc.fill();
        gc.stroke();
        //OREJA IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(105, 214, 51));
        gc.beginPath();
        gc.appendSVGPath("M328,132 Q339,117 368,104"
        		+ "L368,104 C325,150 360,170 343,174"
        		+ "L343,174 Q335,179 329,174");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //DETALLE OREJA IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.LIGHTGREEN);
        gc.beginPath();
        gc.appendSVGPath("M338,123 329,140");
        gc.closePath();
        //gc.fill();
        gc.stroke();
        
      //DETALLE OREJA DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(105, 214, 51));
        gc.beginPath();
        gc.appendSVGPath("M173,120 186,138"
        		+ "L186,138 Q178,157 196,166");
        //gc.closePath();
        //gc.fill();
        gc.stroke();
        
        //CEJA IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M221,128 238,125 256,125"
        		+ "L256,129 257,132"
        		+ "L257,132 Q236,129 221,132"
        		+ "L221,132 221,128");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
      //CEJA DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M286,125 Q296,120 316,130"
        		+ "L316,130 316,135"
        		+ "L316,135 300,132 284,132"
        		+ "L284,132 286,125");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //OJOS
        gc.setFill(Color.WHITE);
        //Cambiar a partir de este metodo el grosor de las lineas a 5 puntos
        gc.setLineWidth(1);
        gc.fillOval(222, 140, 31, 35);
        gc.fillOval(287, 140, 31, 35);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //PUPILA NEGRA
        gc.setFill(Color.BLACK);
        //Cambiar a partir de este metodo el grosor de las lineas a 5 puntos
        gc.setLineWidth(1);
        gc.fillOval(233, 149, 16, 20);
        gc.fillOval(291, 149, 16, 20);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
      //PUPILA BLANCA
        gc.setFill(Color.WHITE);
        //Cambiar a partir de este metodo el grosor de las lineas a 5 puntos
        gc.setLineWidth(1);
        gc.fillOval(233, 155, 6, 10);
        gc.fillOval(291, 155, 6, 10);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
      //NARIZ
        gc.setFill(Color.BLACK);
        //Cambiar a partir de este metodo el grosor de las lineas a 5 puntos
        gc.setLineWidth(2);
        gc.fillOval(265, 163, 4, 7);
        gc.fillOval(274, 163, 4, 7);
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //BOCA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M231,180 Q274,190 313,180");
       // gc.closePath();
       // gc.fill();
        gc.stroke();
        
        //DIENTE
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.WHITE);
        gc.beginPath();
        gc.appendSVGPath("M296,178  294,182"
        		+ "L294,182 300,181");
        gc.closePath();
       gc.fill();
        gc.stroke();
        
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M237,197 Q239,205 246,204"
        		+ "L246,204 246,207"
        		+ "L246,207 Q222,234 224,264"
        		+ "L224,264 Q230,268 238,269"
        		+ "L238,269 Q236,234 252,214"
        		+ "L252,214 248,241"
        		+ "L248,241 258,244"
        		+ "L258,244 262,207"
        		+ "L262,207 280,208"
        		+ "L280,208 281,244"
        		+ "L281,244 289,242"
        		+ "L289,242 290,257"
        		+ "L290,257 287,258"
        		+ "L287,258 288,263"
        		+ "L288,263 301,259"
        		+ "L301,259 Q297,232 287,207"
        		+ "L287,207 287,203"
        		+ "L287,203 Q289,208 295,199");       
        gc.closePath();        
        gc.fill();
        gc.stroke();
        //CINTURON IZQUIERDO
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M260,245 245,242"
        		+ "L245,242 245,256"
        		+ "L245,256 261,259"
        		+ "L261,259 260,245");         
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //CINTURON IZQUIERDO DETALLE
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M253,244 253,259");         
        gc.closePath();          
       // gc.fill();
        gc.stroke();
        
      //CINTURON DERECHO
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M288,242 277,245"
        		+ "L277,245 277,259"
        		+ "L277,259 290,258"
        		+ "L290,258 288,242");         
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //CINTURON DERECHO DETALLE
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M284,244 284,259");         
        gc.closePath();          
       // gc.fill();
        gc.stroke();
        
     
        
      //PECHO MORADO
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(204, 26, 150));
        gc.beginPath();
        gc.appendSVGPath("M246,257 246,264"
        		+ "L246,264 252,266"
        		+ "L252,266 250,275"
        		+ "L250,275 260,277"
        		+ "L260,277 261,269"
        		+ "L261,269 271,270"
        		+ "L271,270 271,277"
        		+ "L271,277 280,277"
        		+ "L280,277 280,268"
        		+ "L280,268 288,263"
        		+ "L288,263 288,259"
        		+ "L290,258 277,259"
        		+ "L277,245 277,259"
        		+ "L277,259 276,244"
        		+ "L276,244 281,244"
        		+ "L281,244 278,207"
        		+ "L278,207 255,207"
        		+ "L255,207 256,244"
        		+ "L256,244 262,244"
        		+ "L262,244 262,260");         
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
        //BOLA CINTURON
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.fillOval(265, 248, 6, 10);        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //PIERNA IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M256,276 259,278"
        		+ "L259,278 253,320"
        		+ "L253,320 233,318"
        		+ "L233,318 250,276"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //PIERNA DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M271,278 280,277"
        		+ "L280,277 280,318"
        		+ "L280,318 287,319"
        		+ "L287,319 273,324"
        		+ "L273,324 276,332"
        		+ "L276,332 275,333"
        		+ "L275,333 262,324"
        		+ "L262,324 271,278"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //PIERNA IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(204, 26, 150));
        gc.beginPath();
        gc.appendSVGPath("M228,319 Q243,315, 256,322"
        		+ "L256,322 252,331"
        		+ "L252,331 Q240,324 230,331"
        		+ "L230,331 228,319"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //PIERNA IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M230,331 Q221,338  219,355"
        		+ "L219,355 257,355"
        		+ "L257,355 Q258,330 252,332"
        		+ "L252,331 Q240,324 230,331"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //PIERNA IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(3.5);
        gc.setStroke(Color.rgb(204, 26, 150));
        gc.setFill(Color.rgb(204, 26, 150));
        gc.beginPath();
        gc.appendSVGPath("M223,343 Q239,329 255,344"); 
        
        //gc.closePath();          
        //gc.fill();
        gc.stroke();
        
      
        
        
        //PIERNA DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M261,325 260,345"
        		+ "L260,345 282,352"
        		+ "L282,352 Q298,355 308,349"
        		+ "L308,349 Q303,333 292,328"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
        
      //PIERNA DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(204, 26, 150));
        gc.beginPath();
        gc.appendSVGPath("M295,319 274,324"
        		+ "L274,324 277,333"
        		+ "L277,333 Q284,326 292,328"
        		+ "L292,328 295,319"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //PIERNA DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.rgb(204, 26, 150));
        gc.beginPath();
        gc.appendSVGPath("M262,324 273,330"
        		+ "L273,330 275 332"
        		+ "L275,332 273,334"
        		+ "L273,334 281,341"
        		+ "L281,341 295,333"
        		+ "L295,333 300,338"
        		+ "L300,338 Q290,338 288,345"
        		+ "L288,345 262,336"
        		+ "L262,336 262,324"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //MANO IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M219,263 Q230,271 242,270"
        		+ "L242,270 243,277"
        		+ "L243,277 238,279"
        		+ "L238,279 223,280"
        		+ "L223,280 219,277"
        		+ "L219,277 219,263"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke(); 
        
      //MANO IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M241,278 253,290"
        		+ "L253,290 248,298"
        		+ "L248,298 241,287"
        		+ "L241,287 Q237,302 246,304"
        		+ "L246,304 Q227,316 217,306"
        		+ "L217,306 Q213,291 223,280"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke(); 
        
        //MANO IZQUIERDA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M236,280 Q239,284 237,292"
        		+ "L237,292 Q227,286 219,289"
        		+ "L219,289 223,281"
        		+ "L223,281 236,280"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //MANO IZQUIERDA DETALLE 1
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M224,289 Q218,297 220,308");        
        //gc.closePath();          
        //gc.fill();
        gc.stroke(); 
        
      //MANO IZQUIERDA DETALLE 2
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M229,289 Q224,300 226,311");        
        //gc.closePath();          
        //gc.fill();
        gc.stroke(); 
        
        //MANO IZQUIERDA DETALLE 3
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        gc.beginPath();
        gc.appendSVGPath("M234,291 Q232,301 235,312");        
        //gc.closePath();          
        //gc.fill();
        gc.stroke(); 
        
      //MANO DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M305,258 Q299,262 289,263"
        		+ "L289,263 282,267"
        		+ "L282,267 287,272"
        		+ "L287,272 305,273"
        		+ "L305,273 305,258"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //MANO DERECHA
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M302,272 Q309,285 307,299"
        		+ "L307,299 Q293,307 280,297"
        		+ "L280,297 280,285"
        		+ "L280,285 286,280"
        		+ "L286,280 286,272"); 
        
        gc.closePath();          
        gc.fill();
        gc.stroke();
        
      //MANO DERECHA DETALLE 1
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M303,283 303,293"
        		+ "L303,293 Q297,297 292,296"
        		+ "L292,296 296,284"
        		+ "L296,284 Q291,279 294,276"); 
        
        //gc.closePath();          
        //gc.fill();
        gc.stroke();
        
      //MANO DERECHA DETALLE 2
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M297,296 Q298,299 295,302"); 
        
        //gc.closePath();          
        //gc.fill();
        gc.stroke();
        
      //MANO DERECHA DETALLE 3
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M292,288 Q289,294 285,300");
        
      //gc.closePath();          
        //gc.fill();
        gc.stroke();
        
      //MANO DERECHA DETALLE 4
        primaryStage.show();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GRAY);
        gc.beginPath();
        gc.appendSVGPath("M288,285 280,293");
        
      //gc.closePath();          
        //gc.fill();
        gc.stroke();
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    } 
}

