public class Triangle extends Figure implements Printing{
    double a;
    double b;
    double c;
    public Triangle(double a, double b, double c ){
        if(a < 0 || b < 0 || c < 0){
            throw new RuntimeException("a,b,c cannot be negative");
        }
        if(a+b<=c || a+c <= b || b+c<=a ){
            throw new RuntimeException("sum of 2 smaller sides must be larger than a third side");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateArea() {
        double p = (a+b+c)/2;
        p = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(p);
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Triangle-> a: " + a +" b: "+ b + " c: " +c+ "\n");
        stringBuilder.append("Perimeter: " + calculatePerimeter() + "\n");
        stringBuilder.append("Area: " + calculateArea()+ "\n");
        Output.out(stringBuilder.toString());
    }

}
