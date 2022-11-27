package com.example.fabricmethod;

public class ShapeFactory {
    public Shape getShape(int side) {
        switch (side) {
            case 3 -> {
                return new Triangle();
            }
            case 5 -> {
                return new Pentagon();
            }
            default -> {
                return new Rectangle();
            }
        }
    }
}
