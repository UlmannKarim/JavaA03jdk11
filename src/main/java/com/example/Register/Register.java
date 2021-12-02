package com.example.Register;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Register extends Application {

    @Override //start is abstract in Application class
    public void start(Stage stage) throws Exception {
        GridPane gp;
        Scene scene;

        stage.setTitle("CS3318 A03");
        gp = build();
        makePretty(gp);
        scene = new Scene(gp, 800, 500);
        stage.setScene(scene);
        stage.show();
    }

    private GridPane build() {
        ColumnConstraints cC2;
        ColumnConstraints cC;
        GridPane gp;
        Pos center = Pos.CENTER;
        HPos right = HPos.RIGHT;

        gp = new GridPane();
        gp.setAlignment(center);
        gp.setPadding(new Insets(40, 40, 40, 40));

        cC = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        cC.setHalignment(right);

        cC2 = new ColumnConstraints(200,200, Double.MAX_VALUE);
        gp.getColumnConstraints().addAll(cC, cC2);
        return gp;
    }

    private void makePretty(GridPane gp) {
        Label head;
        Label email;
        TextField emailBox;
        Label pass;
        PasswordField passBox;
        HPos center = HPos.CENTER;

        head = new Label("REGISTER.");
        head.setFont(Font.font("Helvetica", FontWeight.EXTRA_BOLD, 24));
        gp.add(head, 0,0,6,1);
        gp.setMargin(head, new Insets(25, 0,35,0));
        gp.setHalignment(head, center);

        email = new Label("Email  ");
        email.setFont(Font.font("Helvetica", FontPosture.ITALIC, 18));
        gp.add(email, 0, 1);

        emailBox = new TextField();
        emailBox.setPrefHeight(45);
        emailBox.setPrefWidth(100);
        gp.add(emailBox, 1, 2);

        pass = new Label("Password ");
        pass.setFont(Font.font("Helvetica", FontPosture.ITALIC, 18));
        gp.add(pass, 0, 3);

        passBox = new PasswordField();
        passBox.setPrefHeight(45);
        passBox.setPrefWidth(100);
        gp.add(passBox, 1, 4);

        Button SUBMIT = new Button("SUBMIT");
        SUBMIT.setFont(Font.font("Helvetica", FontPosture.ITALIC, 18));
        SUBMIT.setPrefHeight(40);
        SUBMIT.setPrefWidth(100);
        SUBMIT.setDefaultButton(true);
        gp.add(SUBMIT, 0, 6, 2, 1);
        gp.setHalignment(SUBMIT, center);
        gp.setMargin(SUBMIT, new Insets(25, 0,25,0));

        gp.setStyle("-fx-background-color: coral;");


    }

    public static void main(String[] args) {
        launch(args);
    }
}