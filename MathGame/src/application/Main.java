package application;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;





public class Main extends Application {
	@FXML
	private Label question;
	private TextField textInput;
	private Label score;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//question.setText("12+ 23 ");
		
			Parent root = FXMLLoader.load(getClass().getResource("mathgame.fxml"));
			
			primaryStage.setScene(new Scene(root));
			primaryStage.setResizable(false);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
