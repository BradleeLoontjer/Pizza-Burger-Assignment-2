package edu.unomaha.controller;

import edu.unomaha.burger.bun.*;
import edu.unomaha.burger.cheese.*;
import edu.unomaha.burger.garnish.*;
import edu.unomaha.burger.patty.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BurgerView {

    private final BurgerController burgerController = new BurgerController();

    // --- FXML UI elements ---
    @FXML private ComboBox<String> bunComboBox;
    @FXML private ComboBox<String> cheeseComboBox;
    @FXML private ComboBox<String> pattyComboBox;
    @FXML private ListView<String> garnishListView;
    @FXML private TextArea summaryArea;

    @FXML
    public void initialize() {
        // Populate ComboBoxes
        bunComboBox.getItems().addAll("Brioche", "Potato", "Sesame");
        cheeseComboBox.getItems().addAll("Asiago", "Cheddar", "Pepperjack", "Swiss");
        pattyComboBox.getItems().addAll("Beef", "Chicken", "Impossible", "Veggie");

        // Populate Garnishes
        garnishListView.getItems().addAll("Bacon", "FriedEgg", "Onions", "Pickles", "Tomato");
        garnishListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    // --- Handle Bun selection ---
    @FXML
    private void handleBunSelection() {
        String bun = bunComboBox.getValue();
        if (bun != null) {
            switch (bun) {
                case "Brioche" -> burgerController.setBun(new BriocheBun());
                case "Potato" -> burgerController.setBun(new PotatoBun());
                case "Sesame" -> burgerController.setBun(new SesameBun());
            }
        }
    }

    // --- Handle Cheese selection ---
    @FXML
    private void handleCheeseSelection() {
        String cheese = cheeseComboBox.getValue();
        if (cheese != null) {
            switch (cheese) {
                case "Asiago" -> burgerController.setCheese(new AsiagoCheese());
                case "Cheddar" -> burgerController.setCheese(new CheddarCheese());
                case "Pepperjack" -> burgerController.setCheese(new PepperjackCheese());
                case "Swiss" -> burgerController.setCheese(new SwissCheese());
            }
        }
    }

    // --- Handle Patty selection ---
    @FXML
    private void handlePattySelection() {
        String patty = pattyComboBox.getValue();
        if (patty != null) {
            switch (patty) {
                case "Beef" -> burgerController.setPatty(new BeefPatty());
                case "Chicken" -> burgerController.setPatty(new ChickenPatty());
                case "Impossible" -> burgerController.setPatty(new ImpossiblePatty());
                case "Veggie" -> burgerController.setPatty(new VeggiePatty());
            }
        }
    }

    // --- Handle Garnish selection ---
    @FXML
    private void handleGarnishSelection() {
        burgerController.getGarnishes().clear(); // reset current garnishes

        for (String garnish : garnishListView.getSelectionModel().getSelectedItems()) {
            switch (garnish) {
                case "Bacon" -> burgerController.addGarnish(new Bacon());
                case "FriedEgg" -> burgerController.addGarnish(new FriedEgg());
                case "Onions" -> burgerController.addGarnish(new Onions());
                case "Pickles" -> burgerController.addGarnish(new Pickles());
                case "Tomato" -> burgerController.addGarnish(new Tomato());
            }
        }
    }

    // --- Show Summary ---
    @FXML
    private void showSummary() {
        handleBunSelection();
        handleCheeseSelection();
        handlePattySelection();
        handleGarnishSelection();
        summaryArea.setText(burgerController.getSummary());
    }
}
