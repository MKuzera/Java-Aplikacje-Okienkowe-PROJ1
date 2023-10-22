package IO;
import Exceptions.BadTriangleException;
import Exceptions.NegativeInputException;
import Figures.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Input {
    public static Square createSquareFromConsole(){
        while(true) {
            try {
                Output.out("Enter a:");
                double a = Input.getDoubleFromConsole();
                return new Square(a);

            } catch (NegativeInputException e) {
                Output.out(e + "\nTry again");
            }
        }
    }
    public static Circle createCircleFromConsole(){
        while(true){
        try {
            Output.out("Enter r:");
            double r = Input.getDoubleFromConsole();
            return new Circle(r);
        }
        catch (NegativeInputException e){
            Output.out( e + "\nTry again");
        }
     }
    }
    public static Triangle createTriangleFromConsole(){
      while(true){
        try {
            Output.out("Enter a:");
            double a = Input.getDoubleFromConsole();
            Output.out("Enter b:");
            double b = Input.getDoubleFromConsole();
            Output.out("Enter c:");
            double c = Input.getDoubleFromConsole();
            return new Triangle(a,b,c);
        }catch (NegativeInputException e){
            Output.out(e + "\nTry again");
        }
        catch (BadTriangleException e){
            Output.out(e + "\nTry again");
        }
      }

    }
    public static ThreeDim createThreeDimTriangleFromConsole(){
        while(true) {
            try {
                Output.out("Enter a:");
                double a = Input.getDoubleFromConsole();
                Output.out("Enter b:");
                double b = Input.getDoubleFromConsole();
                Output.out("Enter c:");
                double c = Input.getDoubleFromConsole();
                Output.out("Enter h:");
                double h = Input.getDoubleFromConsole();
                return new ThreeDim(new Triangle(a, b, c), h);
            } catch (NegativeInputException e) {
                Output.out( e + "\nTry again");
            } catch (BadTriangleException e) {
                Output.out(e + "\nTry again");
            }
        }
    }
    public static ThreeDim createThreeDimSquareFromConsole(){
        while(true) {
            try {
                Output.out("Enter a:");
                double a = Input.getDoubleFromConsole();
                Output.out("Enter h:");
                double h = Input.getDoubleFromConsole();
                return new ThreeDim(new Square(a), h);
            }
            catch (NegativeInputException e){
                Output.out(e + "\nTry again");
            }
        }
    }
    public static ThreeDim createThreeDimCircleFromConsole(){
        while(true) {
            try {
                Output.out("Enter r:");
                double r = Input.getDoubleFromConsole();
                Output.out("Enter h:");
                double h = Input.getDoubleFromConsole();
                return new ThreeDim(new Circle(r), h);
            } catch (NegativeInputException e) {
                Output.out(e + "\nTry again");
            }
        }
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
                Output.out("Must be a number. Try again");
            }
        }

    }
}
