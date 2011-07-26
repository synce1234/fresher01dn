/**
 * @author Admin
 */
package pk.assignment01.threedimensional;

import pk.assignment01.Constants;
/**
 * @author Admin
 * 
 */
public class Sphere implements ThreeDimensionalShape {
    private double radius = 0.0;

    @Override
    public void show() {
        // Sphere - hình cầu
        System.out.println("Hình cầu có bán kính " + this.getRadius()
                + Constants.DON_VI_DO_CHIEU_DAI + "thì có: ");
        System.out.println("Diện tích bề mặt là: " + this.getArea()
                + Constants.DON_VI_DO_DIEN_TICH);
        System.out.println("Thể tích là: " + this.getVolume()
                + Constants.DON_VI_DO_THE_TICH);
    }

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
