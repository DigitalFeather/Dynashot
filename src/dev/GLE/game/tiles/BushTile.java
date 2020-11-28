package dev.GLE.game.tiles;

import dev.GLE.game.gfx.Assets;

import java.awt.image.BufferedImage;

public class BushTile extends Tile{
    public BushTile(int id) {
        super(Assets.bush, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
