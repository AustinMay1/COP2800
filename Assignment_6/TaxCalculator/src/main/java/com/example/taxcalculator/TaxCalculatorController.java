package com.example.taxcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TaxCalculatorController {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percent = NumberFormat.getPercentInstance();

    private BigDecimal taxPercentage = new BigDecimal(0.06);

    @FXML
    private Label amountLabel;

    @FXML
    private TextField amountTextField;

    @FXML
    private GridPane baseGridPane;

    @FXML
    private Button calculateButton;

    @FXML
    private Label taxLabel;

    @FXML
    private Label taxPctLabel;

    @FXML
    private Slider taxPctSlider;

    @FXML
    private TextField taxTextField;

    @FXML
    private Label totalLabel;

    @FXML
    private TextField totalTextField;

    @FXML
    private void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal tax = amount.multiply(taxPercentage);
            BigDecimal total = amount.add(tax);

            taxTextField.setText(currency.format(tax));
            totalTextField.setText(currency.format(total));
        } catch (NumberFormatException e) {
            amountTextField.setText("Enter amount");
            amountTextField.selectAll();
            amountTextField.requestFocus();
        }
    }

    public void initialize() {
        currency.setRoundingMode(RoundingMode.HALF_UP);

        taxPctSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                        taxPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
                        taxPctLabel.setText(percent.format(taxPercentage));
                    }
                }
        );
    }

}

