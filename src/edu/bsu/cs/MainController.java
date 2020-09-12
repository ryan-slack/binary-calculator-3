package edu.bsu.cs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Label output;
    private String num1;
    private String num2;
    private String operator = "";
    private boolean start = true;
    private Calculator calculator = new Calculator();

    @FXML
    public void processNums(ActionEvent event) {
        if(start) {
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        if(!output.getText().equals(operator)) {
            output.setText(output.getText() + value);
        } else {
            output.setText("");
            output.setText(output.getText() + value);
        }
    }

    @FXML
    public void processOperators(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        String result;

        if(value.equals("C")) {
            output.setText("");
            start = false;
        } else {
            if(!value.equals("=")) {
                if(!operator.isEmpty())
                    return;
                operator = value;
                num1 = output.getText();
                if(!value.equals("x²") && !value.equals("√"))
                    output.setText(operator);
                else {
                    //TODO: call binarySquared and binarySquareRoot functions
                }
            } else {
                if(operator.isEmpty())
                    return;
                num2 = output.getText();
                if(operator.equals("+")) {
                    result = calculator.binaryAdd(num1, num2);
                    output.setText(result);
                    operator = "";
                    start = true;
                }
            }
        }
    }
}
