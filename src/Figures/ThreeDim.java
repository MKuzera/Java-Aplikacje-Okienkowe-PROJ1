package Figures;

import Exceptions.NegativeInputException;
import FiguresThings.Printing;
import IO.Output;

public class ThreeDim extends Figure implements Printing {
    Figure figure;
    double height;

    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ThreeDim -> height : " + height + " base: " + figure.getClass().getName()+ "\n");
        stringBuilder.append("Perimeter: " + calculatePerimeter() + "\n");
        stringBuilder.append("Volume: " + calculateArea()+ "\n");
        Output.out(stringBuilder.toString());
    }

    public ThreeDim(Figure figure, double height) throws NegativeInputException {
        if(height < 0){
            throw new NegativeInputException("Height cannot be negative");
        }
        this.figure = figure;
        this.height = height;
    }

    public double calculateArea() {
        return figure.calculateArea()*height;
    }

    public double calculatePerimeter() {
        return 2* figure.calculatePerimeter() + 4*height;
    }

}
