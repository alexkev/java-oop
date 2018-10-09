/*
 * (Convert numbers) Write a program that converts between decimal, hex, and binary
numbers, as shown in Figure 16.37c. When you enter a decimal value in the decimalvalue
text field and press the Enter key, its corresponding hex and binary numbers are
displayed in the other two text fields. Likewise, you can enter values in the other fields
and convert them accordingly. (Hint: Use the Integer.parseInt(s, radix)
method to parse a string to a decimal and use Integer.toHexString(decimal)
and Integer.toBinaryString(decimal) to obtain a hex number or a binary
number from a decimal.)
 */

/*
 * make global text fields and labels
 * create grid pane
 * position labels and text fields
 * getChildren
 * use setOnAction/pressing enter and lambda expression to reference conversion methods
 * make methods for converting numbers
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A16dot5 extends Application {
	
	private TextField tfDecimal = new TextField();
	private TextField tfHex = new TextField();
	private TextField tfBinary = new TextField();

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5);
		pane.setVgap(5);
		
		Scene scene = new Scene(pane, 350, 200);
		primaryStage.setTitle("A16dot5");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.add(new Label("Decimal"), 0, 0);
		pane.add(tfDecimal, 1, 0);
		pane.add(new Label("Hex"), 0, 1);
		pane.add(tfHex, 1, 1);
		pane.add(new Label("Binary"), 0, 2);
		pane.add(tfBinary, 1, 2);
		
		tfDecimal.setOnAction(e -> covertFromDecimal());
		tfHex.setOnAction(e -> covertFromHex());
		tfBinary.setOnAction(e -> covertFromBinary());
	}

	private void covertFromDecimal() {
		try {
			// convert the user input into hexadecimal format
			tfHex.setText(Integer.toHexString(Integer.parseInt(tfDecimal.getText())));
			// convert the user input into binary format
			tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfDecimal.getText())));
		} catch (NumberFormatException e) {
			tfDecimal.setText("Please Enter Numbers");
		}
	}
	
	private void covertFromHex() {
		try {
			// convert the user input into decimal format
			tfDecimal.setText(String.valueOf(Integer.parseInt(tfHex.getText(), 16)));
			// convert the user input into binary format
			tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfHex.getText(), 16)));
		} catch (NumberFormatException e) {
			tfHex.setText("Invalid");
		}
	}
	
	private void covertFromBinary() {
		try {
			// convert the user input into decimal format
			tfDecimal.setText(String.valueOf(Integer.parseInt(tfBinary.getText(), 2)));
			// convert the user input into hexadecimal format
			tfHex.setText(Integer.toHexString(Integer.parseInt(tfBinary.getText(), 2)));
		} catch (NumberFormatException e) {
			tfBinary.setText("Invalid");
		}
	}

}
