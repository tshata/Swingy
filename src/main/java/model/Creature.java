package main.java.model;

public abstract class Creature extends Entity {

    protected int experience;
    protected int level;
    protected int rank;
    public static final int DEFAULT_WIDTH = 85, DEFAULT_HEIGHT = 75;

    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);
        experience = 0;
        level = 1;
        rank = 1;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public int getRank() {
        return rank;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
