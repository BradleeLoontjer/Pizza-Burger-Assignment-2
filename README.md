# 🍕 Burger & Pizza Builder - JavaFX GUI Project

This project is a JavaFX-based GUI application that allows users to build their own **Burger** or **Pizza** using customizable options like buns, patties, sauces, cheese, garnishes, and toppings. It was created as part of a class assignment focused on object-oriented programming, design patterns, and GUI development in Java.

## 🚀 Features

### 🍔 Burger Builder
- Choose from different buns: Brioche, Potato, Sesame
- Pick your cheese: Cheddar, Asiago, Pepperjack, Swiss
- Select your patty: Beef, Chicken, Impossible, Veggie
- Add garnishes: Bacon, Fried Egg, Onions, Pickles, Tomato
- View a summary of your custom burger

### 🍕 Pizza Builder
- Choose a crust: Thin or Thick
- Select a sauce: Tomato or Alfredo
- Add toppings: Pepperoni, Sausage, Mushrooms, Mozzarella, Asiago, etc.
- View a summary of your custom pizza

## 🧱 Structure

- `edu.unomaha.controller` — Controllers for burger and pizza logic (`BurgerController`, `PizzaController`)
- `edu.unomaha.burger` — Burger-related components (bun, patty, cheese, garnish)
- `edu.unomaha.pizza` — Pizza-related components (crust, sauce, toppings)
- `edu.unomaha` — Main entry point (`Main.java`)
- `resources/` — FXML layouts for the GUI
- `tests/` — JUnit and TestFX-based testing

## 🧰 Tech Stack

- Java 17+
- JavaFX 17
- Maven (build tool)
- JUnit 5 / TestFX (testing)

## 🛠️ How to Run

### ✅ Prerequisites
- Java 17+
- Maven installed and added to PATH

### ▶️ Run the App
In the project directory:

```bash
mvn clean javafx:run
