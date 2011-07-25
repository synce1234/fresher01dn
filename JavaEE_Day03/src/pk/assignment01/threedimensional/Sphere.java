/**
 * @author Admin
 */
package pk.assignment01.threedimensional;

/**
 * @author Admin
 * 
 */
public class Sphere implements ThreeDimensionalShape {
    private double radius = 0.0;

    /**
     * @param randomRadius
     */
    public Sphere(double randomRadius) {
        this.setRadius(randomRadius);
    }

    /*
     * (non-Javadoc)
     * 
     * @see pk.assignment01.Shape#getArea()
     */
    @Override
    /**
     * diện tích bề mặt hình cầu là 4 lần PI * bình phg bán kính
     */
    public double getArea() {
        double area = 0.0;
        area = 4 * Math.PI * Math.pow(getRadius(), 2);
        return area;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pk.assignment01.threedimensional.ThreeDimensionalShape#getVolume()
     */
    @Override
    /**
     * thể tích hình cầu là 4/3 nhân PI nhân lập phg bán kính
     */
    public double getVolume() {
        double volume = 0.0;
        volume = (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
        return volume;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius
     *            the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

}
