package com.example.fabricmethod;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class MyController {

    public Canvas canvas;
    public Button buildButton;
    public TextField textField;

    public void initialize() {
        buildButton.onActionProperty().set(actionEvent -> {
            Pattern pattern = Pattern.compile("\\d");
            if (pattern.matcher(textField.getText()).find()) {
                int value = Integer.parseInt(textField.getText());
                System.out.println(value);
                drawShape(value);
            }
        });
    }

    public void drawShape(int side) {
        new ShapeFactory().getShape(side).draw(canvas.getGraphicsContext2D());
    }
}