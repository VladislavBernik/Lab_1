package Class;

public class Triangle {

    protected final double sideA;

    protected final double sideB;

    protected final double sideC;

    protected double A;

    protected double B;

    protected double C;

    protected double perimeter;

    protected double square;

    public Triangle(final double sideA, final double sideB, final double sideC) {
        this.sideA = sideA > 0 ? sideA : 0;
        this.sideB = sideB > 0 ? sideB : 0;
        this.sideC = sideC > 0 ? sideC : 0;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            calculation();
        }
    }

    private void calculation() {
        A = (Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)) * 180) / Math.PI;
        B = (Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)) * 180) / Math.PI;
        C = (Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB)) * 180) / Math.PI;
        perimeter = sideA + sideB + sideC;
        square = Math.sqrt((perimeter / 2) * (perimeter / 2 - sideA) * (perimeter / 2 - sideB) * (perimeter / 2 - sideC));
    }

    @Override
    public String toString() {
        String result;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            result = "Sides:  A = " + sideA + " B = " + sideB + " C = " + sideC + " Corner: A = " + A + "; B = " + B + "; C = " + C + ". Perimeter: P = " + perimeter + " Square1: S = " + square;
        } else {
            result = "Triangle doesn't exist !!!";
        }
        return result;
    }
}
