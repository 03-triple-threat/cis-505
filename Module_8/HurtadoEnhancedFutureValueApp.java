/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

 */

package Module_8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Module_8.FinanceCalculator;

public class HurtadoEnhancedFutureValueApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    TextField textFieldMonthlyPayment = new TextField();
    TextField textFieldInterestRate = new TextField();

    TextArea textArea = new TextArea();

    Label lblMonthlyPayment = new Label("Monthly Payment:");
    Label lblInterestRate = new Label("Interest Rate:");
    Label lblYears = new Label("Years:");
    Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    Label lblFutureValueDate = new Label("Calculation Will Appear Below:");
    ComboBox yearComboBox = new ComboBox();
    Button calculateButton = new Button("Calculate");
    Button clearButton = new Button("Clear");

    String currentDate; 
    Double futureValue;
    

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        lblInterestRateFormat.setTextFill(Color.RED);

        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(textFieldMonthlyPayment, 1, 0);

        pane.add(lblInterestRate, 0, 1);
        pane.add(textFieldInterestRate, 1, 1);

        pane.add(lblYears, 0, 3);

        yearComboBox.setPromptText("0");

        yearComboBox.getItems().addAll(
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
            );


        pane.add(yearComboBox, 1, 3);

        pane.add(lblFutureValueDate, 0, 5);

        pane.add(textArea, 0, 6);

        pane.add(lblInterestRateFormat, 1, 2);
        pane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        HBox actionButtonContainer = new HBox();
        actionButtonContainer.setPadding(new Insets(15, 0, 15, 30));
        actionButtonContainer.setSpacing(10);
        actionButtonContainer.getChildren().add(clearButton);
        actionButtonContainer.getChildren().add(calculateButton);
        pane.add(actionButtonContainer, 1, 4);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Hurtado Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();


        calculateButton.setOnAction(e -> calculateResults());
        clearButton.setOnAction(e -> clearFormFields());

    }

    /**
     * Clears the forms on the GUI window. This is called when the clear button is clicked.
     */
    private void clearFormFields() {
        textFieldMonthlyPayment.setText("");
        textFieldInterestRate.setText("");
        textArea.setText("");
        yearComboBox.setPromptText("0");
        lblFutureValueDate.setText("Calculation Will Appear Below:");
    }

    /**
     * Calls to the calculateFutureValue() method from the FinanceCalculator class.
     * Displays the future value calculated in the GUI window. This is called when 
     * the Calculate button is clicked.
     */
    private void calculateResults() {

        double monthlyPayment = Double.parseDouble(textFieldMonthlyPayment.getText());

        double rate = Double.parseDouble(textFieldInterestRate.getText());

        int years = (int)yearComboBox.getValue();

        FinanceCalculator calculator = new FinanceCalculator();

        futureValue = calculator.calculateFutureValue(monthlyPayment, rate, years);

        textArea.setText("The future value is $" + futureValue);
        lblFutureValueDate.setText("Calculation as of " + getDate());
    }

    /**
     * Calculates & returns the current date. This is displayed in the GUI window. 
     * @return String - currentDate
     */
    private String getDate() {

        currentDate = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());

        return currentDate;
    }

    
}