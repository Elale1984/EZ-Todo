


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

public class openSequence extends Application{
	Stage window;
	
	
	@Override
	
	public void start(Stage primaryStage) {
		// set stage to window 
		window = primaryStage;
		
		//setOnClose send to method closeProgram
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});
		
		// create flow pane and set its properties
		FlowPane wPane = new FlowPane();
		wPane.setPadding(new Insets(11, 12, 13, 14));
		wPane.setHgap(5);
		wPane.setVgap(5);
		
		
		// Place nodes in the pane
		wPane.getChildren().addAll(new Label("User Name:"), 
		  new TextField());
		
		wPane.getChildren().addAll(new Label("Password:"),new TextField());
		// Create Buttons
		Button btnLog = new Button("Log In");
		Button btnCancel = new Button("Cancel");
		wPane.getChildren().addAll(btnLog, btnCancel);
		
		// sets close button
		btnCancel.setOnAction(e -> closeProgram());
		
		// sets login button
		btnLog.setOnAction(e -> mainMenue());
		
		// Create scene and place it on a stage
		Scene wWindow = new Scene(wPane, 200,300);
		window.setTitle("Welcome To EZ-TODO");
		window.setScene(wWindow);
		window.show();
		
	
		
		     
	}
	private void closeProgram() {
		Boolean varifyClose = ComfirmBox.display("Closeing", "Are you sure you want to exit?");
		
		if(varifyClose) {
			System.out.print("GoodBye!!");
			window.close();
		}
	}	
	private void mainMenue() {
		window.close();
		ToDoMenue.menueWindow("Main Menue", "Choose from the following tasks");
		
		
	}
	
}
