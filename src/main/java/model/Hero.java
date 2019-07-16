package main.java.model;

public abstract class Hero extends Entity {

    protected int experience;
    protected int level;
    protected int rank;

    public Hero(float x, float y) {
        super(x, y);
        experience = 0;
        level = 1;
        rank = 1;

    }
}
