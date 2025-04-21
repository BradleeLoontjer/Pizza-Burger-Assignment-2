package edu.unomaha.burger.patty;

import edu.unomaha.pizza.AbstractMenuItem;

public abstract class BurgerPatty extends AbstractMenuItem {
    protected String style;

    public abstract String toString();

    public String toNiceString() {
        return "Patty: " + toString() + " (" + style + ")";
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String s) {
        this.style = s;
    }

    public String checkIntegrity() {
        return "";
    }

    public Double getPrice() {
        return 1.25; // base price for a patty
    }
}
