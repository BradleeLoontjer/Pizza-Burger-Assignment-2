package edu.unomaha.burger.cheese;

import edu.unomaha.pizza.AbstractMenuItem;

public abstract class BurgerCheese extends AbstractMenuItem {
    protected String type;

    public abstract String toString();

    public String toNiceString() {
        return "Cheese: " + toString() + " (" + type + ")";
    }

    public String getType() {
        return this.type;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String checkIntegrity() {
        return "";
    }

    public Double getPrice() {
        return 0.53; // Default cheese price
    }
}
