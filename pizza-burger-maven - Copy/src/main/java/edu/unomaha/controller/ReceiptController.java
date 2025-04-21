package edu.unomaha.controller;

import edu.unomaha.pizza.MenuItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReceiptController {

    private final List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public List<MenuItem> getItems() {
        return new ArrayList<>(items); // Return a copy to prevent external modification
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();
    }

    public List<MenuItem> getSortedItemsByPrice() {
        List<MenuItem> sorted = new ArrayList<>(items);
        sorted.sort((a, b) -> ((Comparable<MenuItem>) a).compareTo(b));
        return sorted;
    }
    

    public String generateReceipt() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receipt:\n");
        for (MenuItem item : getSortedItemsByPrice()) {
            sb.append(item.toNiceString()).append(" - $").append(String.format("%.2f", item.getPrice())).append("\n");
        }
        sb.append("\nTotal: $").append(String.format("%.2f", getTotalPrice()));
        return sb.toString();
    }

    public void clearReceipt() {
        items.clear();
    }
}
