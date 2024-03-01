package com.example.carrentalapp.desktop;

import com.example.carrentalapp.HelloApplication;
import com.example.carrentalapp.desktop.controller.CarRentalDesktopController;
import com.example.carrentalapp.service.CarRentalService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    private CarRentalService carRentalService = new CarRentalService(); // Initialize with your actual service implementation

    @Override
    public void start(Stage primaryStage) throws Exception {
//        System.setProperty("javafx.fxml.allowLambda", "true");
//        FXMLLoader loader = new FXMLLoader(Main.class.getResource("com/example/carrentalapp/CarRentalDesktop.fxml"));
//        loader.setController(new CarRentalDesktopController(carRentalService));



        Parent root = FXMLLoader.load(getClass().getResource("com/example/carrentalapp/desktop/view/CarRentalDesktop.fxml"));

        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Car Rental System");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
