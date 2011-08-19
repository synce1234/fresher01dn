/**
 * 
 */

package model.dto;

/**
 * @author Fresher041
 * 
 */
public class Queen extends Bee {

    public static int    DEADLINE = 20;
    public static String TYPE     = "Queen";
    private boolean      dead;
    private int          deadline = Queen.DEADLINE;
    private double       health;
    private String       type     = Queen.TYPE;

    /**
     * 
     */
    public Queen() {

    }

    public Queen(double health) {

        this.health = health;
        if (this.health <= Queen.DEADLINE) {
            this.setDead(true);
        }
    }

    public Queen(int id, boolean dead, int deadline, double health, String type) {

        super.setId(id);
        this.dead = dead;
        this.deadline = deadline;
        this.health = health;
        this.type = type;
    }

    @Override
    public int getDeadline() {

        return this.deadline;
    }

    @Override
    public double getHealth() {

        return this.health;
    }

    @Override
    public String getType() {

        return this.type;
    }

    @Override
    public boolean isDead() {

        return this.dead;
    }

    private void setDead(boolean dead) {

        this.dead = dead;
    }

    private void setHealth(double health) {

        this.health = health;
    }

    public void setType(String type) {

        this.type = type;
    }

    /*
     * (non-Javadoc)
     * 
     * @see model.dto.Bee#damage(int)
     */
    @Override
    public boolean damage(int d) {

        boolean r = false;
        if (this.isDead() == false) {
            double currentHealth = this.getHealth();
            double dd = 1 - (double) d / (double) 80;
            double newHealth = currentHealth * dd;
            this.setHealth(newHealth);
            if (newHealth <= Queen.DEADLINE) {
                this.setDead(true);
            }
            r = true;
        }
        return r;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append(super.getId());
        builder.append(" ");
        builder.append(this.type);
        builder.append(" ");
        builder.append(this.deadline);
        builder.append(" ");
        builder.append(this.health);
        builder.append(" ");
        builder.append(this.dead);
        builder.append(" ");
        return builder.toString();
    }
}
