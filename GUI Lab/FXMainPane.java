/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Lab 2
 * Due: 09/26/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button button1, button2, button3, button4, button5, button6;
	Label mainlabel;
	TextField textfield;
	//  declare two HBoxes
	HBox firstHBox;
	HBox secondHBox;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		button6 = new Button("Espanol");
		mainlabel = new Label("Feedback");
		textfield = new TextField();
		//  instantiate the HBoxes
		firstHBox = new HBox();
		secondHBox = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		//  set margins and set alignment of the components
		HBox.setMargin(button1, new Insets(10,20,20,0));
		HBox.setMargin(button2, new Insets(10,20,20,0));
		HBox.setMargin(button3, new Insets(10,20,20,0));
		HBox.setMargin(button4, new Insets(10,20,20,0));
		HBox.setMargin(button5, new Insets(10,0,20,0));
		HBox.setMargin(button6, new Insets(10,0,20,20));
		HBox.setMargin(mainlabel, new Insets(0 ,10,0,0));
		firstHBox.setAlignment(Pos.CENTER);
		secondHBox.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		firstHBox.getChildren().addAll(mainlabel, textfield);
		//  add the buttons to the other HBox
		secondHBox.getChildren().addAll(button1, button2, button3, button4, button5, button6);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(firstHBox, secondHBox);
		
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
		button6.setOnAction(new ButtonHandler());
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			EventTarget selection = event.getTarget();
			
			if (selection == button1)
			{
				textfield.setText(dataManager.getHello());
			}
			
			else if (selection == button2)
			{
				textfield.setText(dataManager.getHowdy());
			}
			
			else if (selection == button3)
			{
				textfield.setText(dataManager.getChinese());
			}
			
			else if (selection == button4)
			{
				textfield.setText("");
			}
			
			else if (selection == button5)
			{
				System.exit(0);
			}
			
			else if (selection == button6)
			{
				textfield.setText(dataManager.getEspanol());
			}
		}
	}
}
	
