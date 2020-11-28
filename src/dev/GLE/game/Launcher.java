package dev.GLE.game;

import dev.GLE.game.display.Display;

public class Launcher {
    public static void main(String[] args) {
        Game game = new Game("2D Test Game!", 1000, 600);
        game.start();
    }
}
