package main.java.controller;

import java.awt.*;

public abstract class State {
    private static State currentState = null;

    //game state manager
    public static void setState(State state){
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }
    //class
    protected Game game;

    public State(Game game){
        this.game = game;
    }
    public abstract void update();

    public abstract void render(Graphics g);
}
