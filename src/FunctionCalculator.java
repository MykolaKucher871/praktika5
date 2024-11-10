import java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення значень a і b
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        // Обчислення значення f(x)
        double fx;

        if (x > -3 && x < 3) {
            fx = Math.sqrt(3 * Math.pow(x, 2) - a);
        } else if (x == 3) {
            fx = -b * x + 3;
        } else if (x > 3 && x < 8) {
            fx = Math.cos(x - 4);
        } else {
            System.out.println("Значення x поза допустимим діапазоном.");
            return;
        }

        // Вивід результату
        System.out.printf("f(%.2f) = %.4f%n", x, fx);
    }
}