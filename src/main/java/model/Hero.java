package main.java.model;

import main.java.controller.Assets;
import main.java.controller.Game;

import java.awt.*;


public class Hero extends Creature {
    private Game game;
    private Hero hero;

    public Hero(Game game, float x, float y){
        super(x, y);
        this.game = game;
    }
    @Override
    public void update() {
        if(game.getKeyManager().up){
            y -= 25;
        }
        if(game.getKeyManager().down){
            y += 25;
        }
        if(game.getKeyManager().left){
            x -= 25;
        }
        if(game.getKeyManager().right){
            x += 25;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) x, (int) y, null);
    }
}
