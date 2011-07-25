/**
 * @author Admin
 */
package pk.assignment01.twodimensional;

/**
 * @author Admin
 * 
 */
public class Square implements TwoDimensionalShape {
    private double edge = 0.0;
    
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
