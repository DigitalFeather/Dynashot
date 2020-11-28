package dev.GLE.game;

import dev.GLE.game.display.Display;
import dev.GLE.game.gfx.Assets;
import dev.GLE.game.gfx.GameCamera;
import dev.GLE.game.input.KeyManager;
import dev.GLE.game.sfx.Music;
import dev.GLE.game.states.*;

import java.awt.*;
import java.awt.image.BufferStrategy;


public class Game implements Runnable{

    public int WIDTH, HEIGHT;
    public String TITLE;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //States
    public State gameState;
    public State menuState;
    public State pauseState;
    public State settingState;

    //Inputs
    public KeyManager keyManager;

    //Camera
    public GameCamera gameCamera;

    //Handler
    private Handler handler;


    public Game(String TITLE, int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.TITLE = TITLE;
        keyManager = new KeyManager();
    }

    private void init(){
        Display display = new Display(TITLE, WIDTH, HEIGHT);
        display.frame.addKeyListener(keyManager);
        Assets.init();

        handler = new Handler(this);
        gameCamera = new GameCamera(handler, 0, 0);



        gameState = new GameState(handler);
        menuState = new MenuState(handler);
        pauseState = new PauseState(handler);
        settingState = new SettingState(handler);
        State.setState(gameState);


    }


    private void update(){
        keyManager.tick();
        if(State.getState() != null) {
            State.getState().tick();
        }

    }

    private void render(){
        bs = Display.canvas.getBufferStrategy();
        if(bs == null){
            Display.canvas.createBufferStrategy(2);
            return;
        }
        g = bs.getDrawGraphics();
        //Clear screen
        g.clearRect(0, 0, WIDTH, HEIGHT);


        //Draw here

        if(State.getState() != null) {
            State.getState().render(g);
        }

        //Draw end
        bs.show();
        g.dispose();
    }


    @Override
    public void run() {

        init();

        double FPS = 60;
        double timePerTick = 1000000000 / FPS;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while(running){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now  - lastTime;
            lastTime = now;

            if(delta >= 1) {
                update();
                render();
                ticks++;
                delta--;
            }

            if (timer >= 1000000000){
                System.out.println("Ticks ans Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }

        stop();

    }



    public synchronized void start(){
        if(running){
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    public synchronized void stop(){
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
