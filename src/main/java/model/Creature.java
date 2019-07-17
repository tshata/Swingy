package main.java.model;

public abstract class Creature extends Entity {

    protected int experience;
    protected int level;
    protected int rank;

    public Creature(float x, float y) {
        super(x, y);
        experience = 0;
        level = 1;
        rank = 1;

    }
}
