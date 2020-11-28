package dev.GLE.game.entity.creature;

import dev.GLE.game.Handler;
import dev.GLE.game.gfx.Animation;
import dev.GLE.game.gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends creature{

    //Animations
    private Animation animUp, animDown, animLeft, animRight;
    private String lastAnimation = "";

   // private Game game;

    public Player(Handler handler, float x, float y){
        super(handler, x, y, creature.DEFAULT_CREATURE_WIDTH, creature.DEFAULT_CREATURE_HEIGHT);

        bounds.x = 23;
        bounds.y = 42;
        bounds.width = 15;
        bounds.height = 18;

        //Animations
        animUp = new Animation(125, Assets.player_up);
        animDown = new Animation(125, Assets.player_down);
        animLeft = new Animation(125, Assets.player_left);
        animRight = new Animation(125, Assets.player_right);
    }

    @Override
    public void tick() {
        //Animations
        animUp.tick();
        animDown.tick();
        animLeft.tick();
        animRight.tick();
        //Movement
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);

    }
    private void getInput(){
        xMove = 0;
        yMove = 0;

        if(handler.getKeyManager().up){
            yMove = -speed;
        }
        if(handler.getKeyManager().down){
            yMove = speed;
        }
        if(handler.getKeyManager().left){
            xMove = -speed;
        }
        if(handler.getKeyManager().right){
            xMove= speed;
        }
    }

    public void setLastAnimation(String lastAnimation){
        this.lastAnimation = lastAnimation;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimFrame(), (int) (x - handler.getGameCamera().xOffset), (int) (y - handler.getGameCamera().yOffset), width, height, null);

        //g.setColor(Color.red);
        //g.fillRect((int) (x + bounds.x - handler.getGameCamera().xOffset),
        //        (int) (y + bounds.y - handler.getGameCamera().yOffset),
        //        bounds.width, bounds.height);
    }

    private BufferedImage getCurrentAnimFrame(){
        if(xMove < 0){
            setLastAnimation("left");
            return animLeft.getCurrentFrame();
        } else if (xMove > 0){
            setLastAnimation("right");
            return animRight.getCurrentFrame();
        } else if(yMove < 0){
            setLastAnimation("up");
            return animUp.getCurrentFrame();
        } else if (yMove > 0){
            setLastAnimation("down");
            return animDown.getCurrentFrame();
        } else {
            if(lastAnimation.equals("up")){
                return Assets.playerIdleUp;
            }else if(lastAnimation.equals("down")){
                return Assets.playerIdleDown;
            } else if(lastAnimation.equals("left")){
                return Assets.playerIdleLeft;
            }else if(lastAnimation.equals("right")){
                return Assets.playerIdleRight;
            }else{
                return Assets.playerIdleDown;
            }
        }
    }


}
