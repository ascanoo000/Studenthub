import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        a = A;
        b = B;
        c = C;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        double r1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return r2;
    }
}
public class QuadraticEq {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Please enter a, b, c (ax^2 + bx +x = 0)")
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation Good = new QuadraticEquation(a, b, c);

        double getDis = Good.getDiscriminant();

        if (getDis == 0){
            System.out.printf("root : %.6f\n", Good.getRoot1());
        }else if (getDis > 0) {
            System.out.printf("root1 : %.6f , root2 : %.6f\n", Good getRoot2())
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
