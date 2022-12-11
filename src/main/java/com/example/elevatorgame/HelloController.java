package com.example.elevatorgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private Rectangle rectangle0;
    @FXML
    private Rectangle rectangle1;
    @FXML
    private Rectangle rectangle2;
    @FXML
    private Rectangle rectangle3;
    @FXML
    private Rectangle rectangle4;
    @FXML
    private Rectangle rectangle5;
    @FXML
    private Rectangle rectangle6;

    Elevator elevator = new Elevator();

    @FXML
    public void fill() {
        rectangle0.setFill(Color.WHITE);
    }

    @FXML
    public void upHandler(ActionEvent e) {
        fillBlue();

        elevator.goToFloor(elevator.getCurrentFloor() + 1);
        fillWhite();

    }

    public void downHandler() {
        fillBlue();
        elevator.goToFloor(elevator.getCurrentFloor() - 1);
        fillWhite();

    }

    public void fillBlue() {
        switch (elevator.getCurrentFloor()) {
            case 0:
                rectangle0.setFill(Color.DODGERBLUE);
                break;
            case 1:
                rectangle1.setFill(Color.DODGERBLUE);
                break;
            case 2:
                rectangle2.setFill(Color.DODGERBLUE);
                break;
            case 3:
                rectangle3.setFill(Color.DODGERBLUE);
                break;
            case 4:
                rectangle4.setFill(Color.DODGERBLUE);
                break;
            case 5:
                rectangle5.setFill(Color.DODGERBLUE);
                break;
            case 6:
                rectangle6.setFill(Color.DODGERBLUE);
                break;
            default:
        }
    }

    public void fillWhite() {
        switch (elevator.getCurrentFloor()) {
            case 0:
                rectangle0.setFill(Color.WHITE);
                break;
            case 1:
                rectangle1.setFill(Color.WHITE);
                break;
            case 2:
                rectangle2.setFill(Color.WHITE);
                break;
            case 3:
                rectangle3.setFill(Color.WHITE);
                break;
            case 4:
                rectangle4.setFill(Color.WHITE);
                break;
            case 5:
                rectangle5.setFill(Color.WHITE);
                break;
            case 6:
                rectangle6.setFill(Color.WHITE);
                break;
            default:

        }

    }
}