public class ShapeProgram {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 5, 5);
        Square square = new Square(5);

        int sPerimeter = square.calculatePerimeter();
        int tPerimeter = triangle.calculatePerimeter();
        System.out.println(sPerimeter);
        System.out.println(tPerimeter);
        System.out.println(triangle.triangleType());
        triangle.setSecondEdgeLength(4);
        System.out.println(triangle.triangleType());
        triangle.setThirdEdgeLength(6);
        System.out.println(triangle.triangleType());

    }
}
