import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ShapesTest {

    @org.junit.Test
    //test method for perimeter of square
    public void testsquareperimeter() {
        Perimeter perimeter = new Perimeter();
        int paremetersquare = perimeter.squareperimeter(4);
        assertEquals(16, paremetersquare);
    }
    @org.junit.Test
    //test method for area of square
    public void testsquareArea() {
        Perimeter perimeter = new Perimeter();
        int areasquare = perimeter.squareArea(4);
        assertEquals(16, areasquare);
    }

    @org.junit.Test
    //test method for perimeter of rectangle
    public void rectangleperimeter() {
        Perimeter perimeter = new Perimeter();
        int paremeterrectangle = perimeter.rectangleperimeter(2, 3);
        assertEquals(10, paremeterrectangle);
    }

    @org.junit.Test
    //test method for area of rectangle
    public void rectangleArea() {
        Perimeter perimeter = new Perimeter();
        int arearectangle = perimeter.rectangleArea(2, 3);
        assertEquals(6, arearectangle);
    }

    @org.junit.Test
    //test method for perimeter of cercle
    public void cercleperimeter() {
        Perimeter perimeter = new Perimeter();
        double parimetercercle = perimeter.cercleperimeter(1.5);
        assertEquals(9.42, parimetercercle,0);
    }

    @org.junit.Test
    //test method for area of cercle
    public void cercleArea() {
        Perimeter perimeter = new Perimeter();
        double areacercle = perimeter.cercleArea(1.5);
        assertEquals(7.0649999999999995, areacercle,0);
    }


}
