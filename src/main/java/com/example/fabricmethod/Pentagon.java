package com.example.fabricmethod;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pentagon implements Shape{
    @Override
    public void draw(GraphicsContext graphicsContext) {
        double width = graphicsContext.getCanvas().getWidth();
        double height = graphicsContext.getCanvas().getHeight();
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(0, 0, width, height);
        graphicsContext.setStroke(Color.BLACK);
        graphicsContext.beginPath();
        graphicsContext.moveTo(width/2, 0);
        graphicsContext.lineTo(0, height/2);
        graphicsContext.moveTo(0, height/2);
        graphicsContext.lineTo(width/5, height);
        graphicsContext.moveTo(width/5, height);
        graphicsContext.lineTo(width/5 * 4, height);
        graphicsContext.moveTo(width/5 * 4, height);
        graphicsContext.lineTo(width, height/2);
        graphicsContext.moveTo(width, height/2);
        graphicsContext.lineTo(width/2, 0);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }
}
