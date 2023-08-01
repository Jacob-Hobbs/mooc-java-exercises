package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    
    @Override 
    public void start(Stage window) {
        
        VBox verticalBox = new VBox();
        TextField textField = new TextField();
        verticalBox.getChildren().add(textField);
        
        Button button = new Button("Update");
        verticalBox.getChildren().add(button);
        
        Label label = new Label("");
        verticalBox.getChildren().add(label);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(verticalBox);
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(textField.getText());
            }
        });
        
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
