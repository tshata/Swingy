package main.java.model;

import java.awt.*;


public class Player extends Hero {

    private  Player player;

    public Player(float x, float y){
        super(x, y);
    }
    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
      //  g.drawImage(Player, (int) x, (int) y, null);
    }
}
