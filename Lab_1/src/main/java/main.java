import Class.EquilateralTriangle;
import Class.EquilateralTriangles;
import Class.Triangle;
import Class.Triangles;

import java.util.Scanner;

public class main {

    private static Triangles triangles;

    private static EquilateralTriangles equilateralTriangles;

    public static void main(String[] args) {
        int quantityTriangles, quantityEquilateralTriangles;
        final Scanner str = new Scanner(System.in);
        System.out.print("Enter quantity of triangles: ");
        quantityTriangles = str.nextInt();
        if (quantityTriangles != 0) {
            triangles = new Triangles(quantityTriangles);
            System.out.println("Enter all sides of the triangles:");
            construct(triangles, str, quantityTriangles);
            System.out.println(triangles.toString());
            System.out.println("Average square of all triangles: " + triangles.getAverageSquare());
        } else {
            System.out.println("Zero triangles");
        }
        System.out.print("Enter quantity of equilateral triangles: ");
        quantityEquilateralTriangles = str.nextInt();
        if (quantityEquilateralTriangles != 0) {
            equilateralTriangles = new EquilateralTriangles(quantityEquilateralTriangles);
            System.out.println("Enter all sides of an equilateral triangle:");
            construct(equilateralTriangles, str, quantityEquilateralTriangles);
            System.out.println(equilateralTriangles.toString());
            System.out.println("Maximal square of all equilateral triangles: " + equilateralTriangles.getMaxSquare());
        } else {
            System.out.println("Zero equilateral triangles");
        }
    }

    private static <N> void construct(N triangle, final Scanner str, final int quantity) {
        double sideA, sideB, sideC;
        for (int i = 0; i < quantity; i++) {
            if (triangle.getClass().getName().equals("Class.Triangles")) {
                System.out.println((i + 1) + ") Triangle:");
            } else {
                System.out.println((i + 1) + ") Equilateral triangle:");
            }
            System.out.print("A = ");
            sideA = str.nextInt();
            System.out.print("B = ");
            sideB = str.nextInt();
            System.out.print("C = ");
            sideC = str.nextInt();
            if (triangle.getClass().getName().equals("Class.Triangles")) {
                triangles.setTriangle(new Triangle(sideA, sideB, sideC), i);
            } else {
                equilateralTriangles.setEquilateralTriangle(new EquilateralTriangle(sideA, sideB, sideC), i);
            }

        }
    }
}