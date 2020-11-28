package dev.GLE.game.gfx;

import dev.GLE.game.Game;
import dev.GLE.game.Handler;
import dev.GLE.game.entity.Entity;
import dev.GLE.game.states.GameState;
import dev.GLE.game.tiles.Tile;

public class GameCamera {

    Game game;
    private Handler handler = new Handler(game);
    public float xOffset, yOffset;

    public GameCamera(Handler handler, float xOffSet, float yOffSet){
        this.handler = handler;
        this.xOffset = xOffSet;
        this.yOffset = yOffSet;
    }

    public void checkBlankSpace(){
        if(xOffset < 0){
            xOffset = 0;
        } else if(xOffset > handler.getWorld().WIDTH * Tile.TILEWIDTH - handler.getWidth()){
            xOffset = handler.getWorld().WIDTH * Tile.TILEWIDTH - handler.getWidth();
       }
        if(yOffset < 0){
            yOffset = 0;
        } else if (yOffset > handler.getWorld().HEIGHT * Tile.TILEHEIGHT - handler.getHeight()){
            yOffset = handler.getWorld().HEIGHT * Tile.TILEHEIGHT - handler.getHeight();
        }
    }


    public void centerOnEntity(Entity e){
        if (handler == null){
            System.out.println("Handler is null");
            return;
        }

        xOffset = e.getX() - handler.getWidth() / 2 + e.width /2 ;
        yOffset = e.getY() - handler.getHeight() / 2 + e.height / 2;
        checkBlankSpace();
    }

    public void move(float xAmt, float yAmt){
        xOffset += xAmt;
        yOffset += yAmt;
        checkBlankSpace();

    }
}
