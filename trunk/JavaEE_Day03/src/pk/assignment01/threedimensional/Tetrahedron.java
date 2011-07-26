/**
 * @author Admin
 */
package pk.assignment01.threedimensional;

import pk.assignment01.Constants;

/**
 * @author Admin Tetrahedron = tứ giác đều.
 */
public class Tetrahedron implements ThreeDimensionalShape {

    private double edge = 0.0;

    @Override
    public void show() {
        // Tetrahedron
        System.out.println("Hình tứ diện đều có cạnh dài " + this.getEdge()
                + Constants.DON_VI_DO_CHIEU_DAI + "thì có: ");
        System.out.println("Diện tích bề mặt : " + this.getArea()
                + Constants.DON_VI_DO_DIEN_TICH);
        System.out.println("Thể tích là: " + this.getVolume()
                + Constants.DON_VI_DO_THE_TICH);
    }

    /**
     * @return the edge
     */
    public double getEdge() {
        return edge;
    }

    /**
     * @param edge
     *            the edge to set
     */
    public void setEdge(double edge) {
        this.edge = edge;
    }

    /**
     * @param randomLength
     */
    public Tetrahedron(double d) {
        this.setEdge(d);
    }

    /*
     * (non-Javadoc)
     * 
     * @see pk.assignment01.Shape#getArea()
     */
    @Override
    /**
     * diện tích bề mặt tứ giác đều là căn bậc 3 của 3 nhân với cạnh bình phg
     */
    public double getArea() {
        double area = 0.0;
        area = Math.cbrt(3) * Math.pow(getEdge(), 2);
        return area;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pk.assignment01.threedimensional.ThreeDimensionalShape#getVolume()
     */
    @Override
    /**
     * thể tích tứ giác đều = căn bậc 2 của 2 chia 12 nhân với lập phương của cạnh
     */
    public double getVolume() {
        double volume = 0.0;
        volume = Math.pow(getEdge(), 3) * Math.sqrt(2) / 12;
        return volume;
    }

}
