package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a Title: ");
        String input = scanner.nextLine();
        
        Application.launch(Main.class, 
                "--title=" + input);

    }
    
    @Override
    public void start (Stage window) {
        
        FlowPane flowPane = new FlowPane();
        
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        window.setTitle(title);
        window.show();
    }

}
