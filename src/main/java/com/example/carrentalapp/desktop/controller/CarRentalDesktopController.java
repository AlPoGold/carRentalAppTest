package com.example.carrentalapp.desktop.controller;


import com.example.carrentalapp.service.CarRentalService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CarRentalDesktopController {

    @FXML
    private TextField customerIdField;

    @FXML
    private TextField carIdField;

    @FXML
    private Button bookButton;

    @FXML
    private TextField returnCarIdField;

    @FXML
    private Button returnButton;

    @FXML
    private Button refreshButton;

    public CarRentalDesktopController(CarRentalService carRentalService) {
    }

    public void handleReturnButton(ActionEvent actionEvent) {
    }

    public void handleRefreshButton(ActionEvent actionEvent) {
    }

    public void handleBookButton(ActionEvent actionEvent) {
    }

    // Implement event handlers for GUI components
}