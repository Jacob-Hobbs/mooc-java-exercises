package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
        horizontalBox.setSpacing(10);
        Label lettersLabel = new Label("Letters: 0");
        horizontalBox.getChildren().add(lettersLabel);
        Label wordsLabel = new Label("Words: 0");
        horizontalBox.getChildren().add(wordsLabel);
        Label longestLabel = new Label("The longest word is: 0");
        horizontalBox.getChildren().add(longestLabel);
        
        borderPane.setBottom(horizontalBox);
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            longestLabel.setText("The longest word is: " + longest);
            wordsLabel.setText("Words: " + words);
            lettersLabel.setText("Letters: " + characters);
            
        });
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
