package dev.GLE.game.display;

import javax.swing.*;
import java.awt.*;

public class Display {

    private final int WIDTH;
    private final int HEIGHT;
    private final String TITLE;
    public JFrame frame;
    public static Canvas canvas = new Canvas();

    public Display(String TITLE, int WIDTH, int HEIGHT) {
        this.TITLE = TITLE;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;


        createDisplay();

    }

    private void createDisplay(){
        frame = new JFrame(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setFocusable(true);

        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();

    }
}
