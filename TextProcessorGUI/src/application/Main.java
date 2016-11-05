package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//DONE set title
//DONE set non-resizable 

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/ie/gmit/java2/view/MainWindow.fxml"));
			
			AnchorPane root = loader.load();			
			
			Scene scene = new Scene(root);

			primaryStage.setResizable(false);
			primaryStage.setTitle("Text Processor");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
