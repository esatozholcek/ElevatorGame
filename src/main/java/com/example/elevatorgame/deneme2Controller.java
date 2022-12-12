package com.example.elevatorgame;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;

public class deneme2Controller {


    @FXML
    private Rectangle rectangle;
    @FXML
    private Label currentFloorText;
    @FXML
    private Label numReachedPeopleText;
    @FXML
    private Label numElevatorMovedText;
    @FXML
    private Label nameFirstPersonText;
    @FXML
    private Label numOfPeopleText;
    @FXML
    private TextField name;
    @FXML
    private TextField target;
    private int numOfElevatorMoved=0;

    //String hbox2
    String string = new String("hbox" + ElevatorGame.elevator.getCurrentFloor());
    public void upHandler() {
        if ((ElevatorGame.elevator.getCurrentFloor() +1 ) > ElevatorGame.elevator.getMaxFloor()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("This floor does not exist");
            alert.showAndWait();
        } else {
            ElevatorGame.elevator.goToFloor(ElevatorGame.elevator.getCurrentFloor() + 1);
            rectangle.setY(rectangle.getY() - rectangle.getHeight());
            currentFloorText.setText("Elevator is on " + ElevatorGame.elevator.getCurrentFloor());

            numReachedPeopleText.setText("Number of reached people : " + ElevatorGame.elevator.getNumReachedPeople());

            numOfElevatorMoved++;
            numElevatorMovedText.setText("Travel meter : " + numOfElevatorMoved);

            if(ElevatorGame.elevator.isEmpty() == true) {
                nameFirstPersonText.setText("Elevator is empty");
            } else {
                //numOfPeopleText.setText(""+ ElevatorGame.elevator.getPeopleSize());
                nameFirstPersonText.setText("Name of the first person " + ElevatorGame.elevator.getNameFirstPerson());
            }

        }

    }
    public void downHandler() {
        if ((ElevatorGame.elevator.getCurrentFloor()-1) < ElevatorGame.elevator.getMinFloor()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("This floor does not exist");
            alert.showAndWait();
        } else {
            ElevatorGame.elevator.goToFloor(ElevatorGame.elevator.getCurrentFloor() - 1);
            rectangle.setY(rectangle.getY() + rectangle.getHeight());
            currentFloorText.setText("Elevator is on " + ElevatorGame.elevator.getCurrentFloor());
            numReachedPeopleText.setText("Number of reached people : " + ElevatorGame.elevator.getNumReachedPeople());
            numOfElevatorMoved++;
            numElevatorMovedText.setText("Travel meter : " + numOfElevatorMoved);
            if(ElevatorGame.elevator.isEmpty() == true) {
                nameFirstPersonText.setText("Elevator is empty");
            } else
                nameFirstPersonText.setText("Name of the first person " + ElevatorGame.elevator.getNameFirstPerson());
        }
    }

    public void enterPerson() {
        ElevatorGame.elevator.enter(new Person(name.getText()), Integer.parseInt(target.getText()));
        name.clear();
        target.clear();
    }




}
