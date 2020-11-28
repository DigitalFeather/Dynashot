package dev.GLE.game.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage playerIdleUp, playerIdleDown, playerIdleLeft, playerIdleRight, grass, rock, bush,bushSecret, tree, tree2;
    public static BufferedImage[]  player_down, player_up, player_left, player_right;

    public static void init(){
        //SpriteSheet sheet1 = new SpriteSheet(ImageLoad.loadImage("/textures/scarfy.png"));

        int width = 122;
        int height = 128;
        player_up = new BufferedImage[6];
        player_down = new BufferedImage[6];
        player_left = new BufferedImage[6];
        player_right = new BufferedImage[6];

        //Up
        player_up[0]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-back/hero-walk-back-1.png");
        player_up[1]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-back/hero-walk-back-2.png");
        player_up[2]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-back/hero-walk-back-3.png");
        player_up[3]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-back/hero-walk-back-4.png");
        player_up[4]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-back/hero-walk-back-5.png");
        player_up[5]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-back/hero-walk-back-6.png");

        //Down
        player_down[0]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-front/hero-walk-front-1.png");
        player_down[1]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-front/hero-walk-front-2.png");
        player_down[2]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-front/hero-walk-front-3.png");
        player_down[3]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-front/hero-walk-front-4.png");
        player_down[4]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-front/hero-walk-front-5.png");
        player_down[5]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-front/hero-walk-front-6.png");

        //Left
        //player_left[0]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-1.png");
        //player_left[1]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-2.png");
        //player_left[2]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-3.png");
        //player_left[3]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-4.png");
       // player_left[4]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-5.png");
       // player_left[5]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-6.png");
        player_left[0]  = ImageLoad.loadImage("/sprites/hero/walk/left/1.png");
        player_left[1]  = ImageLoad.loadImage("/sprites/hero/walk/left/2.png");
         player_left[2]  = ImageLoad.loadImage("/sprites/hero/walk/left/3.png");
         player_left[3]  = ImageLoad.loadImage("/sprites/hero/walk/left/4.png");
         player_left[4]  = ImageLoad.loadImage("/sprites/hero/walk/left/5.png");
         player_left[5]  = ImageLoad.loadImage("/sprites/hero/walk/left/6.png");

        //Right
       // player_left[0]  = ImageLoad.loadImage("/sprites/hero/walk/left/1.png");
       // player_left[1]  = ImageLoad.loadImage("/sprites/hero/walk/left/2.png");
       // player_left[2]  = ImageLoad.loadImage("/sprites/hero/walk/left/3.png");
       // player_left[3]  = ImageLoad.loadImage("/sprites/hero/walk/left/4.png");
       // player_left[4]  = ImageLoad.loadImage("/sprites/hero/walk/left/5.png");
       // player_left[5]  = ImageLoad.loadImage("/sprites/hero/walk/left/6.png");
        player_right[0]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-1.png");
        player_right[1]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-2.png");
        player_right[2]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-3.png");
        player_right[3]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-4.png");
        player_right[4]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-5.png");
        player_right[5]  = ImageLoad.loadImage("/sprites/hero/walk/hero-walk-side/hero-walk-side-6.png");

        //Idle
        playerIdleUp = ImageLoad.loadImage("/sprites/hero/idle/hero-idle-back/hero-idle-back.png");
        playerIdleDown = ImageLoad.loadImage("/sprites/hero/idle/hero-idle-front/hero-idle-front.png");
        playerIdleLeft = ImageLoad.loadImage("/sprites/hero/idle/hero-idle-side/left.png");
        playerIdleRight = ImageLoad.loadImage("/sprites/hero/idle/hero-idle-side/hero-idle-side.png");
        //Tiles
        grass = ImageLoad.loadImage("/textures/Plants/grass.png");
        rock = ImageLoad.loadImage("/textures/Plants/rock.png");
        bush = ImageLoad.loadImage("/textures/Plants/bush.png");
        bushSecret = ImageLoad.loadImage("/textures/Plants/bushSecret.png");
        tree = ImageLoad.loadImage("/textures/Plants/tree-pink.png");
        tree2 = ImageLoad.loadImage("/textures/Plants/tree-orange.png");
       // playerAnim2 = sheet1.crop(128, 0, 122, 128);
       // playerAnim3 = sheet1.crop(width*2, 0, 122, 128);
       // playerAnim4 = sheet1.crop(width*3, 0, 122, 128);
       // playerAnim5 = sheet1.crop(width*4.3, 0, 122, 128);
      //  playerAnim6 = sheet1.crop(width*5.2, 0, 122, 128);


    }
}
