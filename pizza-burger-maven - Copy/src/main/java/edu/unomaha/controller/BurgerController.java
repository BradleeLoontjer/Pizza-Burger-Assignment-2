package edu.unomaha.controller;

import edu.unomaha.burger.bun.*;
import edu.unomaha.burger.cheese.*;
import edu.unomaha.burger.garnish.*;
import edu.unomaha.burger.patty.*;

import java.util.ArrayList;
import java.util.List;

public class BurgerController {

    private BurgerBun selectedBun;
    private BurgerCheese selectedCheese;
    private BurgerPatty selectedPatty;
    private final List<BurgerGarnish> selectedGarnishes = new ArrayList<>();

    // --- Bun ---
    public void setBun(BurgerBun bun) {
        this.selectedBun = bun;
    }

    public BurgerBun getBun() {
        return selectedBun;
    }

    // --- Cheese ---
    public void setCheese(BurgerCheese cheese) {
        this.selectedCheese = cheese;
    }

    public BurgerCheese getCheese() {
        return selectedCheese;
    }

    // --- Patty ---
    public void setPatty(BurgerPatty patty) {
        this.selectedPatty = patty;
    }

    public BurgerPatty getPatty() {
        return selectedPatty;
    }

    // --- Garnishes ---
    public void addGarnish(BurgerGarnish garnish) {
        if (!selectedGarnishes.contains(garnish)) {
            selectedGarnishes.add(garnish);
        }
    }

    public void removeGarnish(BurgerGarnish garnish) {
        selectedGarnishes.remove(garnish);
    }

    public List<BurgerGarnish> getGarnishes() {
        return new ArrayList<>(selectedGarnishes);
    }

    // --- Summary (Optional for GUI display) ---
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Burger Summary:\n");
        sb.append("Bun: ").append(selectedBun != null ? selectedBun.getClass().getSimpleName() : "None").append("\n");
        sb.append("Cheese: ").append(selectedCheese != null ? selectedCheese.getClass().getSimpleName() : "None").append("\n");
        sb.append("Patty: ").append(selectedPatty != null ? selectedPatty.getClass().getSimpleName() : "None").append("\n");
        sb.append("Garnishes: ");
        if (selectedGarnishes.isEmpty()) {
            sb.append("None");
        } else {
            for (BurgerGarnish g : selectedGarnishes) {
                sb.append(g.getClass().getSimpleName()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
