package com.pititasCloset.ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainView {

    public BorderPane getView() {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10));

        Label header = new Label("👚 Welcome to Pitita's Closet!");
        header.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        VBox sidebar = new VBox(10);
        sidebar.setPadding(new Insets(10));
        Button viewClosetBtn = new Button("View Closet");
        Button addItemBtn = new Button("Add Clothing Item");
        Button generateOutfitBtn = new Button("Generate Outfit");

        sidebar.getChildren().addAll(viewClosetBtn, addItemBtn, generateOutfitBtn);

        layout.setTop(header);
        layout.setLeft(sidebar);

        return layout;
    }
}
