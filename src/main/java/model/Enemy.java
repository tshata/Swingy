package main.java.model;

import main.java.controller.Assets;
import main.java.controller.Game;

import java.awt.*;
import java.util.Random;

public class Enemy extends Creature {
    Random random = new Random();
    private static float x = 0;

    private static float y = 0;
    private Game game;
    private Enemy enemy;

    //Random random = new Random();
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
//                x += random.nextInt(3);
//                y -= random.nextInt(3);
             //   y++;
x++;
            }
            if(Hero.x < Enemy.x)
            {
//                x -= random.nextInt(4);
//                y += random.nextInt(4);
                 //  y--;
                   x--;
            }
             if(Hero.y > Enemy.y){

//              x += random.nextInt(5);
//              y -= random.nextInt(5);
                y++;
               // x--;
            } if(Hero.y < Enemy.y){
                y--;
            //    x++;
            } if(Hero.x > Enemy.x && Hero.y < Enemy.y) {
//                x += random.nextInt(3);
//                y -= random.nextInt(3);
            //   y++;
            y--;
            x++;
        }
         if(Hero.x < Enemy.x && Hero.y < Enemy.y)
        {
//                x -= random.nextInt(4);
//                y += random.nextInt(4);
            y--;
            x--;
        }
         if(Hero.y > Enemy.y && Hero.x < Enemy.x){

//              x += random.nextInt(5);
//              y -= random.nextInt(5);
            y++;
            x--;
        } if(Hero.y < Enemy.y && Hero.x > Enemy.x){
            y--;
            x++;
        }


    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.enemy, (int) x, (int) y, width,height,null);
    }
}
