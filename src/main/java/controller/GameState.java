package main.java.controller;

import main.java.model.Enemy;
import main.java.model.Hero;
import main.java.view.Display;

import java.util.Random;
import java.awt.*;

public class GameState extends State{
    private Hero hero;
    private Enemy enemy1;
    private Enemy enemy2;
    private Enemy enemy3;
    private Enemy enemy4;
    private Enemy enemy5;

    Random rand = new Random();
    public GameState(Game game) {
        super(game);
        int n = rand.nextInt(800);
        int m = rand.nextInt(700);
        int p = rand.nextInt(800);
        int q = rand.nextInt(700);
        hero = new Hero(game, 400 , 400);

            enemy1 = new Enemy(game, n, m);
            enemy2 = new Enemy(game, p, q);
            enemy3 = new Enemy(game, p, q);
            enemy4 = new Enemy(game, n * 3, m);
            enemy5 = new Enemy(game, p * 2, q);
        n++;
        p++;
        m++;
        q++;
    }

    @Override
    public void update() {
        hero.update();
        enemy1.update();
        enemy2.update();
        enemy3.update();
        enemy4.update();
        enemy5.update();
    }

    @Override
    public void render(Graphics g) {
      //  g.drawImage(Assets.enemy,0,0,null);
        hero.render(g);
        enemy1.render(g);
        enemy2.render(g);
        enemy3.render(g);
        enemy4.render(g);
        enemy5.render(g);
    }
}