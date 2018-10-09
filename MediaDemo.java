import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.*;
import javafx.stage.Stage;

public class MediaDemo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Media media = new Media("http://cs.armstrong.edu/liang/common/sample.mp4");
		MediaPlayer mp = new MediaPlayer(media);
		MediaView mv = new MediaView(mp);
		mp.play();
		
		Pane pane = new Pane();
		pane.getChildren().add(mv);
		
		Scene scene = new Scene(pane, 720, 480);
		primaryStage.setTitle("Media Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
