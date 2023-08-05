package smiley;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {
        
        
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        
        drawSmileyFace(painter);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(canvas);
        
        
        
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
    }
    
    public void drawSmileyFace(GraphicsContext painter) {
        
        painter.setFill(Color.BLACK);
        painter.fillRect(70, 60, 25, 25);
        painter.fillRect(200, 60, 25, 25);
        painter.fillRect(75, 200, 150, 25); 
        painter.fillRect(75, 175, 25, 25); 
        painter.fillRect(200, 175, 25, 25);
              
    }
    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
