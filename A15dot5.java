import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A15dot5 extends Application {
	
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5);
		pane.setVgap(5);
		
		Scene scene = new Scene(pane, 450, 300);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.add(new Label("Investment Amount"), 0, 0);
		pane.add(tfInvestmentAmount, 1, 0);
		pane.add(new Label("Number of Year"), 0, 1);
		pane.add(tfNumberOfYears, 1, 1);
		pane.add(new Label("Annual Interest Rate"), 0, 2);
		pane.add(tfAnnualInterestRate, 1, 2);
		pane.add(new Label("Future Value"), 0, 3);
		pane.add(tfFutureValue, 1, 3);
		tfFutureValue.setEditable(false);
		
		Button bCalc = new Button("Calculate");
		pane.add(bCalc, 0, 4);
		bCalc.setMinWidth(165);
		bCalc.setOnAction(e -> calculateValue());
		Button bRest = new Button("Rest");
		pane.add(bRest, 1, 4);
		bRest.setMinWidth(165);
		bRest.setOnAction(e -> resetForm());
		
		pane.getStyleClass().add("grid-pane");
		scene.getStylesheets().add("InvestmentCalulator.css");
	}

	private void calculateValue() {
		try {
			double amount = Double.parseDouble(tfInvestmentAmount.getText());
			double years = Double.parseDouble(tfNumberOfYears.getText());
			double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
			double rate = annualInterestRate / 1200.0;
			double futureValue = amount * Math.pow(1.0 + rate, years * 12.0);
			tfFutureValue.setText(String.format("%.2f", futureValue));
		} catch (NumberFormatException e) {
			tfFutureValue.setText("Please Enter Numbers");
		}
	}

	private void resetForm() {
		tfAnnualInterestRate.clear();
		tfNumberOfYears.clear();
		tfInvestmentAmount.clear();
		tfFutureValue.clear();
	}
}

