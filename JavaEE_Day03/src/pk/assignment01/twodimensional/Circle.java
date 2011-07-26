package pk.assignment01.twodimensional;

import pk.assignment01.Constants;

public class Circle implements TwoDimensionalShape {
    private double radius = 0.0;

    @Override
    public void show() {

        // circle
        System.out.println("Hình tròn có bán kính " + this.getRadius()
                + Constants.DON_VI_DO_CHIEU_DAI + "thì có diện tích là: "
                + this.getArea() + Constants.DON_VI_DO_DIEN_TICH);
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
