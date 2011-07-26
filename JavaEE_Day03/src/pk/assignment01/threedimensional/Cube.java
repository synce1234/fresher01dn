/**
 * @author Admin
 */
package pk.assignment01.threedimensional;

import pk.assignment01.Constants;

/**
 * @author Admin
 *
 */
public class Cube implements ThreeDimensionalShape {
    private double edge=0.0;
    
    /**
     * @param randomLength
     */
    public Cube(double randomLength) {
        this.setEdge(randomLength);
    }

    /**
     * @return the edge
     */
    public double getEdge() {
        return edge;
    }

    /**
     * @param edge the edge to set
     */
    public void setEdge(double edge) {
        this.edge = edge;
    }

    /* (non-Javadoc)
     * @see pk.assignment01.Shape#getArea()
     */
    @Override
    public double getArea() {
        double area = 0.0;
        area = 6 * Math.pow(edge, 2);
        return area;
    }

    /* (non-Javadoc)
     * @see pk.assignment01.threedimensional.ThreeDimensionalShape#getVolume()
     */
    @Override
    public double getVolume() {
        double volume = 0.0;
        volume = Math.pow(edge, 3);
        return volume;
    }
    
    @Override
    public void show() {
        // Cube
        System.out.println("Hình lập phương có cạnh dài " + this.getEdge()
                + Constants.DON_VI_DO_CHIEU_DAI + "thì có: ");
        System.out.println("Diện tích bề mặt là: " + this.getArea()
                + Constants.DON_VI_DO_DIEN_TICH);
        System.out.println("Thể tích là: " + this.getVolume()
                + Constants.DON_VI_DO_THE_TICH);
    }

}
