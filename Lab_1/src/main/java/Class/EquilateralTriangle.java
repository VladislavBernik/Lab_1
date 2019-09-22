package Class;

    public class EquilateralTriangle extends Triangle {

        public EquilateralTriangle(final double sideA, final double sideB, final double sideC) {
            super(sideA, sideB, sideC);
        }

        @Override
        public String toString() {
            String result;
            if (super.sideA == super.sideB && super.sideC == super.sideB && super.sideA == super.sideC) {
                result = "Sides:  a = " + super.sideA + "; b = " + super.sideB + "; c = " + super.sideC + ". Corner: A = " + super.A + "; B = " + super.B + "; C = " + super.C + ". Perimeter: P = " + super.perimeter + ". Square: S = " + super.square;
            } else {
                result = "Equilateral triangle doesn't exist !!!";
            }
            return result;
        }
    }