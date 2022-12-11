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
import java.util.ArrayList;

public class ElevatorGame extends Application {
    public static Elevator elevator = new Elevator();
    @Override
    public void start(Stage stage) throws IOException {


        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);


        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("deneme2.fxml"));
        Scene scene = new Scene(root,600,500);
        stage.setTitle("Elevator Game");
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}