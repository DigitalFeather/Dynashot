package dev.GLE.game.entity.creature;

import dev.GLE.game.Game;
import dev.GLE.game.Handler;
import dev.GLE.game.entity.Entity;
import dev.GLE.game.tiles.Tile;

public abstract class creature extends Entity {
    public int health;
    public float speed;
    public float xMove, yMove;

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 64;
    public static final int DEFAULT_CREATURE_HEIGHT = 64;


    public creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }

    public void move(){
        moveX();
        moveY();
    }

    public void moveX(){
        if (xMove > 0){ //Move Right

            int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;
            if(!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
                x += xMove;
            }else {
                x = tx * Tile.TILEWIDTH - bounds.x - bounds.width - 1;
            }

        } else if (xMove < 0){//Move Left
            int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;
            if(!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
                x += xMove;
            } else{
                x = tx * Tile.TILEWIDTH + Tile.TILEWIDTH - bounds.x;
            }
        }
    }

    public void moveY(){
        if(yMove < 0 ){//Up
            int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

                    if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
                            !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)   ){
                        y += yMove;
                    } else{
                        y = ty * Tile.TILEHEIGHT + Tile.TILEHEIGHT - bounds.y;
                    }

        }else if( yMove > 0){//Down
            int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

            if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
                    !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)   ){
                y += yMove;
            } else{
                y = ty * Tile.TILEHEIGHT - bounds.y - bounds.height - 1;
            }
        }
    }

    protected boolean collisionWithTile(int x, int y){
        return handler.getWorld().getTile(x, y).isSolid();
    }
}