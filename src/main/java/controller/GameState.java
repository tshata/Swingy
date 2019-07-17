package main.java.controller;

import main.java.model.Hero;

import java.awt.*;

public class GameState extends State{
    private Hero hero;

    public GameState(Game game) {
        super(game);
        hero = new Hero(game,100,100);
    }

    @Override
    public void update() {
        hero.update();
    }

    @Override
    public void render(Graphics g) {
      //  g.drawImage(Assets.enemy,0,0,null);
        hero.render(g);
    }
}