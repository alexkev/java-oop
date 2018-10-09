import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXPhoto extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image im = new Image("a.jpg");
		ImageView iv = new ImageView(im);
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane, im.getWidth(), im.getHeight());
		primaryStage.setTitle("Show Photo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.getChildren().add(iv);
	}
}
