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

    /**
     * @param args
     */
    public static void main(String[] args) {
        int amount = 20;
        Shape[] shapeArray = new Shape[amount];
        double randomLength = 0; // độ dài cạnh hoặc bán kính các thể loại
        int randomShapeType = 0; // 0-5 : 6 loại hình

        // tạo 1 list amout hình 1 cách ngẫu nhiên.
        for (int i = 0; i < shapeArray.length; i++) {
            randomShapeType = (int) (Math.random() * 5);
            randomLength = Math.random() * 10;
            switch (randomShapeType) {
                case 0:
                    shapeArray[i] = new Circle(randomLength);
                    break;
                case 1:
                    shapeArray[i] = new Square(randomLength);
                    break;
                case 2:
                    shapeArray[i] = new Triangle(randomLength);
                    break;
                case 3:
                    shapeArray[i] = new Sphere(randomLength);
                    break;
                case 4:
                    shapeArray[i] = new Cube(randomLength);
                    break;
                case 5:
                    shapeArray[i] = new Tetrahedron(randomLength);
                    break;
            }
        }

        // show ra màn hình:
        for (int i = 0; i < amount; i++) {
            System.out.println("Hình thứ " + (i + 1));
            shapeArray[i].show();
        }
    }
}
