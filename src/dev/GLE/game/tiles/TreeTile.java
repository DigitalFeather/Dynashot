package dev.GLE.game.tiles;

import dev.GLE.game.gfx.Assets;

import java.awt.image.BufferedImage;

public class TreeTile extends Tile{
    public TreeTile( int id) {
        super(Assets.tree, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
