package edu.unomaha.controller;

import edu.unomaha.pizza.crust.PizzaCrust;
import edu.unomaha.pizza.sauce.PizzaSauce;
import edu.unomaha.pizza.topping.PizzaTopping;

import java.util.ArrayList;
import java.util.List;

public class PizzaController {

    private PizzaCrust selectedCrust;
    private PizzaSauce selectedSauce;
    private final List<PizzaTopping> selectedToppings = new ArrayList<>();

    // --- Crust ---
    public void setCrust(PizzaCrust crust) {
        this.selectedCrust = crust;
    }

    public PizzaCrust getCrust() {
        return selectedCrust;
    }

    // --- Sauce ---
    public void setSauce(PizzaSauce sauce) {
        this.selectedSauce = sauce;
    }

    public PizzaSauce getSauce() {
        return selectedSauce;
    }

    // --- Toppings ---
    public void addTopping(PizzaTopping topping) {
        if (!selectedToppings.contains(topping)) {
            selectedToppings.add(topping);
        }
    }

    public void removeTopping(PizzaTopping topping) {
        selectedToppings.remove(topping);
    }

    public List<PizzaTopping> getToppings() {
        return new ArrayList<>(selectedToppings);
    }

    // --- New clearToppings method ---
    public void clearToppings() {
        selectedToppings.clear();  // Clears the toppings list
    }

    // --- Summary (Optional for GUI display) ---
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza Summary:\n");
        sb.append("Crust: ").append(selectedCrust != null ? selectedCrust.getClass().getSimpleName() : "None").append("\n");
        sb.append("Sauce: ").append(selectedSauce != null ? selectedSauce.getClass().getSimpleName() : "None").append("\n");
        sb.append("Toppings: ");
        if (selectedToppings.isEmpty()) {
            sb.append("None");
        } else {
            for (PizzaTopping t : selectedToppings) {
                sb.append(t.getClass().getSimpleName()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
