package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    
    @Override
    public void start(Stage window){
        
        Label name = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button startButton = new Button("Start");
        
        // First view
        GridPane gridPane = new GridPane();
        gridPane.add(name, 0, 0);
        gridPane.add(textField, 0, 1);
        gridPane.add(startButton, 0, 2);
        
        // Second view
        BorderPane borderPane = new BorderPane();
        Label label = new Label("");
        borderPane.setCenter(label);
        
        Scene first = new Scene(gridPane);
        Scene second = new Scene (borderPane);
        
        startButton.setOnAction((event) -> {
            String input = textField.getText();
            label.setText("Welcome " + input + "!");
            window.setScene(second);
        });
        
        window.setScene(first);
        window.show();
        
        
    }


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
