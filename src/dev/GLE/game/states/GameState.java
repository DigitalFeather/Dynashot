package dev.GLE.game.states;

import dev.GLE.game.Handler;
import dev.GLE.game.entity.creature.Player;

import dev.GLE.game.entity.creature.statics.Tree;
import dev.GLE.game.sfx.Music;
import dev.GLE.game.worlds.World;

import java.awt.*;

public class GameState extends State{

    private Player player;
    private World world;
    private Tree tree;
    private Handler handler;
    Music music = new Music();
    public GameState(Handler handler){
        super(handler);
        world = new World(handler, "/worlds/world1.lvl");
        handler.setWorld(world);
        player = new Player(handler ,100, 100);
        music.playMusic("sounds/music/nevergonna.wav");
        tree = new Tree(handler, 100, 200);
    }

    @Override
    public void tick() {
        world.tick();
        player.tick();
        tree.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        //tree.render(g);
        player.render(g);

    }
}
