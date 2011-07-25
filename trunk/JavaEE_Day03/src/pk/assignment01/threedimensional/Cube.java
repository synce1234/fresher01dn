/**
 * @author Admin
 */
package pk.assignment01.threedimensional;

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

}
