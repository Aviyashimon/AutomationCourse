interface MathUtils {

    int add(int x, int y);

    default double getValue(int value) {
        System.out.println("First function");
        return getSquareRootValue(value);
    }

    private double getSquareRootValue(int value) {
        System.out.println("Second function");
        return java.lang.Math.sqrt(value);
    }
}
