import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class JavaFXDraw extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 550, 550);
		primaryStage.setTitle("Draw some stuff");
		primaryStage.setScene(scene);
		primaryStage.show();
	
		Line l = new Line(100, 100 , 200, 100);
		l.setStroke(Color.RED);
		
		Text t = new Text(100, 200, "HEllO");
		t.setStroke(Color.CORNFLOWERBLUE);
		Font myFont = new Font("Times New Roman", 30);
		t.setFont(myFont);
		
		javafx.scene.shape.Circle c = new javafx.scene.shape.Circle(125, 300, 25);
		c.setStroke(Color.ORANGE);
		c.setFill(Color.ORANGE);
		
		javafx.scene.shape.Rectangle r = new javafx.scene.shape.Rectangle(100, 400, 100, 50);
		r.setStroke(Color.GREEN);
		r.setFill(Color.GREEN);
		r.setArcWidth(10);
		r.setArcHeight(10);
		
		Ellipse e = new Ellipse(325, 100, 50, 25);
		e.setStroke(Color.CYAN);
		e.setFill(Color.CYAN);
		
		Arc a = new Arc(325, 200, 50, 50, 0, 90);
		a.setStroke(Color.PURPLE);
		a.setFill(Color.PURPLE);
		a.setType(ArcType.ROUND);
		
		pane.getChildren().addAll(l, t, c, r, e, a);
	}
	
	
}
