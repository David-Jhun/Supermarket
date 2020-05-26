package ui;

import controller.UniversalController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.Supermarket;

public class Main extends Application{
	
	private Supermarket supermarket;
	private UniversalController controller;
	
	public Main() {
		supermarket = new Supermarket();
		controller = new UniversalController(supermarket);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Welcome!");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
		loader.setController(controller);
		Parent root = loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			
			@Override
			public void handle(WindowEvent event) {
				
			}
		});
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
