package com.example.elevatorgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class deneme2Controller {


    @FXML
    private Rectangle rectangle;
    @FXML
    private Label welcomeText;
    public void upHandler() {
        //ElevatorGame.elevator.setCurrentFloor(ElevatorGame.elevator.getCurrentFloor()+1);
        ElevatorGame.elevator.goToFloor(ElevatorGame.elevator.getCurrentFloor()+1);
        rectangle.setY(rectangle.getY() - rectangle.getHeight());

    }
    public void downHandler() {
        ElevatorGame.elevator.goToFloor(ElevatorGame.elevator.getCurrentFloor()-1);
        rectangle.setY(rectangle.getY() + rectangle.getHeight());
    }
    @FXML
    public void currentFloor() {
        welcomeText.setText("Elevator is on "+ ElevatorGame.elevator.getCurrentFloor());

    }

}
