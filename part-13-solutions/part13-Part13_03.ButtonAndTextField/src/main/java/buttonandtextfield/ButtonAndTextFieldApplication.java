package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        //UI Components
        Button button = new Button("Press Me!");
        TextField textField = new TextField("Sample text");
        
        //FlowPane creation and addition of UI components
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(button);
        flowPane.getChildren().add(textField);
        
        // Scene creation
        Scene view = new Scene(flowPane);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
