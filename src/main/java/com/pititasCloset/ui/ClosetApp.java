package com.pititasCloset.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClosetApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainView mainView = new MainView();

        Scene scene = new Scene(mainView.getView(), 800, 600);

        primaryStage.setTitle("Pitita's Closet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launches JavaFX application
    }
}
