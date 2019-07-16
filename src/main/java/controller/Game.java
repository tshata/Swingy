package controller;

import controller.ImageLoader;
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

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;

    }

    private void init(){

        display = new Display(title, width, height);
        try {
            testImage = ImageLoader.loadImage("/images/test.png");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void update(){

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
       // g.drawRect(10,50,50,70);
        g.drawImage(testImage, 0, 0, null);
        g.setColor(Color.red);
        g.fillRect(50,50, 50, 50);
        g.setColor(Color.blue);
        g.fillRect(0,0, 50, 50);



        bs.show();
        g.dispose();
    }

    public void run(){
        init();

        while (running){
            update();
            render();
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
