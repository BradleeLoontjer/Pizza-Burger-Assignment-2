package edu.unomaha.burger.garnish;

import edu.unomaha.pizza.AbstractMenuItem;

public abstract class BurgerGarnish extends AbstractMenuItem {
    protected String type;

    public abstract String toString();

    public String toNiceString() {
        return "Garnish: " + toString() + " (" + type + ")";
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
        return 0.63; // Default garnish price
    }
}
