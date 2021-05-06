/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Keerthi Muli
 */
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject geoObj[] = new GeometricObject[5];
        GeometricObject obj1 = new Square(1);
        GeometricObject obj2 = new Square(2);
        GeometricObject obj3 = new Square(3);
        GeometricObject obj4 = new Square(4);
        GeometricObject obj5 = new Square(5);
        geoObj[0] = obj1;
        geoObj[1] = obj2;
        geoObj[2] = obj3;
        geoObj[3] = obj4;
        geoObj[4] = obj5;
         System.out.println("Answer for question 2: Keerthi Muli");
            for(GeometricObject geo : geoObj) {
            System.out.println("Area of Square: " + geo.getArea());
            geo.howToColor();
        }

}
}
