package GradeBookApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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

    Label lblSavedGrade = new Label("Saved Grade: ");
    GridPane pane = new GridPane();

    String newText;

    TableView table = new TableView();

    TableColumn firstNameColumnHeader = new TableColumn("First Name");
    TableColumn lastNameColumnHeader = new TableColumn("Last Name");
    TableColumn courseColumnHeader = new TableColumn("Course");
    TableColumn gradeColumnHeader = new TableColumn("Grade");


    @Override
    public void start(Stage primaryStage) {

        primaryStage.setWidth(750);
        primaryStage.setHeight(500);

        // GridPane pane = new GridPane();
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
        comboBoxGrade.getItems().addAll("-", "A", "B", "C", "D", "F");

        pane.add(lblGrade, 0, 3);
        pane.add(comboBoxGrade, 2, 3);

        HBox actionButtonContainer = new HBox();

        actionButtonContainer.setPadding(new Insets(0, 0, 0, 0));
        actionButtonContainer.setSpacing(15);
        actionButtonContainer.getChildren().add(saveGradebookEntry);
        actionButtonContainer.getChildren().add(clearButton);
        actionButtonContainer.getChildren().add(viewSavedGradesButton);

        pane.add(actionButtonContainer, 1,5);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Hurtado Grade Book App");
        primaryStage.setScene(scene);
        primaryStage.show();

        saveGradebookEntry.setOnAction(e -> {
            try {
                saveEnteredGrade();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        // viewSavedGradesButton.setOnAction(e -> viewSavedGrades());

        viewSavedGradesButton.setOnAction(e -> viewGrades());

        clearButton.setOnAction(e -> clearGradebookEntry());

    }

    /**
     * Creates a new grades.csv file with firstName, lastName, course, & grade headers.
     * 
     * Method writes the corresponding header values from the GUI to the grades.csv file.
     * @throws IOException
     */
    private void saveEnteredGrade() throws IOException {

        File file = new File("GradeBookApp/grades.csv");

        FileWriter csvWriter = new FileWriter(file, true);

        csvWriter.append(textFieldFirstName.getText() + "," + textFieldLastName.getText() + "," + textFieldCourse.getText() + "," + comboBoxGrade.getValue() + "\n");

        csvWriter.close();

    }

    // TODO
    /**
     * write a method that displays the content of the csv file when view grades is
     * clicked
     */
    private void readCSV()  {
        
        try {
            Scanner scan = new Scanner(new File("GradeBookApp/grades.csv"));

            scan.useDelimiter(",");

            while (scan.hasNext()) {
                // pane.add(lblSavedGrade, 1, 4);
                System.out.print(scan.next() + " ");
                
                // newText = scan.next() + " ";
                // lblSavedGrade.setText("Saved Grade: " + scan.next() + " ");
            }

            scan.close();

            // lblSavedGrade.setText("Saved Grade: " + newText);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void clearGradebookEntry() {
        textFieldFirstName.setText("");
        textFieldLastName.setText("");
        textFieldCourse.setText("");
        comboBoxGrade.setValue("-");
    }

    private void viewGrades() {
        table.setEditable(true);
        table.getColumns().addAll(firstNameColumnHeader, lastNameColumnHeader, courseColumnHeader, gradeColumnHeader);
        pane.add(table, 1, 6);
        readCSV();
    }
}
