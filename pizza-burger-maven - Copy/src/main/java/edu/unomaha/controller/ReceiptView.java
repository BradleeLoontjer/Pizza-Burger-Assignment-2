package edu.unomaha.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

public class ReceiptView {

    @FXML
    private TextArea receiptArea;

    private static ReceiptController receiptController = new ReceiptController();

    public static void setReceiptController(ReceiptController controller) {
        receiptController = controller;
    }

    @FXML
    public void initialize() {
        if (receiptController != null) {
            receiptArea.setText(receiptController.generateReceipt());
        }
    }

    @FXML
    public void handleClearReceipt(ActionEvent event) {
        if (receiptController != null) {
            receiptController.clearReceipt();
            receiptArea.clear();
        }
    }

    @FXML
    public void handleBackToBuilder(ActionEvent event) {
        // Add scene switching logic to go back to main or builder screen
        System.out.println("Back to builder screen clicked.");
    }
}
