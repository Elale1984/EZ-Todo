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
			
		
		//btnNewTask click event calls the addEvent class method of display
		btnNewTask.setOnAction(e -> {
			answer = true;
			addEvent.display("The Test", "Open seseme");
		});
		
		//btnViewTask click event
		btnViewTasks.setOnAction(e -> {
			answer = false;
			window.close();
				
		});
		
		//btnClose click event exits out of the program completely 
		//also gives a comfirm box to make sure that is what you want to do
		
		btnClose.setOnAction(e -> {
			answer = false;
			window.close();
				
		});		
		
		
		// layout 
		layout.setTop(headerLayout());
		layout.setLeft(sidePanelList());
		
		
		
		//Set the scene
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		
		return answer;
		
		

	}
	// The header of the window
	private static Node headerLayout() {
		//set up the HBox for the header
		HBox header = new HBox();
		
		// set background color of the HBox
		header.setStyle("-fx-background-color: black");
		
		//set the text with all the properties 
		Text headerText = new Text(20, 20,"  ToDo-Ez");
		headerText.setFont(Font.font("Courier", FontWeight.BOLD, 40));
		headerText.setFill(Color.WHITE);
		
		// set the children 
		header.getChildren().add(headerText);
		return header;
	}
	
	// Side Panel with all of the button options for the To Do List
	private static Node sidePanelList() {
		// create VBox and set properties
		VBox sidePanel = new VBox(15); // VBox setup
		sidePanel.setPadding(new Insets(15,5,5,5));	// align the edges
		sidePanel.setStyle("-fx-background-color: grey"); // color grey

		// Add the labels and buttons to the side panel
		sidePanel.getChildren().addAll(btnNewTask, btnViewTasks, btnClose);
		
		
		return sidePanel;
	}

	
}