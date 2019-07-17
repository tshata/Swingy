package main.java.controller;


import main.java.view.SpriteSheet;
import view.Display;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game implements Runnable{
    private Display display;
    public int width, height;
    private Thread thread;
    private boolean running = false;
    public String title;
    private BufferStrategy bs;
    private Graphics g;

    private BufferedImage testImage;
    private SpriteSheet sheet;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;

    }

    private void init(){

        display = new Display(title, width, height);
        Assets.init();
    }

    int x = 0;
    private void update(){
            x+=1;
    }

    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //clear scree
        g.clearRect(0,0,width, height);

        //draw on screen
        g.drawImage(Assets.player, x, 10, null);
        g.drawImage(Assets.enemy, 100, 100, null);
        bs.show();
        g.dispose();
    }

    public void run(){
        init();
        int fps = 60;
        double timePerTick;
        timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        long ticks = 0;

        while (running){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now -lastTime;
            lastTime = now;

            if(delta >= 1) {
                update();
                render();
                ticks++;
                delta--;
            }
            //print every one second the frames and ticks
            if(timer >= 1000000000){
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
        stop();
    }

    public synchronized void start(){
        if(running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        if(!running)
            return;
        running = false;
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
