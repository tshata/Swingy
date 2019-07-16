package main.java;

import main.java.controller.Game;

public class Launcher
{
    public static void main(String[] args){
       Game game = new Game("Swingy", 1200, 950);
       game.start();
    }
}
