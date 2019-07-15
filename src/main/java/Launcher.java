import view.Display;

import controller.Game;

public class Launcher
{
    public static void main(String[] args){
       Game game = new Game("Swingy", 500, 400);
       game.start();
    }
}
