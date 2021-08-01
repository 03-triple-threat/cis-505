package GradeBookApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class HurtadoGradeBookApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Label lblFirstName = new Label("First Name:");
    Label lblLastName = new Label("Last Name:");
    Label lblCourse = new Label("Course:");
    Label lblGrade = new Label("Grade:");

    TextField textFieldFirstName = new TextField();
    TextField textFieldLastName = new TextField();
    TextField textFieldCourse = new TextField(); 

    ComboBox comboBoxGrade = new ComboBox();

    Button clearButton = new Button("Clear Gradebook Entry");
    Button viewSavedGradesButton = new Button("View Saved Grades");
    Button saveGradebookEntry = new Button("Save Gradebook Entry");



    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(lblFirstName, 0, 0);
        pane.add(textFieldFirstName, 2, 0);

        pane.add(lblLastName, 0, 1);
        pane.add(textFieldLastName, 2, 1);

        pane.add(lblCourse, 0, 2);
        pane.add(textFieldCourse, 2, 2);

        comboBoxGrade.setPromptText("Select Grade");
        comboBoxGrade.getItems().addAll(
            "A", "B", "C", "D", "F"
        );

        pane.add(lblGrade, 0, 3);
        pane.add(comboBoxGrade, 2, 3);

        HBox actionButtonContainer = new HBox();

        actionButtonContainer.setPadding(new Insets(0, 0, 0, 0));
        actionButtonContainer.setSpacing(15);
        actionButtonContainer.getChildren().add(saveGradebookEntry);
        actionButtonContainer.getChildren().add(clearButton);
        actionButtonContainer.getChildren().add(viewSavedGradesButton);

        pane.add(actionButtonContainer, 1, 4);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Hurtado Grade Book App");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
