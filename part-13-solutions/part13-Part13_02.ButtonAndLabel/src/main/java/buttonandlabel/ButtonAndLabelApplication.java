package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class ButtonAndLabelApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        // UI Components
        Label label = new Label("This is a label.");
        Button button = new Button("Press Me!");
        
        // Creation of FlowPane and adding UI comp. to it
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(button);
        
        // Creating scene and showing window
        Scene scene = new Scene(flowPane);
        window.setScene(scene);
        window.show();
        
        
    }


    public static void main(String[] args) {
        // Launch application
        launch(ButtonAndLabelApplication.class);
    }

}
