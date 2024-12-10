import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients  of the quadratic equation(a,b,c):");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double[] roots = rootsOperation(a,b,c);

        System.out.println("The roots of the quadratic equation are:");
        System.out.println("x1 = "+roots[0]);
        System.out.println("x2 = "+roots[1]);
    }
    private static double[]rootsOperation(double a,double b,double c){
        double discriminant = b * b - 4 * a * c;
        if (discriminant<0) {
            System.out.println("The equation has no real roots.");
            System.exit(0);
        }
        double sqrtDiscriminant = Math.sqrt(discriminant);
        double x1 = (-b + sqrtDiscriminant)/(2*a);
        double x2 = (-b - sqrtDiscriminant)/(2*a);
        return new double[]{x1,x2};
    }
}
