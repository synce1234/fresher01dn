
package model.dto;

public abstract class Bee {

    private int id;

    public abstract int getDeadline();

    public abstract double getHealth();

    public int getId() {

        return this.id;
    }

    public abstract String getType();

    public abstract boolean isDead();

    public void setId(int id) {

        this.id = id;
    }

    public abstract boolean damage(int d);
}
