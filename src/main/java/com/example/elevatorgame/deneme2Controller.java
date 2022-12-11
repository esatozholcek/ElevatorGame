package com.example.elevatorgame;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class deneme2Controller {


    @FXML
    private Rectangle rectangle;
    public void upHandler() {
        rectangle.setY(rectangle.getY() - rectangle.getHeight());
    }
    public void downHandler() {
        rectangle.setY(rectangle.getY() + rectangle.getHeight());
    }
    public void currentFloor() {
        TextField textField = new TextField(String.valueOf("Elevator is on " + ElevatorGame.elevator.getCurrentFloor()));

    }

}
