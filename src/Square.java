public class Square extends Figure implements Printing{
    double a;
    public Square(double a){
        if(a < 0){
            throw new RuntimeException("a cannot be negative");
        }
        this.a =a;
    }
    @Override
    public double calculateArea() {
        return a*a;
    }
    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        Output.out("Square-> a: " + a );
        Output.out("Perimeter: " + calculatePerimeter());
        Output.out("Area: " + calculateArea());
    }

}
