package FiguresThings;

public enum ProgramFigures {

        Square("1"),
        Triangle("2"),
        Circle("3"),
        ThreeDimSquare("4"),
        ThreeDimTriangle("5"),
        ThreeDimCircle("6");

        public final String label;

        ProgramFigures(String label) {
            this.label = label;
        }
        public static String toStringMethod(){
            StringBuilder s=new StringBuilder();
            for (ProgramFigures fig: values()) {
                s.append(fig.label + " " + fig.name() + " \n");
            }
            return s.toString();
        }

}
