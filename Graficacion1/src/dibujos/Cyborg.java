/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author jona_
 */
public class Cyborg extends Application
{
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 500, 500, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CyborgBB");
        primaryStage.show();
        
        
        gc.beginPath();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("a1a2b4"));
        //Oreja derecha
        gc.appendSVGPath("M297,110 C306,103 306,84 292,83");
        //Cosa izquierda hombro
        gc.appendSVGPath("M99,175 L91,165 96,156 104,162");
        //Cosa derecha hombro
        gc.appendSVGPath("M395,179 L404,166 398,157 389,163");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        //Oreja izquierda
        gc.beginPath();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("a1674f"));
        gc.appendSVGPath("M195,108 C186,99 188,83 202,82");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        gc.beginPath();
        gc.setLineWidth(2.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("a1a2b4"));
        //Silueta
        gc.appendSVGPath("M299,145 Q314,147 334,153 358,149 382,151 C401,154 400,219 383,226"
                + "         L372,226 377,243 Q380,240 384,240 395,284 385,327 C384,338 376,361 371,364"
                + "         Q368,367 362,368 Q357,370 351,368 Q347,368 340,366 Q344,348 343,334"
                + "         Q338,341 335,350 Q326,350 321,344 Q326,332 332,324 L325,321 Q324,294 330,268"
                + "         L332,266 333,229 327,243 Q312,254 298,259 Q293,281 284,297 Q281,300 276,303"
                + "         L286,349 Q290,352 287,367 Q298,387 305,417 Q313,426 316,437 L319,438 "
                + "         Q324,452 325,465 L312,466 310,460 301,460 300,467 285,468 285,462 272,461"
                + "         271,467 254,467 255,457 Q250,411 259,372 L260,309 Q246,310 234,308 L234,372 "
                + "         Q242,411 239,458 L238,467 222,468 221,462 208,463 207,467 193,467 192,462"
                + "         183,459 180,466 166,464 172,440 175,438 Q182,420 186,416 Q194,389 205,367"
                + "         Q203,352 208,349 L217,305 Q213,303 210,301 Q199,282 192,258 Q181,252 170,245"
                + "         L160,225 159,264 164,265 Q170,294 168,320 L161,324 Q167,331 171,346 "
                + "         Q167,349 159,350 Q154,339 149,333 Q148,349 153,364 Q149,367 144,367 Q136,369 130,367"
                + "         Q123,364 118,358 Q111,344 112,328 L110,327 Q99,287 110,240 L116,241 123,224 112,226"
                + "         C97,215 93,159 109,149 Q143,147 164,152 Q178,147 193,144 L195,128 194,124 Q192,119 193,110 "
                + "         Q197,84 208,63 Q211,57 220,53 Q246,50 273,54 Q280,56 284,62 Q293,80 300,105 Q301,116 300,119 L297,128Z");
        
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setFill(Color.valueOf("28626e"));
        //Cerebro
        gc.appendSVGPath("M199,87 H289 Q285,71 280,62 Q277,58 271,56 Q248,54 223,57 Q213,59 209,62 Q204,69 199,87");
        gc.closePath();
        gc.fill();
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("a1674f"));
        //Cara
        gc.appendSVGPath("M279,152 Q272,155 262,155 Q260,146 256,138 H237 Q231,146 229,155 Q218,154 212,152 Q208,151 206,148 Q198,135 191,118 Q194,97 201,84 C208,80 212,73 212,57 "
                + "         Q228,51 245,53 V91 Q268,91 287,97 Q285,124 279,152");
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.BLACK);
        
        //Pierna izquierda
        gc.appendSVGPath("M218,305 Q225,307 233,308 L234,371 Q230,367 226,365 C228,362 229,353 226,351 Q219,347 208,348Z");
        //Pierna derecha
        gc.appendSVGPath("M276,302 Q269,307 261,309 L258,373 Q262,366 266,364 C263,358 263,351 268,350 Q278,348 285,349Z"); 
        //Brazo izquierdo
        gc.appendSVGPath("M161,204 Q158,205 157,206 L151,217 Q135,223 124,224 L114,247 133,275 159,271Z");
        //Brazo derecho
        gc.appendSVGPath("M331,205 Q334,205 337,207 L344,218 Q357,223 372,226 L381,252 358,278 334,273Z");
        //Torzo izquierdo
        gc.appendSVGPath("M224,282 Q210,280 197,275 Q195,266 193,257 Q202,260 210,261 L214,256 Q217,269 224,282");
        //Torzo derecho
        gc.appendSVGPath("M269,281 Q281,279 293,275 Q296,267 298,259 Q291,261 285,261 L281,255 Q276,269 269,281");
        //Detalle bota izquierda
        gc.appendSVGPath("M239,457 242,444 242,431 L234,424 231,431 231,440 234,440Z");
        //Detalle bota derecha
        gc.appendSVGPath("M254,456 251,444 251,431 L258,426 262,431 261,440 258,440Z");
        //Ceja izquierda
        gc.appendSVGPath("M219,65 Q215,66 218,61 Q 226,57 237,57 V62 Q229,62 219,65");
        //Ceja derecha
        gc.appendSVGPath("M274,65 Q276,66 273,62 Q266,58 256,58 V64 Q265,62 274,65");
        
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        
        //Brazo izquierdo
        gc.appendSVGPath("M163,264 Q150,268 135,269 Q129,259 126,249 Q118,243 111,239 Q100,287 109,326 Q138,328 167,320 Q168,293 163,264");
        //Brazo derecho
        gc.appendSVGPath("M330,266 Q344,269 360,269 Q366,258 371,247 Q379,241 384,241 Q394,283 385,325 Q353,329 325,320 Q325,295 330,266");
        //Pectoral izquierdo
        gc.appendSVGPath("M227,245 Q218,249 211,261 Q188,257 169,243 L160,222 161,204 Q167,205 172,208 Q176,195 175,184 Q189,191 211,197"
                + "         Q211,214 227,245");
        //Pectoral derecho
        gc.appendSVGPath("M263,243 Q279,249 285,260 Q299,260 326,245 L333,228 331,205 Q327,205 323,209 Q318,197 318,183 Q299,193 279,198"
                + "         Q278,211 263,243");
        //Pierna izquierda
        gc.appendSVGPath("M242,431 Q240,402 236,376 L227,364 222,372 208,371 205,367 Q194,390 188,416 L219,419 Q226,423 230,431 L235,425Z");
        gc.appendSVGPath("M230,441 C232,427 230,423 219,419 L188,416 Q179,425 176,438 Q201,444 230,441");
        //Pierna derecha
        gc.appendSVGPath("M251,431 Q252,403 258,372 L266,364 271,372 284,370 287,366 Q297,390 303,416 L271,421 Q266,423 263,433 L258,425Z");
        gc.appendSVGPath("M262,440 Q264,427 269,421 L303,416 Q312,424 316,439 Q294,446 263,440");
        //Ojo
        gc.fillOval(214,71,23,23);
        gc.strokeOval(214,71,23,23);
        
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setFill(Color.valueOf("28626e"));
        //Detalle brazo izquierdo
        gc.appendSVGPath("M119,310 Q121,284 119,246 L114,243 117,246 117,254 116,247 112,245 Q106,279 109,310 Q114,312 119,310");
        //Detalle brazo derecho
        gc.appendSVGPath("M375,311 Q373,279 375,248 L383,245 381,248 383,247 Q389,278 386,311 Q381,311 375,311");
        gc.fill();
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.valueOf("e20247"));
        //Ojo rojo
        gc.fillOval(252,71,23,23);
        gc.strokeOval(252,71,23,23);
        
        gc.closePath();
        gc.fill();
        gc.stroke();
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setStroke(Color.BLACK);
        //Boca
        gc.appendSVGPath("M214,100 Q245,112 273,101");
        //Nariz
        gc.appendSVGPath("M236,96 C235,98 238,100 241,99 C242,101 245,101 248,99 C251,99 254,97 252,95");
        //Menton
        gc.appendSVGPath("M229,155 Q245,156 261,155");
        //Papada
        gc.appendSVGPath("M218,154 Q245,168 272,154");
        //Cuello
        gc.appendSVGPath("M194,144 L194,156 Q213,166 235,171 Q246,173 261,170 Q281,164 298,157 L298,143");
        //Hombro izquierdo
        gc.appendSVGPath("M162,203 Q167,204 171,209 Q176,186 174,163 Q173,158 164,153");
        //Centro
        gc.appendSVGPath("M227,245 Q245,248 263,244");
        gc.appendSVGPath("M211,197 Q212,188 220,184 Q244,179 274,185 Q279,188 279,197");
        gc.strokeLine(246,248,246,292);
        gc.appendSVGPath("M225,282 L229,283 Q232,290 237,292 Q246,292 258,292 Q262,290 265,283 L270,281");
        gc.appendSVGPath("M224,240 Q209,247 203,259");
        gc.appendSVGPath("M266,238 Q283,245 290,259");
        //Hombro derecho
        gc.appendSVGPath("M331,205 Q328,206 323,210 Q316,186 320,164 Q322,159 332,154");
        //Tuerca izquierda
        gc.appendSVGPath("M122,168 L128,176 122,182 114,181 113,173Z");
        //Tuerca derecha
        gc.appendSVGPath("M371,169 L380,175 380,182 371,185 366,178Z");
        //Cosa
        gc.appendSVGPath("M280,152 Q286,152 297,128");
        //Dedos izquierda
        gc.appendSVGPath("M116,336 Q117,349 121,360");
        gc.appendSVGPath("M123,336 Q124,351 128,366");
        gc.appendSVGPath("M134,336 Q133,351 138,367");
        //Dedos derecha
        gc.appendSVGPath("M359,336 Q360,352 353,368");
        gc.appendSVGPath("M370,337 Q369,350 362,367");
        gc.appendSVGPath("M378,338 Q377,351 371,363");
        
        //Mas detalles izquierda
        gc.appendSVGPath("M106,311 Q135,313 169,306");
        gc.appendSVGPath("M107,316 Q135,319 169,311");
        gc.appendSVGPath("M119,312 Q123,285 121,245");
        //Mas detalles derecha
        gc.appendSVGPath("M325,307 Q357,315 388,311");
        gc.appendSVGPath("M325,312 Q356,320 388,316");
        gc.appendSVGPath("M374,312 Q371,285 374,246");
        gc.stroke();
        
        
        gc.beginPath();
        gc.setLineWidth(1.0);
        gc.setFill(Color.BLACK);
        //Pupila
        gc.fillOval(224,77,6,10);
        gc.closePath();
        gc.fill();
        
        
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
