import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class addEvent {
static boolean answer;
static String txtNameContents;
static String txtTimeContents;
static String txtDateContents;
static String radMeridianSelect;


	public static Boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(300);
		
		//create gen label for message
		Label label = new Label();
		label.setText(message);
		
		//Generate two text boxes
		TextField txtName = new TextField();
		txtName.setText("Enter event here");
		TextField time = new TextField();
		
		// new datepicker
		DatePicker date = new DatePicker();
		
		//radial buton am pm
		RadioButton radAm = new RadioButton();
		RadioButton radPm = new RadioButton();
		
		// set the radio buttons to a toggle group
		ToggleGroup meridianToggle = new ToggleGroup();
		radAm.setToggleGroup(meridianToggle);
		radPm.setToggleGroup(meridianToggle);
		
		// create two button
		Button btnAdd = new Button("ADD");
		Button btnCancel = new Button("Cancel");
		
		txtNameContents = txtName.getText();
		RadioButton selectedRadioButton =(RadioButton) meridianToggle.getSelectedToggle();
		
		btnAdd.setOnAction(e -> {
			answer = true;
			if (selectedRadioButton == radAm) {
				radMeridianSelect = "AM";
				btnAddEvent();
			}
			else if(selectedRadioButton == radPm) {
				radMeridianSelect = "PM";
				btnAddEvent();
			}
			else {
				AlertBox.display("Warning Error", "You forgot to choose AM or PM");
			}
			
		});
		
		btnCancel.setOnAction(e -> {
			answer = false;
			window.close();
			
		});
		
		FlowPane layout = new FlowPane();
		FlowPane layout2 = new FlowPane();
		FlowPane layout3 = new FlowPane();
		FlowPane layout4 = new FlowPane();
		VBox fullLoad = new VBox();
		
		
		layout.setPadding(new Insets(10,5,5,10));
		layout.setHgap(5);
		layout.setVgap(5);
		layout2.setPadding(new Insets(10,5,5,10));
		layout2.setHgap(5);
		layout2.setVgap(5);
		layout3.setPadding(new Insets(10,5,10,10));
		layout3.setHgap(5);
		layout3.setVgap(5);
		layout4.setPadding(new Insets(10,5,5,10));
		layout4.setHgap(5);
		layout4.setVgap(5);
		
		layout.getChildren().addAll(new Label ("Enter Task Name: "), txtName);		
		layout2.getChildren().addAll(new Label ("Enter Time: "), time);
		layout3.getChildren().addAll(radAm, new Label ("AM"), radPm, new Label("PM"));
		layout4.getChildren().addAll(new Label ("Enter Date: "), date);
		layout4.getChildren().addAll(btnAdd, btnCancel);
		

		layout.setAlignment(Pos.BASELINE_RIGHT);
		layout2.setAlignment(Pos.BASELINE_RIGHT);
		layout3.setAlignment(Pos.BASELINE_RIGHT);
		layout4.setAlignment(Pos.BASELINE_RIGHT);

		fullLoad.getChildren().addAll(layout, layout2, layout3, layout4);
		
		Scene scene = new Scene(fullLoad, 200, 300);
		window.setScene(scene);
		window.showAndWait();
		
		
	
		return answer;
	
	}

	private static void btnAddEvent() {
		System.out.println("test complete");
	}

}
