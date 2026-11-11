import java.util.Scanner;

public class CalculoPressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a força (N): ");
        double forca = scanner.nextDouble();

        System.out.print("Digite a área (m²): ");
        double area = scanner.nextDouble();

        if (area <= 0) {
            System.out.println("A área deve ser maior que zero.");
        } else {
            double pressao = forca / area;
            System.out.printf("A pressão é %.2f Pa%n", pressao);
        }

        scanner.close();
    }
}