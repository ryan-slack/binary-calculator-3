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
    boolean isDecimal = false;
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
    public void toggleDecimal(ActionEvent event) {
        int decimal;
        String binary;
        if(!isDecimal) {
            decimal = Integer.parseInt(output.getText(), 2);
            output.setText(String.valueOf(decimal));
            isDecimal = true;
        } else {
            binary = Integer.toBinaryString(Integer.parseInt(output.getText(), 10));
            output.setText(binary);
            isDecimal = false;
        }

        /*int decimal;
        String binary;
        if(!output.getText().matches("^[2-9].*") && output.getText().matches("0") || output.getText().matches("1")) {
            decimal = Integer.parseInt(output.getText());
            output.setText(Integer.toString(decimal));
        } else if(output.getText().matches("^[2-9].*")) {
            binary = Integer.toBinaryString(Integer.parseInt(output.getText()));
            output.setText(binary);
        }*/
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
                    if(operator.equals("x²")) {
                        result = calculator.binarySqrd(num1);
                        output.setText(result);
                        operator = "";
                        start = true;
                    } else {
                        result = calculator.binarySqRoot(num1);
                        output.setText(result);
                        operator = "";
                        start = true;
                    }
                }
            } else {
                if(operator.isEmpty())
                    return;
                num2 = output.getText();
                switch (operator) {
                    case "+":
                        result = calculator.binaryAdd(num1, num2);
                        output.setText(result);
                        operator = "";
                        start = true;
                        break;
                    case "-":
                        result = calculator.binarySubtract(num1, num2);
                        output.setText(result);
                        operator = "";
                        start = true;
                        break;
                    case "x":
                        result = calculator.binaryMultiply(num1, num2);
                        output.setText(result);
                        operator = "";
                        start = true;
                        break;
                    default:
                        result = calculator.binaryDivide(num1, num2);
                        output.setText(result);
                        operator = "";
                        start = true;
                        break;
                }
            }
        }
    }
}
