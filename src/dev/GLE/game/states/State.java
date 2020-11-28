package dev.GLE.game.states;

import dev.GLE.game.Handler;

import java.awt.*;

public abstract class State {
    //Manager

    private static State currentState = null;

    public static void setState(State state){
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }

    //Class
    protected Handler handler;

    public State(Handler handler){
        this.handler = handler;
    }

    public abstract void tick();

    public abstract void render(Graphics g);
}
