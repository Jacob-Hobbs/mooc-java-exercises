package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window) {
        // First view
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Label("First view!"));
        Button firstViewButton = new Button("To the second view!");
        borderPane.setCenter(firstViewButton);
        
        // Second view
        VBox verticalBox = new VBox();
        Button secondViewButton = new Button("To the third view!");
        verticalBox.getChildren().add(secondViewButton);
        verticalBox.getChildren().add(new Label("Second view!"));
        
        // Third view
        GridPane gridPane = new GridPane();
        Button thirdViewButton = new Button("To the first view!");
        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y <= 1; y++) {
                
                if (x == 0 && y == 0) {
                    gridPane.add(new Label("Third view!"), x, y);
                } else if (x == 1 && y == 1) {
                    gridPane.add(thirdViewButton, x, y);
                } else {
                    // Do nothing
                }

            }
        }
        
        Scene first = new Scene(borderPane);
        Scene second = new Scene(verticalBox);
        Scene third = new Scene(gridPane);
        
        
        
        firstViewButton.setOnAction((event) -> {
            window.setScene(second);
        });
        
        secondViewButton.setOnAction((event) -> {
            window.setScene(third);
        });
        
        thirdViewButton.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
        
        
        
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
