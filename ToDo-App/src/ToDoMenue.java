import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;

public class ToDoMenue  {
	
	static boolean answer;
	
	// Create static buttons
	static Button btnNewTask = new Button("Add New Task");
	static Button btnViewTasks = new Button("View All Task");
	static Button btnClose = new Button("Close");
	
	public static Boolean menueWindow(String title, String message) {
		Stage window = new Stage();
		
		window.setTitle(title);
		window.setMinHeight(675);
		window.setMinWidth(1000);
		
		// create the FlowPane
		BorderPane layout = new BorderPane();
		
		
		
		//create gen label for message
		Label label = new Label();
		label.setText(message);
			
		
		
		btnNewTask.setOnAction(e -> {
			answer = true;
			addEvent.display("The Test", "Open seseme");
		});
			
		btnViewTasks.setOnAction(e -> {
			answer = false;
			window.close();
				
		});
		btnClose.setOnAction(e -> {
			answer = false;
			window.close();
				
		});		
		
		
		
		
		
		
		
		
		
		
		layout.setTop(headerLayout());
		layout.setLeft(sidePanelList());
		
		
		
		
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		
		return answer;
		
		

	}
	// The header of the window
	private static Node headerLayout() {
		HBox header = new HBox();
		header.setStyle("-fx-background-color: black");
		Text headerText = new Text(20, 20,"  ToDo-Ez");
		headerText.setFont(Font.font("Courier", FontWeight.BOLD, 40));
		headerText.setFill(Color.WHITE);
		
		header.getChildren().add(headerText);
		return header;
	}
	
	// Side Panel with all of the button options for the To Do List
	private static Node sidePanelList() {
		// create VBox and set properties
		VBox sidePanel = new VBox(15);
		sidePanel.setPadding(new Insets(15,5,5,5));	
		sidePanel.setStyle("-fx-background-color: grey");

		// Add the labels and buttons to the side panel
		sidePanel.getChildren().addAll(btnNewTask, btnViewTasks, btnClose);
		
		
		return sidePanel;
	}

	
}