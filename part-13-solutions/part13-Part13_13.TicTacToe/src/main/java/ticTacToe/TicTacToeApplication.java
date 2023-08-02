package ticTacToe;


import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    
    private String player = "X";
    private ArrayList<Button> buttons = new ArrayList<>();
    
    @Override
    public void start(Stage window) {
        
        // Creation of tic-tac-toe board via GridPane
        GridPane ticTacToeBoard = new GridPane();
        ticTacToeBoard.setPadding(new Insets(20, 20, 20, 20));
        ticTacToeBoard.setHgap(8);
        ticTacToeBoard.setVgap(8);
        
        Button button1 = new Button("");
        button1.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button1, 1, 1);
        buttons.add(button1);
        Button button2 = new Button("");
        button2.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button2, 1, 2);
        buttons.add(button2);
        Button button3 = new Button("");
        button3.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button3, 1, 3);
        buttons.add(button3);
        Button button4 = new Button("");
        button4.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button4, 2, 1);
        buttons.add(button4);
        Button button5 = new Button("");
        button5.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button5, 2, 2);
        buttons.add(button5);
        Button button6 = new Button("");
        button6.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button6, 2, 3);
        buttons.add(button6);
        Button button7 = new Button("");
        button7.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button7, 3, 1);
        buttons.add(button7);
        Button button8 = new Button("");
        button8.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button8, 3, 2);
        buttons.add(button8);
        Button button9 = new Button("");
        button9.setFont(Font.font("Cooper Black", 40));
        ticTacToeBoard.add(button9, 3, 3);
        buttons.add(button9);
        
        
        
        // Creation of BorderPane
        BorderPane borderPane = new BorderPane();
        Label turnLabel = new Label("Turn: " + player);
        turnLabel.setFont(Font.font("Cooper Black", 30));
        borderPane.setTop(turnLabel);
        borderPane.setCenter(ticTacToeBoard);
        
        // Button Functionality
        
        button1.setOnAction((event) -> {
            clickButton(button1, turnLabel);
        });
        button2.setOnAction((event) -> {
            clickButton(button2, turnLabel);
        });
        button3.setOnAction((event) -> {
            clickButton(button3, turnLabel);
        });
        button4.setOnAction((event) -> {
            clickButton(button4, turnLabel);
        });
        button5.setOnAction((event) -> {
            clickButton(button5, turnLabel);
        });
        button6.setOnAction((event) -> {
            clickButton(button6, turnLabel);
        });
        button7.setOnAction((event) -> {
            clickButton(button7, turnLabel);
        });
        button8.setOnAction((event) -> {
            clickButton(button8, turnLabel);
        });
        button9.setOnAction((event) -> {
            clickButton(button9, turnLabel);
        });
        
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
   
    }
    
    public void clickButton(Button button, Label label) {
        
        while (true) {
            if (checkIfWinner()) {
                label.setText("The end!");
                button.disarm();
                break;
            }
            
            if (button.getText().equals("X") || button.getText().equals("O")) {
                break;
            }
            if (player.equals("X")) {
                button.setText(player);
                if (checkIfWinner()) {
                    label.setText("The end!");
                    button.disarm();
                    break;
                }
                player = "O";
                label.setText("Turn: " + player);
                break;
            } else {
                button.setText(player);
                if (checkIfWinner()) {
                    label.setText("The end!");
                    button.disarm();
                    break;
                }
                player = "X";
                label.setText("Turn: " + player);
                break;
            }
        } 
        
    }
    
    public boolean checkIfWinner() {
        return checkVerticalColumns() || checkHorizontalRows() || checkDiagonals();
    }
    
    public boolean checkVerticalColumns() {
        if (buttons.get(0).getText().equals("X") && buttons.get(1).getText().equals("X") && buttons.get(2).getText().equals("X")) {
            return true;
        } else if (buttons.get(3).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(5).getText().equals("X")) {
            return true;
        } else if (buttons.get(6).getText().equals("X") && buttons.get(7).getText().equals("X") && buttons.get(8).getText().equals("X")) {
            return true;
        } else if (buttons.get(0).getText().equals("O") && buttons.get(1).getText().equals("O") && buttons.get(2).getText().equals("O")) {
            return true;
        } else if (buttons.get(3).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(5).getText().equals("O")) {
            return true;
        } else if (buttons.get(6).getText().equals("O") && buttons.get(7).getText().equals("O") && buttons.get(8).getText().equals("O")) {
            return true;
        } 
        return false;
    }
    
    public boolean checkHorizontalRows() {
        if (buttons.get(0).getText().equals("X") && buttons.get(3).getText().equals("X") && buttons.get(6).getText().equals("X")) {
            return true;
        } else if (buttons.get(1).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(7).getText().equals("X")) {
            return true;
        } else if (buttons.get(2).getText().equals("X") && buttons.get(5).getText().equals("X") && buttons.get(8).getText().equals("X")) {
            return true;
        } else if (buttons.get(0).getText().equals("O") && buttons.get(3).getText().equals("O") && buttons.get(6).getText().equals("O")) {
            return true;
        } else if (buttons.get(1).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(7).getText().equals("O")) {
            return true;
        } else if (buttons.get(2).getText().equals("O") && buttons.get(5).getText().equals("O") && buttons.get(8).getText().equals("O")) {
            return true;
        } 
        return false;
    }
    
    public boolean checkDiagonals() {
        if (buttons.get(0).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(8).getText().equals("X")) {
            return true;
        } else if (buttons.get(6).getText().equals("X") && buttons.get(4).getText().equals("X") && buttons.get(2).getText().equals("X")) {
            return true;
        } else if (buttons.get(0).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(8).getText().equals("O")) {
            return true;
        } else if (buttons.get(6).getText().equals("O") && buttons.get(4).getText().equals("O") && buttons.get(2).getText().equals("O")) {
            return true;
        } 
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
