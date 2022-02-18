public class Shapes {
    //main method
    public static void main(String args[]){
        Perimeter perimeter = new Perimeter();
        System.out.println(perimeter.squareperimeter(4));
        System.out.println(perimeter.squareArea(4));
        System.out.println(perimeter.rectangleperimeter(2,3));
        System.out.println(perimeter.rectangleArea(2,3));
        System.out.println(perimeter.cercleperimeter(1.5));
        System.out.println(perimeter.cercleArea(1.5));
    }
}
 class Perimeter{
    //to find perimeter  of Square
     int squareperimeter(int l) {
         return ((4 * l));
     }
     //to find area  of Square
     int squareArea(int l) {
         return ((l*l));
     }
     //to find perimeter  of rectangle
     int rectangleperimeter(int b, int h) {
         return (2*(b+h));
     }
     //to find area  of rectangle
     int rectangleArea(int b, int h) {
         return ((b*h));
     }
     //to find perimeter  of cercle
     double  cercleperimeter(double r) {
         double PI=3.14;
         return (2*PI*r);
     }
     //to find area  of cercle
     double cercleArea(double r) {
         double PI=3.14;
         return (PI*r*r);
     }

}