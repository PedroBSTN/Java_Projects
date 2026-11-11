import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        System.out.println("4 - Kelvin para Celsius");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = (temperatura * 9 / 5) + 32;
                System.out.printf("%.2f°C = %.2f°F%n", temperatura, resultado);
                break;

            case 2:
                resultado = (temperatura - 32) * 5 / 9;
                System.out.printf("%.2f°F = %.2f°C%n", temperatura, resultado);
                break;

            case 3:
                resultado = temperatura + 273.15;
                System.out.printf("%.2f°C = %.2fK%n", temperatura, resultado);
                break;

            case 4:
                resultado = temperatura - 273.15;
                System.out.printf("%.2fK = %.2f°C%n", temperatura, resultado);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}