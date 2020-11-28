package dev.GLE.game.entity.creature.statics;

import dev.GLE.game.Handler;
import dev.GLE.game.entity.Entity;

public abstract class StaticEntity extends Entity {


    public StaticEntity(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
    }
}
