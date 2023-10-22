public abstract class Menu {

    public static void start() {
        String inputFigure;
        boolean isLoop = true;
        while (isLoop) {
            Menu.displayOptions();
            inputFigure = Input.getFromConsole();

        switch (inputFigure) {
            case "1":
                calculateSquare();
                break;
            case "2":
                calculateTriangle();
                break;
            case "3":
                calculateCircle();
                break;
            case "4":
                calculateThreeDimSquare();
                break;
            case "5":
                calculateThreeDimTriangle();
                break;
            case "6":
                calculateThreeDimCircle();
                break;
            case "0":
                isLoop=false;
                break;
            default:
                Output.out("Bad input!");
                break;
            }

     }
    }

    private static void calculateThreeDimCircle() {
        ThreeDim threeDim = Input.createThreeDimCircleFromConsole();
        threeDim.print();
    }

    private static void calculateThreeDimTriangle() {
        ThreeDim threeDim = Input.createThreeDimTriangleFromConsole();
        threeDim.print();
    }

    private static void calculateThreeDimSquare() {

        ThreeDim threeDim = Input.createThreeDimSquareFromConsole();
        threeDim.print();

    }

    private static void calculateCircle() {
        Circle circle = Input.createCircleFromConsole();
        circle.print();

    }

    private static void calculateTriangle() {
        Triangle triangle = Input.createTriangleFromConsole();
        triangle.print();
    }

    private static void calculateSquare() {
        Square square = Input.createSquareFromConsole();
        square.print();

    }
    private static void displayOptions(){
        Output.out("Select:");
        Output.out(ProgramFigures.toStringMethod());
        Output.out("0 exit");
    }



}
