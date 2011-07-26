/**
 * @author Admin
 */
package pk.assignment01.twodimensional;

import pk.assignment01.Constants;

/**
 * @author Admin
 * 
 */
public class Square implements TwoDimensionalShape {
    private double edge = 0.0;
    @Override
    public void show() {
         // Square
         System.out.println("Hình vuông có cạnh là " + this.getEdge()
         + Constants.DON_VI_DO_CHIEU_DAI + " thì có diện tích là: "
         + this.getArea() + Constants.DON_VI_DO_DIEN_TICH);
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

    /*
     * (non-Javadoc)
     * 
     * @see pk.assignment01.Shape#getArea()
     */
    @Override
    public double getArea() {
        return Math.pow(edge, 2);
    }
    
    public Square(double edge) {
        this.setEdge(edge);
    }

}
