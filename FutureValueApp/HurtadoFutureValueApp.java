/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

 */

package FutureValueApp;

import javafx.application.Application;
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

public class HurtadoFutureValueApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
        TextField textFieldMonthlyPayment = new TextField();
        TextField textFieldInterestRate = new TextField();

        TextArea textArea = new TextArea();

        Label lblMonthlyPayment = new Label("Monthly Payment:");
        Label lblInterestRate = new Label("Interest Rate:");
        Label lblYears = new Label("Years:");
        Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        Label label5 = new Label();

        ComboBox comboBox = new ComboBox();

        Button calculateButton = new Button("Calculate");
        Button clearButton = new Button("Clear");

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
        pane.add(comboBox, 1, 3);

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

    }

    
}