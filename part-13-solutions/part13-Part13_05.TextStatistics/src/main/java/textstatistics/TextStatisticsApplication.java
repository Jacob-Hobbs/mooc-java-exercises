package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window) {
        BorderPane borderPane = new BorderPane();
        
        TextArea textArea = new TextArea();
        
        borderPane.setCenter(textArea);
        
        HBox horizontalBox = new HBox();
        horizontalBox.getChildren().add(new TextField("Letters: 0"));
        horizontalBox.getChildren().add(new TextField("Words: 0"));
        horizontalBox.getChildren().add(new TextField("The longest word is:"));
        
        borderPane.setBottom(horizontalBox);
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
