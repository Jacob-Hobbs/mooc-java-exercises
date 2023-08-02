package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");
        
        HBox horizontalBox = new HBox();
        horizontalBox.setPadding(new Insets(20, 20 ,20, 20));
        horizontalBox.setSpacing(10);
        horizontalBox.getChildren().add(jokeButton);
        horizontalBox.getChildren().add(answerButton);
        horizontalBox.getChildren().add(explanationButton);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(horizontalBox);
        
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("A bear that has no teeth would only have gums, hence he is gummy!");
        
        jokeButton.setOnAction((event) -> {
            borderPane.setCenter(firstLayout);
        });
        answerButton.setOnAction((event) -> {
            borderPane.setCenter(secondLayout);
        });
        explanationButton.setOnAction((event) -> {
            borderPane.setCenter(thirdLayout);
        });
        
        borderPane.setCenter(firstLayout);
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
        
    }
    
    private StackPane createView(String text) {
        
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
