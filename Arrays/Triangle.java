import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle A: ");
        double a = sc.nextDouble();
        System.out.print("Enter angle B: ");
        double b = sc.nextDouble();
        System.out.print("Enter angle C: ");
        double c = sc.nextDouble();
        if (a + b + c != 180 || a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid angles for a triangle.");
        }
        if (a > 90 || b > 90 || c > 90) {
            System.out.println("Obtuse angled triangle.");
        } else if (a == 90 || b == 90 || c == 90) {
            System.out.println("Right angled triangle.");
        } else {
            System.out.println("Acute angled triangle.");
        }
    }
}
