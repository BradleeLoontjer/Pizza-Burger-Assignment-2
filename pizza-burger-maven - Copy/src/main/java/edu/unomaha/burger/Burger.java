package edu.unomaha.burger;

import java.util.ArrayList;
import java.util.Collections;

import edu.unomaha.pizza.AbstractMenuItem;
import edu.unomaha.pizza.MenuItem;
import edu.unomaha.burger.bun.BurgerBun;
import edu.unomaha.burger.patty.BurgerPatty;
import edu.unomaha.burger.cheese.BurgerCheese;
import edu.unomaha.burger.garnish.BurgerGarnish;

public class Burger extends AbstractMenuItem {

    private BurgerBun bun;
    private ArrayList<BurgerPatty> patties;
    private ArrayList<BurgerCheese> cheeses;
    private ArrayList<BurgerGarnish> garnishes;
    private ArrayList<AbstractMenuItem> burgerComponents;

    public Burger() {
        this.patties = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.garnishes = new ArrayList<>();
        this.burgerComponents = new ArrayList<>();
    }

    // Bun
    public BurgerBun getBun() {
        return bun;
    }

    public void setBun(BurgerBun bun) {
        this.bun = bun;
        this.addComponent(bun);
    }

    // Patties
    public void addPatty(BurgerPatty patty) {
        if (patties.size() < 4) {
            this.patties.add(patty);
            this.addComponent(patty);
        }
    }

    public ArrayList<BurgerPatty> getPatties() {
        return patties;
    }

    // Cheeses
    public void addCheese(BurgerCheese cheese) {
        if (cheeses.size() < 4) {
            this.cheeses.add(cheese);
            this.addComponent(cheese);
        }
    }

    public ArrayList<BurgerCheese> getCheeses() {
        return cheeses;
    }

    // Garnishes
    public void addGarnish(BurgerGarnish garnish) {
        if (garnishes.size() < 4) {
            this.garnishes.add(garnish);
            this.addComponent(garnish);
        }
    }

    public ArrayList<BurgerGarnish> getGarnishes() {
        return garnishes;
    }

    // Component tracking
    public ArrayList<AbstractMenuItem> getComponents() {
        return burgerComponents;
    }

    public void addComponent(AbstractMenuItem item) {
        this.burgerComponents.add(item);
    }

    // Descriptions
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bun);

        for (BurgerPatty p : patties) sb.append(", ").append(p);
        for (BurgerCheese c : cheeses) sb.append(", ").append(c);
        for (BurgerGarnish g : garnishes) sb.append(", ").append(g);

        return sb.toString();
    }

    public String toNiceString() {
        return "Burger is: " + toString();
    }

    // Display
    public void display() {
        for (MenuItem m : burgerComponents) {
            System.out.printf("%s $%.2f\n", m.toNiceString(), m.getPrice());
        }
    }

    public void displaySorted() {
        Collections.sort(this.burgerComponents);
        display();
    }

    // Price
    public Double getPrice() {
        double total = 0.0;
        for (MenuItem m : burgerComponents) {
            total += m.getPrice();
        }
        return total;
    }
}

