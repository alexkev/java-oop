/*
 * (Display a pie chart) Write a program that uses a pie chart to display the percentages
 * of the overall grade represented by projects, quizzes, midterm exams, and
 * the final exam, as shown in Figure 14.46c. 
 * Suppose that 
 * projects take 20 percent and are displayed in red, (72*)
 * quizzes take 10 percent and are displayed in blue, (36*)
 * mid-term exams take 30 percent and are displayed in green, (108*) 
 * final exam takes 40 percent and is displayed in orange. (144*)
 * Use the Arc class to display the pies.
 * Interested readers may explore the JavaFX PieChart class for further study.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class A14dot13 extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Grades");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Arc p = new Arc(250, 250, 200, 200, 0, 72);
		p.setStroke(Color.RED);
		p.setFill(Color.RED);
		p.setType(ArcType.ROUND);
		
		Text tp = new Text(300, 200, "Projects 20%");
		tp.setStroke(Color.BLACK);
		Font myFont = new Font("Times New Roman", 30);
		tp.setFont(myFont);
		
		Arc q = new Arc(250, 250, 200, 200, 72, 36);
		q.setStroke(Color.BLUE);
		q.setFill(Color.BLUE);
		q.setType(ArcType.ROUND);
		
		Text tq = new Text(200, 100, "Quizzes 10%");
		tq.setStroke(Color.BLACK);
		tq.setFont(myFont);
		
		Arc m = new Arc(250, 250, 200, 200, 108, 108);
		m.setStroke(Color.GREEN);
		m.setFill(Color.GREEN);
		m.setType(ArcType.ROUND);
		
		Text tm = new Text(70, 240, "Midterm 30%");
		tm.setStroke(Color.BLACK);
		tm.setFont(myFont);
		
		Arc f = new Arc(250, 250, 200, 200, 216, 144);
		f.setStroke(Color.ORANGE);
		f.setFill(Color.ORANGE);
		f.setType(ArcType.ROUND);
		
		Text tf = new Text(225, 350, "Finals 40%");
		tf.setStroke(Color.BLACK);
		tf.setFont(myFont);
		
		pane.getChildren().addAll(p, q, m, f, tp, tq, tm, tf);
	}
}
