package dev.GLE.game.worlds;

import dev.GLE.game.Game;
import dev.GLE.game.Handler;
import dev.GLE.game.tiles.Tile;
import dev.GLE.game.utils.Utils;

import java.awt.*;

public class World {

    private Handler handler;
    public int WIDTH, HEIGHT;
    private int spawnX, spawnY;
    private int[][] tiles;

    public World(Handler handler, String path){
        this.handler = handler;
        loadWorld(path);


    }

    public void tick(){

    }

    public void render(Graphics g){
        int xStart = (int)Math.max(0, handler.getGameCamera().xOffset / Tile.TILEWIDTH), yStart = (int) Math.max(0, handler.getGameCamera().yOffset / Tile.TILEHEIGHT);
        int xEnd = (int) Math.min(WIDTH, (handler.getGameCamera().xOffset + handler.getWidth()) / Tile.TILEWIDTH + 1), yEnd = (int) Math.min(HEIGHT, (handler.getGameCamera().yOffset + handler.getHeight()) / Tile.TILEHEIGHT + 1);

        for (int y = yStart;y < yEnd;y++){
            for(int x = xStart;x < xEnd;x++){
                getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().xOffset), (int) (y * Tile.TILEHEIGHT - handler.getGameCamera().yOffset));
            }
        }
    }

    public Tile getTile(int x, int y){
        if(x < 0 || y < 0 || x >= WIDTH || y >= HEIGHT){
            return Tile.grassTile;
        }

        Tile t = Tile.tiles[tiles[x][y]];
        if(t == null){
            return Tile.grassTile;
        }
        return t;
    }

    private void loadWorld(String path){
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        WIDTH = Utils.parseInt(tokens[0]);
        HEIGHT = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new int[WIDTH][HEIGHT];
        for (int y = 0;y<HEIGHT;y++){
            for (int x = 0;x<HEIGHT;x++){
                tiles[x][y] = Utils.parseInt(tokens[(x+y*WIDTH) + 4]);
            }
        }


    }



}
