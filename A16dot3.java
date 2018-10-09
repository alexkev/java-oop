import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class A16dot3 extends Application {

	javafx.scene.shape.Circle circleRed = new javafx.scene.shape.Circle(150, 50, 20);
	javafx.scene.shape.Circle circleYellow = new javafx.scene.shape.Circle(150, 100, 20);
	javafx.scene.shape.Circle circleGreen = new javafx.scene.shape.Circle(150, 150, 20);
	
	RadioButton rbRed = new RadioButton("Red");
	RadioButton rbYellow = new RadioButton("Yellow");
	RadioButton rbGreen = new RadioButton("Green");
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		resetLights();
		javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(120, 20, 60, 160);
		rectangle.setFill(Color.LIGHTGREY);
		rectangle.setStroke(Color.BLACK);
		
		circleRed.setOnMousePressed(e -> setRed());
		circleYellow.setOnMousePressed(e -> setYellow());
		circleGreen.setOnMousePressed(e -> setGreen());
		
		pane.getChildren().addAll(rectangle, circleRed, circleYellow, circleGreen);
		
		HBox hBox = new HBox(50);
		hBox.setPrefHeight(50);
		hBox.setAlignment(Pos.CENTER);
		
		rbRed.setOnAction(e -> setRed());
		rbYellow.setOnAction(e -> setYellow());
		rbGreen.setOnAction(e -> setGreen());
		
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		hBox.getChildren().addAll(rbRed, rbYellow, rbGreen);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(pane);
		bp.setBottom(hBox);
		
		Scene scene = new Scene(bp, 300, 250);
		primaryStage.setTitle("Traffic Signal");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void setRed() {
		resetLights();
		circleRed.setFill(Color.RED);
		rbRed.setSelected(true);
	}
	
	private void setYellow() {
		resetLights();
		circleYellow.setFill(Color.YELLOW);
		rbYellow.setSelected(true);
	}
	
	private void setGreen() {
		resetLights();
		circleGreen.setFill(Color.GREEN);
		rbGreen.setSelected(true);
	}
	
	private void resetLights() {
		circleRed.setFill(Color.GREY);
		circleYellow.setFill(Color.GREY);
		circleGreen.setFill(Color.GREY);
	}
}
