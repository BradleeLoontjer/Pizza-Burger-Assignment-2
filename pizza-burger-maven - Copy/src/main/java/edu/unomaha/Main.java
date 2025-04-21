package edu.unomaha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage stage) {
        this.primaryStage = stage;

        Button pizzaButton = new Button("Build a Pizza");
        Button burgerButton = new Button("Build a Burger");
        Button receiptButton = new Button("View Receipt");

        pizzaButton.setOnAction(e -> showScene("PizzaView.fxml", "Build a Pizza"));
        burgerButton.setOnAction(e -> showScene("BurgerView.fxml", "Build a Burger"));
        receiptButton.setOnAction(e -> showScene("ReceiptView.fxml", "Receipt"));

        VBox layout = new VBox(15);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");
        layout.getChildren().addAll(pizzaButton, burgerButton, receiptButton);

        Scene mainScene = new Scene(layout, 300, 200);
        stage.setTitle("FastFood Order App");
        stage.setScene(mainScene);
        stage.show();
    }

    private void showScene(String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/" + fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle(title);
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
