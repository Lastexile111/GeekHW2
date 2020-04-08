package ru.hw.circles;

import java.awt.*;

public class BackGround extends Sprite {

    private static final int TIMER_COUNT = 100;

    private Color color = new Color (
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );

    private int timer = 0;


    @Override
    void update(GameCanvas canvas, float deltaTime) {
        x = canvas.getHeight() / 2;
        y = canvas.getWidth() / 2;

        setBottom(canvas.getBottom());
        setTop(canvas.getTop());
        setLeft(canvas.getLeft());
        setRight(canvas.getRight());
        halfHeight = canvas.getHeight() / 2;
        halfWidth = canvas.getWidth() / 2;

        if (timer > TIMER_COUNT){
            color = new Color (
                    (int)(Math.random() * 255),
                    (int)(Math.random() * 255),
                    (int)(Math.random() * 255)
            );
            timer = 0;
        }
        timer++;

    }

    @Override
    void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillRect((int) getLeft(), (int) getTop(),
                (int) getWidth(), (int) getHeight());
    }
}
