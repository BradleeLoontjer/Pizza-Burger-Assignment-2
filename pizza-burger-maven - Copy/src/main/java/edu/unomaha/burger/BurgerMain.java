package edu.unomaha.burger;

import java.util.Scanner;

import edu.unomaha.burger.bun.*;
import edu.unomaha.burger.patty.*;
import edu.unomaha.burger.cheese.*;
import edu.unomaha.burger.garnish.*;

public class BurgerMain {
    private Burger burger;
    private Scanner input;

    public BurgerMain() {
        burger = new Burger();
        input = new Scanner(System.in);
    }

    private void inputBunChoice() {
        boolean validChoice = false;
        System.out.println("Choose your bun:");
        System.out.println("1 - Brioche");
        System.out.println("2 - Sesame");
        System.out.println("3 - Potato");
        while (!validChoice) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    burger.setBun(new BriocheBun());
                    validChoice = true;
                    break;
                case 2:
                    burger.setBun(new SesameBun());
                    validChoice = true;
                    break;
                case 3:
                    burger.setBun(new PotatoBun());
                    validChoice = true;
                    break;
                default:
                    System.out.println("Please choose between 1-3.");
            }
        }
    }

    private void inputPattyChoice() {
        System.out.print("How many patties would you like? ");
        int numPatties = input.nextInt();
        for (int i = 0; i < numPatties; i++) {
            boolean validChoice = false;
            System.out.println("Choose patty type:");
            System.out.println("1 - Beef");
            System.out.println("2 - Chicken");
            System.out.println("3 - Veggie");
            System.out.println("4 - Impossible");
            while (!validChoice) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        burger.addPatty(new BeefPatty());
                        validChoice = true;
                        break;
                    case 2:
                        burger.addPatty(new ChickenPatty());
                        validChoice = true;
                        break;
                    case 3:
                        burger.addPatty(new VeggiePatty());
                        validChoice = true;
                        break;
                    case 4:
                        burger.addPatty(new ImpossiblePatty());
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Choose 1-4.");
                }
            }
        }
    }

    private void inputCheeseChoice() {
        System.out.print("How many cheeses? ");
        int numCheeses = input.nextInt();
        for (int i = 0; i < numCheeses; i++) {
            boolean validChoice = false;
            System.out.println("Choose cheese:");
            System.out.println("1 - Cheddar");
            System.out.println("2 - Swiss");
            System.out.println("3 - Pepperjack");
            System.out.println("4 - Asiago");
            while (!validChoice) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        burger.addCheese(new CheddarCheese());
                        validChoice = true;
                        break;
                    case 2:
                        burger.addCheese(new SwissCheese());
                        validChoice = true;
                        break;
                    case 3:
                        burger.addCheese(new PepperjackCheese());
                        validChoice = true;
                        break;
                    case 4:
                        burger.addCheese(new AsiagoCheese());
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Choose 1-4.");
                }
            }
        }
    }

    private void inputGarnishChoice() {
        System.out.print("How many garnishes? ");
        int numGarnishes = input.nextInt();
        for (int i = 0; i < numGarnishes; i++) {
            boolean validChoice = false;
            System.out.println("Choose garnish:");
            System.out.println("1 - Tomato");
            System.out.println("2 - Pickles");
            System.out.println("3 - Onions");
            System.out.println("4 - Fried Egg");
            System.out.println("5 - Bacon");
            while (!validChoice) {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        burger.addGarnish(new Tomato());
                        validChoice = true;
                        break;
                    case 2:
                        burger.addGarnish(new Pickles());
                        validChoice = true;
                        break;
                    case 3:
                        burger.addGarnish(new Onions());
                        validChoice = true;
                        break;
                    case 4:
                        burger.addGarnish(new FriedEgg());
                        validChoice = true;
                        break;
                    case 5:
                        burger.addGarnish(new Bacon());
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Choose 1-5.");
                }
            }
        }
    }

    private void showBurger() {
        System.out.println("\nBurger Details (Sorted):");
        burger.displaySorted();
        System.out.printf("\nFinal Burger:\n%s $%.2f\n", burger.toNiceString(), burger.getPrice());
    }

    public void runMenu() {
        inputBunChoice();
        inputPattyChoice();
        inputCheeseChoice();
        inputGarnishChoice();
        showBurger();
    }

    public static void main(String[] args) {
        BurgerMain bm = new BurgerMain();
        bm.runMenu();
    }
}
