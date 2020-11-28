package dev.GLE.game.tiles;

import dev.GLE.game.gfx.Assets;

import java.awt.image.BufferedImage;

public class Tree2Tile extends Tile{
    public Tree2Tile( int id) {
        super(Assets.tree2, id);
    }

    @Override
    public boolean isSolid(){
        return false;
    }
}
