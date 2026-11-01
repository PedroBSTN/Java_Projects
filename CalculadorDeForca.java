import java.util.Scanner;
public class CalculadorDeForca {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite a aceleração do corpo:");
		int acel = tec.nextInt();
		System.out.println("Digite a massa do corpo:");
		int m = tec.nextInt();
		System.out.println("A força é de " + (acel*m));
	} 
}