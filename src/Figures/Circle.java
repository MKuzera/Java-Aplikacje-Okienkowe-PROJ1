package Figures;

import Exceptions.NegativeInputException;
import FiguresThings.Printing;
import IO.Output;

public class Circle extends Figure implements Printing {

    private double r;
    public Circle(double r) throws NegativeInputException {
        if(r < 0){
            throw new NegativeInputException("R cannot be negative");
        }
        this.r = r;
    }
    @Override
    public double calculateArea() {
        return Math.PI * r* r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Circle-> r: " + r + "\n");
        stringBuilder.append("Perimeter: " + calculatePerimeter() + "\n");
        stringBuilder.append("Area: " + calculateArea()+ "\n");
        Output.out(stringBuilder.toString());
    }



}
