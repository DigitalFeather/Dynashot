package dev.GLE.game.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {

    private BufferedImage sheet;

    public SpriteSheet(BufferedImage sheet){
        this.sheet = sheet;
    }

    public BufferedImage crop(double x, double y, int WIDTH, int HEIGHT){
        return sheet.getSubimage((int)x, (int)y, WIDTH, HEIGHT);
    }



}
