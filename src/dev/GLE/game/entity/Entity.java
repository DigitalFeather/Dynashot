package dev.GLE.game.entity;

import dev.GLE.game.Game;
import dev.GLE.game.Handler;

import java.awt.*;

public abstract class Entity {

    public Handler handler;
    public float x;
    public float y;
    public int width;
    public int height;
    protected Rectangle bounds;

    public Entity(Handler handler, float x, float y, int width, int height){
        this.handler = handler;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

        bounds = new Rectangle(0, 0, width, height);
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }


}
