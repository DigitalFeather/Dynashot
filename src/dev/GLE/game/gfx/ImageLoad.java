package dev.GLE.game.gfx;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoad {

    public static BufferedImage loadImage(String path){
        try {
            return ImageIO.read(ImageLoad.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
