package main.java.controller;

import main.java.controller.ImageLoader;
import main.java.view.SpriteSheet;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage player, enemy;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/images/sheet2.png"));
        enemy = sheet.crop(0,0, 85, 75);
        player = sheet.crop(95, 0, 85, 75);
    }
}
