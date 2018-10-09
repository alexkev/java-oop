/*
 * (Create a simple calculator) Write a program to perform addition, subtraction,
 * multiplication, and division.
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A15dot4 extends Application {
	
	//create textfeilds
	private TextField tfNumber1 = new TextField(); 
	private TextField tfNumber2 = new TextField(); 
	private TextField tfValue = new TextField(); 	
	
	//create buttons
	Button bAdd = new Button("Add");
	Button bSubtract = new Button("Subtract");
	Button bMultiple = new Button("Multiple");
	Button bDivide = new Button("Divide");
	Button bReset = new Button("Reset");

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		// create BroderPane for hBox & hBox2
		BorderPane bp = new BorderPane();
		
		// here is what the window will look like
		Scene scene = new Scene(bp, 450, 150);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		// ------------------ hBox ---------------- //
		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);
		tfNumber1.setPrefWidth(50);
		tfNumber2.setPrefWidth(50);
		tfValue.setPrefWidth(50);
		tfValue.setEditable(false);
		
		// get textfeilds from global scope 
		hBox.getChildren().addAll(new Label("Number 1: "), tfNumber1, new Label("Number 2: "), tfNumber2, new Label("Result: "), tfValue);
		
		// ----------------- hBox2 --------------- //
		HBox hBox2 = new HBox(5);
		hBox2.setPrefHeight(50);
		
		// add function to buttons, reference methods. 
		bAdd.setOnAction(e -> add());
		bSubtract.setOnAction(e -> subtract());
		bMultiple.setOnAction(e -> multiple());
		bDivide.setOnAction(e -> divide());
		bReset.setOnAction(e -> resetForm());

		// get buttonss from global scope 
		hBox2.getChildren().addAll(bAdd, bSubtract, bMultiple, bDivide, bReset);
		
		// Postion Hboxes on BorderPane
		hBox2.setAlignment(Pos.CENTER);
		bp.setCenter(hBox);
		bp.setBottom(hBox2);
	}

	
	// Arithmetic (addition, subtraction, multiplication, and division) Methods and Reset Method
	private void add() {
		try {
			double number1 = Double.parseDouble(tfNumber1.getText());
			double number2 = Double.parseDouble(tfNumber1.getText());
			double add = number1 + number2;
			tfValue.setText(String.format("%.2f", add));
		} catch (NumberFormatException e) {
			tfValue.setText("Please Enter Numbers");
		}
	}

	private void subtract() {
		try {
			double number1 = Double.parseDouble(tfNumber1.getText());
			double number2 = Double.parseDouble(tfNumber1.getText());
			double subtract = number1 - number2;
			tfValue.setText(String.format("%.2f", subtract));
		} catch (NumberFormatException e) {
			tfValue.setText("Please Enter Numbers");
		}
	}
	
	private void multiple() {
		try {
			double number1 = Double.parseDouble(tfNumber1.getText());
			double number2 = Double.parseDouble(tfNumber1.getText());
			double multiple = number1 * number2;
			tfValue.setText(String.format("%.2f", multiple));
		} catch (NumberFormatException e) {
			tfValue.setText("Please Enter Numbers");
		}
	}
	
	private void divide() {
		try {
			double number1 = Double.parseDouble(tfNumber1.getText());
			double number2 = Double.parseDouble(tfNumber1.getText());
			double divide = number1 / number2;
			tfValue.setText(String.format("%.2f", divide));
		} catch (NumberFormatException e) {
			tfValue.setText("Please Enter Numbers");
		}
	}
	
	private void resetForm() {
		tfNumber1.clear();
		tfNumber2.clear();
		tfValue.clear();
	}
}
