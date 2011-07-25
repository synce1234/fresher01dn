package pk.assignment01.twodimensional;

public class Circle implements TwoDimensionalShape {
    private double radius = 0.0;

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

    public Circle() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param d
     */
    public Circle(double radius) {
        this.setRadius(radius);
    }

    @Override
    public double getArea() {
        double a = 0.0;
        a = Math.PI * Math.pow(radius, 2);
        return a;
    }

}
