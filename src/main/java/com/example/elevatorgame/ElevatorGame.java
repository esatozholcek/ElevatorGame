package com.example.elevatorgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class ElevatorGame extends Application {
    public static Elevator elevator = new Elevator();
    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("deneme7.fxml"));
        Scene scene = new Scene(root,600,500);
        stage.setTitle("Elevator Game");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Person person = new Person("Ayşe");
        Person person1 = new Person("mehmet");
        elevator.enter(person,3);
        elevator.enter(person1,4);
        launch();
    }
}