package dev.GLE.game.tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    //Static Stuff

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(1);
    public static Tile rockTile = new RockTile(2);
    public static Tile bushTile = new BushTile(3);
    public static Tile treeTile = new TreeTile(4);
    public static Tile tree2Tile = new Tree2Tile(5);
    public static Tile secretBushTile = new SecretBushTile(6);

    //Class

    public static final int TILEWIDTH = 64, TILEHEIGHT = 64;

    protected BufferedImage texture;
    public final int id;

    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick(){

    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    public boolean isSolid(){
        return false;
    }

}
