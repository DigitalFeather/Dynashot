package dev.GLE.game.entity.creature.statics;

import dev.GLE.game.Handler;
import dev.GLE.game.gfx.Assets;
import dev.GLE.game.tiles.Tile;

import java.awt.*;

public class Tree extends StaticEntity{
    public Tree(Handler handler, float x, float y) {
        super(handler, x, y , Tile.TILEWIDTH, Tile.TILEHEIGHT * 2);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.tree, (int) (x - handler.getGameCamera().xOffset), (int) (y - handler.getGameCamera().yOffset), width, height, null);
    }
}
