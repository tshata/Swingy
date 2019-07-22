package main.java.model;

import java.awt.*;

public abstract class Entity {
    public float x, y;
    protected int width, height;


    public Entity(float x, float y, int width, int height){
        this.x = width/2;
        this.y = height/2;
        this.width = width;
        this.height = height;
    }

    public abstract void update();
    public abstract void render(Graphics g);

//    public float getX() {
//        return x;
//    }
//
//    public float getY() {
//        return y;
//    }
//
//    public void setX(float x) {
//        this.x = x;
//    }
//
//    public void setY(float y) {
//        this.y = y;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
