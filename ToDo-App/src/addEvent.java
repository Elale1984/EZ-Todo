import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class addEvent {
static boolean answer;
	
	public static Boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(300);
		
		//create gen label for message
		Label label = new Label();
		label.setText(message);
		
		//Generate two text boxes
		TextField event = new TextField();
		TextField time = new TextField();
		
		// new datepicker
		DatePicker date = new DatePicker();
		
		// create two button
		Button btnAdd = new Button("ADD");
		Button btnCancel = new Button("Cancel");
		
		btnAdd.setOnAction(e -> {
			answer = true;
			window.close();
			
		});
		
		btnCancel.setOnAction(e -> {
			answer = false;
			window.close();
			
		});
		
		FlowPane layout = new FlowPane();
		layout.setPadding(new Insets(15,10,10,10));
		layout.setHgap(10);
		layout.setVgap(10);
		layout.getChildren().addAll(new Label ("Enter Task Name: "), event);		
		layout.getChildren().addAll(new Label ("Enter Time: "), time);
		layout.getChildren().addAll(new Label ("Enter Date: "), date);
		layout.getChildren().addAll(btnAdd, btnCancel);
		

		layout.setAlignment(Pos.BASELINE_RIGHT);
		Scene scene = new Scene(layout, 200, 300);
		window.setScene(scene);
		window.showAndWait();
		
		
	
		return answer;
	
	}

}
