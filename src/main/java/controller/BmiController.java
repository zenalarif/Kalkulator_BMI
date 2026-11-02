package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Bmi;

public class BmiController {

    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private TextField txtBmi;
    @FXML private ComboBox<String> cbHeightUnit;
    @FXML private ComboBox<String> cbWeightUnit;
    @FXML private Label lblKeterangan;

    @FXML
    private void initialize() {
        cbHeightUnit.getItems().addAll("cm", "m");
        cbWeightUnit.getItems().addAll("kg", "lb");
        cbHeightUnit.getSelectionModel().selectFirst();
        cbWeightUnit.getSelectionModel().selectFirst();
        txtBmi.setEditable(false);
    }

    @FXML
    private void handleCalculate() {
        try {
            double height = parse(txtHeight);
            double weight = parse(txtWeight);
            if (height <= 0 || weight <= 0) {
                throw new NumberFormatException();
            }
            Bmi bmi = new Bmi(height, cbHeightUnit.getValue(), weight, cbWeightUnit.getValue());
            txtBmi.setText(String.format("%.1f", bmi.getValue()));
            lblKeterangan.setText(bmi.getCategory());
        } catch (NumberFormatException e) {
            txtBmi.clear();
            lblKeterangan.setText("Masukkan tinggi dan berat yang valid");
        }
    }

    @FXML
    private void handleExit() {
        Platform.exit();
    }

    private double parse(TextField field) {
        return Double.parseDouble(field.getText().trim().replace(',', '.'));
    }
}
