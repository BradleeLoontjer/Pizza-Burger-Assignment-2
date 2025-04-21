package edu.unomaha.controller;

import edu.unomaha.controller.PizzaController;
import edu.unomaha.pizza.crust.*;
import edu.unomaha.pizza.sauce.*;
import edu.unomaha.pizza.topping.*;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PizzaView {

    private final PizzaController pizzaController = new PizzaController();

    @FXML
    private ComboBox<String> crustComboBox;

    @FXML
    private ComboBox<String> sauceComboBox;

    @FXML
    private CheckBox asiagoCheckBox, cheeseCheckBox, meatCheckBox, mozzarellaCheckBox, mushroomCheckBox,
            pepperoniCheckBox, pepperCheckBox, pizzaCheckBox, sausageCheckBox, veggieCheckBox;

    @FXML
    private TextArea summaryArea;

    @FXML
    public void initialize() {
        // Load crust options
        crustComboBox.getItems().addAll("ThinCrust", "ThickCrust");

        // Load sauce options
        sauceComboBox.getItems().addAll("TomatoSauce", "AlfredoSauce");

        // Optional: Set default selections
        crustComboBox.getSelectionModel().selectFirst();
        sauceComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    private void handleGetSummary() {
        // Set crust
        String crust = crustComboBox.getValue();
        switch (crust) {
            case "ThinCrust" -> pizzaController.setCrust(new ThinCrust());
            case "ThickCrust" -> pizzaController.setCrust(new ThickCrust());
        }

        // Set sauce
        String sauce = sauceComboBox.getValue();
        switch (sauce) {
            case "TomatoSauce" -> pizzaController.setSauce(new TomatoSauce());
            case "AlfredoSauce" -> pizzaController.setSauce(new AlfredoSauce());
        }

        // Clear old toppings
        pizzaController.clearToppings();

        // Add selected toppings
        if (asiagoCheckBox.isSelected()) pizzaController.addTopping(new AsiagoTopping());
        if (mozzarellaCheckBox.isSelected()) pizzaController.addTopping(new MozzarellaTopping());
        if (mushroomCheckBox.isSelected()) pizzaController.addTopping(new MushroomTopping());
        if (pepperoniCheckBox.isSelected()) pizzaController.addTopping(new PepperoniTopping());
        if (pepperCheckBox.isSelected()) pizzaController.addTopping(new PepperTopping());
        if (sausageCheckBox.isSelected()) pizzaController.addTopping(new SausageTopping());

        // Display summary
        summaryArea.setText(pizzaController.getSummary());
    }
}
