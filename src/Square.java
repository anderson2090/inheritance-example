public class Square extends GeometricObject {

    private double width;
    private double height;

    Square(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;


    }
}
