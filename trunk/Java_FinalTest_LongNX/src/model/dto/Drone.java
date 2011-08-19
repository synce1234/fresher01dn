/**
 * 
 */

package model.dto;

/**
 * @author Fresher041
 * 
 */
public class Drone extends Bee {

    public static int    DEADLINE = 50;
    public static String TYPE     = "Drone";
    private boolean      dead;
    private int          deadline = Drone.DEADLINE;
    private double       health;
    private String       type     = Drone.TYPE;

    public Drone() {

    }

    public Drone(double health) {

        this.health = health;
        if (this.health <= Drone.DEADLINE) {
            this.setDead(true);
        }
    }

    public Drone(int id, boolean dead, int deadline, double health, String type) {

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
            if (newHealth <= Drone.DEADLINE) {
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
