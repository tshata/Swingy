package main.java.model;

import main.java.controller.Assets;
import main.java.controller.Game;

import java.awt.*;
import java.util.Random;

public class Enemy extends Creature {
    private static float x;
    private Game game;
    private Enemy enemy;

    Random random = new Random();
    public Enemy(Game game, float x, float y){
        super(x, y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_HEIGHT);
        this.game = game;
    }
    @Override
    public void update() {

//            if (game.getKeyManager().up) {
//                y -= random.nextInt(5);
//            }
//            if (game.getKeyManager().down) {
//                y += random.nextInt(5);
//            }
//            if (game.getKeyManager().left) {
//                x -= random.nextInt(5);
//            }
//            if (game.getKeyManager().right) {
//                x += random.nextInt(5);
//            }
            if(Hero.x > Enemy.x) {
                x += random.nextInt(3);
                y -= random.nextInt(3);
            }
           else if(Hero.x < Enemy.x)
            {
                x -= random.nextInt(4);
                y += random.nextInt(4);
            }
            else {
              x += random.nextInt(5);
              y -= random.nextInt(5);
            }

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.enemy, (int) x, (int) y, width,height,null);
    }
}
