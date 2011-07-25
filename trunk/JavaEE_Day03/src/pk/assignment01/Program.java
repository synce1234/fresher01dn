/**
 * should contains method getArea() to calculate the area of it (e.g area of a
 * circle is pi* r2). Each three-dimensional shape should contain getArea() and
 * getVolume() methods
 * to calculate the surface area and volume respectively.
 * Create a program that uses an array of Shape references to objects of each
 * concrete class in the hierarchy. The program should print the object to which
 * each array element refers.
 * Also in the loop that processes all the shapes in the array, determine
 * whether each shape is a two-dimensional shape or three-dimensional shape. If
 * a shape
 * is two-dimensional one, display its area. If a shape is three -dimensional
 * one, display its area and volume.
 */

package pk.assignment01;

import pk.assignment01.threedimensional.Cube;
import pk.assignment01.threedimensional.Sphere;
import pk.assignment01.threedimensional.Tetrahedron;
import pk.assignment01.twodimensional.Circle;
import pk.assignment01.twodimensional.Square;
import pk.assignment01.twodimensional.Triangle;

public class Program {
    public static final String DON_VI_DO_CHIEU_DAI = "cm";
    public static final String DON_VI_DO_DIEN_TICH = "cm2";
    public static final String DON_VI_DO_THE_TICH = "cm3";

    /**
     * @param args
     */
    public static void main(String[] args) {

        // circle
        double randomLength = Math.random() * 100;
        Circle circle = new Circle(randomLength);
        System.out.println("Hình tròn có bán kính " + randomLength
                + DON_VI_DO_CHIEU_DAI + "thì có diện tích là: "
                + circle.getArea() + DON_VI_DO_DIEN_TICH);

        // Square
        Square square = new Square(randomLength);
        System.out.println("Hình vuông có cạnh là " + randomLength
                + DON_VI_DO_CHIEU_DAI + " thì có diện tích là: "
                + square.getArea() + DON_VI_DO_DIEN_TICH);

        // Triangle
        // double a = Math.random() * 10;
        // double b = Math.random() * 10;
        // double c = Math.random() * 10;
        // Triangle triangle = new Triangle(a, b, c);
        // System.out.println("Tam giác có 3 cạnh: ");
        // System.out.println("a = " + a + DON_VI_DO_CHIEU_DAI + " b = " + b
        // + DON_VI_DO_CHIEU_DAI + " c = " + c + DON_VI_DO_CHIEU_DAI);
        // System.out.println("thì có diện tích là " + triangle.getArea()
        // + DON_VI_DO_DIEN_TICH);

        // Triangle - tam giác đều
        Triangle tria = new Triangle(randomLength);
        System.out.println("Tam giác đều cạnh = " + randomLength
                + DON_VI_DO_CHIEU_DAI + "thì có diện tích: " + tria.getArea()
                + DON_VI_DO_DIEN_TICH);
        // Sphere - hình cầu
        Sphere s = new Sphere(randomLength);
        System.out.println("Hình cầu có bán kính " + randomLength
                + DON_VI_DO_CHIEU_DAI + "thì có: ");
        System.out.println("Diện tích bề mặt là: " + s.getArea()
                + DON_VI_DO_DIEN_TICH);
        System.out
                .println("Thể tích là: " + s.getVolume() + DON_VI_DO_THE_TICH);

        // Cube
        Cube cube = new Cube(randomLength);
        System.out.println("Hình lập phương có cạnh dài " + randomLength
                + DON_VI_DO_CHIEU_DAI + "thì có: ");
        System.out.println("Diện tích bề mặt là: " + cube.getArea()
                + DON_VI_DO_DIEN_TICH);
        System.out.println("Thể tích là: " + cube.getVolume()
                + DON_VI_DO_THE_TICH);

        // Tetrahedron
        Tetrahedron th = new Tetrahedron(randomLength);
        System.out.println("Hình tứ diện đều có cạnh dài " + randomLength
                + DON_VI_DO_CHIEU_DAI + "thì có: ");
        System.out.println("Diện tích bề mặt : " + th.getArea()
                + DON_VI_DO_DIEN_TICH);
        System.out.println("Thể tích là: " + th.getVolume()
                + DON_VI_DO_THE_TICH);
    }
}
