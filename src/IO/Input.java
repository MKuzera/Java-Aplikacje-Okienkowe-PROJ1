package IO;
import Figures.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Input {
    public static Square createSquareFromConsole(){
        Output.out("Enter a:");
        double a = Input.getDoubleFromConsole();
        return new Square(a);
    }
    public static Circle createCircleFromConsole(){
        Output.out("Enter r:");
        double r = Input.getDoubleFromConsole();
        return new Circle(r);
    }
    public static Triangle createTriangleFromConsole(){
        Output.out("Enter a:");
        double a = Input.getDoubleFromConsole();
        Output.out("Enter b:");
        double b = Input.getDoubleFromConsole();
        Output.out("Enter c:");
        double c = Input.getDoubleFromConsole();
        return new Triangle(a,b,c);
    }
    public static ThreeDim createThreeDimTriangleFromConsole(){
        Output.out("Enter a:");
        double a = Input.getDoubleFromConsole();
        Output.out("Enter b:");
        double b = Input.getDoubleFromConsole();
        Output.out("Enter c:");
        double c = Input.getDoubleFromConsole();
        Output.out("Enter h:");
        double h = Input.getDoubleFromConsole();

        return new ThreeDim(new Triangle(a,b,c),h);
    }
    public static ThreeDim createThreeDimSquareFromConsole(){
        Output.out("Enter a:");
        double a = Input.getDoubleFromConsole();
        Output.out("Enter h:");
        double h = Input.getDoubleFromConsole();
        return new ThreeDim(new Square(a),h);
    }
    public static ThreeDim createThreeDimCircleFromConsole(){
        Output.out("Enter r:");
        double r = Input.getDoubleFromConsole();
        Output.out("Enter h:");
        double h = Input.getDoubleFromConsole();
        return new ThreeDim(new Circle(r),h);
    }


    public static String getFromConsole(){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
        return reader.readLine();
        } catch (IOException e) {
        throw new RuntimeException(e);
        }

    }
    public static Double getDoubleFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String line = reader.readLine();
                return Double.parseDouble(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                Output.out("Enter a good value");
               // throw new RuntimeException(e);
            }
        }

    }
}
