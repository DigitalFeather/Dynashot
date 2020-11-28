package dev.GLE.game.tiles;

import dev.GLE.game.gfx.Assets;

import java.awt.image.BufferedImage;

public class SecretBushTile extends Tile{

    public SecretBushTile(int id) {
        super(Assets.bushSecret, id);
    }
    @Override
    public boolean isSolid(){
        return false;
    }
}
