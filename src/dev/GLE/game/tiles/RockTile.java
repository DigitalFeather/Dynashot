package dev.GLE.game.tiles;

import dev.GLE.game.gfx.Assets;

import java.awt.image.BufferedImage;

public class RockTile extends Tile{
    public RockTile(int id) {
        super(Assets.rock, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
