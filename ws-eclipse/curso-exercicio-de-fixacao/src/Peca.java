import java.util.Locale;
import java.util.Scanner;

public class Peca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorUnitPeca1, valorUnitPeca2, total;
		
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorUnitPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorUnitPeca2 = sc.nextDouble();

		total  = numPeca1 * valorUnitPeca1+numPeca2 * valorUnitPeca2;
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
