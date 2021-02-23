import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class ToDoMenue  {
	
	
	static boolean answer;
		
	public static Boolean menueWindow(String title, String message) {
		Stage window = new Stage();
		
		window.setTitle(title);
		window.setMinWidth(300);
		window.setMinHeight(300);
		
		//create gen label for message
		Label label = new Label();
		label.setText(message);
			
			
		// create buttons
		Button btnNewTask = new Button("Add New Task");
		Button btnViewTasks = new Button("View All Task");
		Button btnClose = new Button("Close");
		
		btnNewTask.setOnAction(e -> {
			answer = true;
			window.close();
				
		});
			
		btnViewTasks.setOnAction(e -> {
			answer = false;
			window.close();
				
		});
		btnClose.setOnAction(e -> {
			answer = false;
			window.close();
				
		});
			
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, btnNewTask, btnViewTasks, btnClose);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
			
			
		
		return answer;
		
		

	}
}