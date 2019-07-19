package main.java.model;

import main.java.controller.Assets;
import main.java.controller.Game;

import java.awt.*;


public class Hero extends Creature {
    public static float x;
    public static float y;
    private Game game;
    private Hero hero;

    public Hero(Game game, float x, float y){
        super(x, y,Creature.DEFAULT_WIDTH, Creature.DEFAULT_HEIGHT);
        this.game = game;
    }
    @Override
    public void update() {
        if(game.getKeyManager().up){
            y -= 15;
        }
        if(game.getKeyManager().down){
            y += 15;
        }
        if(game.getKeyManager().left){
            x -= 15;
        }
        if(game.getKeyManager().right){
            x += 15;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) x, (int) y, width,height,null);
    }
}
