public class Square extends Shape {
    public static final int numOfEdges = 4;
    private int edgeLength;

    public Square(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    int calculatePerimeter() {
        return edgeLength * 4;
    }


    public int getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength){
        this.edgeLength = edgeLength;
    }

}