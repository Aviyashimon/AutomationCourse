public class Triangle extends Shape {

    public static final int numOfEdges = 3;
    private int firstEdgeLength;
    private int secondEdgeLength;
    private int thirdEdgeLength;

    Triangle(int firstEdgeLength, int secondEdgeLength, int thirdEdgeLength) {
        this.firstEdgeLength = firstEdgeLength;
        this.secondEdgeLength = secondEdgeLength;
        this.thirdEdgeLength = thirdEdgeLength;
    }

    @Override
    int calculatePerimeter() {
        return firstEdgeLength + secondEdgeLength + thirdEdgeLength;
    }

    public String triangleType() {
        if (firstEdgeLength == secondEdgeLength && secondEdgeLength == thirdEdgeLength) {
            return "Equilateral Triangle";
        } else if (firstEdgeLength == secondEdgeLength || firstEdgeLength == thirdEdgeLength || secondEdgeLength == thirdEdgeLength) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }

    public int getFirstEdgeLength() {
        return firstEdgeLength;
    }

    public int getSecondEdgeLength() {
        return secondEdgeLength;
    }

    public int getThirdEdgeLength() {
        return thirdEdgeLength;
    }

    public void setFirstEdgeLength(int firstEdgeLength) {
        this.firstEdgeLength = firstEdgeLength;
    }

    public void setSecondEdgeLength(int secondEdgeLength) {
        this.secondEdgeLength = secondEdgeLength;
    }

    public void setThirdEdgeLength(int thirdEdgeLength) {
        this.thirdEdgeLength = thirdEdgeLength;
    }
}
