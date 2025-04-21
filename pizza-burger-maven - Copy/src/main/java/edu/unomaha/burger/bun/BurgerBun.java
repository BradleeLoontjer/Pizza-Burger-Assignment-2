package edu.unomaha.burger.bun;

import edu.unomaha.pizza.AbstractMenuItem;

public abstract class BurgerBun extends AbstractMenuItem {
    protected String ingredient;

    public abstract String toString();

    public String toNiceString() {
        return "Bun is: " + toString() + " (" + ingredient + ")";
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String ing) {
        this.ingredient = ing;
    }

    public String checkIntegrity() {
        return "";
    }

    public Double getPrice() {
        return 0.65; // default price for bun
    }
}
