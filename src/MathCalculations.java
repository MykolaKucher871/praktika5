public class MathCalculations {
    public static void main(String[] args) {
        // Значення змінних
        double a = 2.389;
        double b = 3.1;
        double c = 17;

        // Обчислення x
        double numerator = Math.pow(b, 3); // b^3
        double denominator = b - a;
        double sqrtPart = Math.sqrt(numerator / denominator);
        double lnPart = Math.log(a);
        double x = sqrtPart - lnPart;

        // Обчислення y
        double sinC = Math.sin(Math.toRadians(c)); // sin(c) з переведенням градусів у радіани
        double cosC = Math.cos(Math.toRadians(c)); // cos(c) з переведенням градусів у радіани
        double y = a * Math.pow(sinC, 3) + b * Math.pow(cosC, 3);

        // Вивід результатів
        System.out.printf("Результат x: %.4f%n", x);
        System.out.printf("Результат y: %.4f%n", y);
    }
}



