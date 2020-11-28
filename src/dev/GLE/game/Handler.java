package dev.GLE.game;

import dev.GLE.game.gfx.GameCamera;
import dev.GLE.game.input.KeyManager;
import dev.GLE.game.worlds.World;

public class Handler {

    public Game game;
    public World world;

    public Handler(Game game){
        this.game = game;
    }

    public KeyManager getKeyManager(){
        return game.keyManager;
    }

    public GameCamera getGameCamera(){
        return game.gameCamera;
    }

    public int getWidth(){
        return game.WIDTH;
    }

    public int getHeight(){
        return game.HEIGHT;
    }

    public Game getGame(){
        return game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world){
        this.world = world;
    }


}
