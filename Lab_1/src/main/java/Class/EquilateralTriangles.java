package Class;

public class EquilateralTriangles {

    private EquilateralTriangle[] equilateralTriangles;

    public EquilateralTriangles(final int quantityEquilateralTriangles) {
        equilateralTriangles = new EquilateralTriangle[quantityEquilateralTriangles];
    }

    public void setEquilateralTriangle(final EquilateralTriangle equilateralTriangles, final int index) {
        this.equilateralTriangles[index] = equilateralTriangles;
    }

    public double getMaxSquare() {
        double maxSquare = 0;
        for (int i = 0; i < equilateralTriangles.length; i++) {
                if (maxSquare < equilateralTriangles[i].square) {
                    maxSquare = equilateralTriangles[i].square;
                }
        }
        return maxSquare;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < equilateralTriangles.length; i++) {
            result.append(i + 1).append(") ").append(equilateralTriangles[i].toString()).append("\n");
        }
        return result.toString();
    }
}