import java.util.Locale;
import java.util.Scanner;

public class Func {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			double idFuncionario, numHoras, valorHoras, salario;
			
			idFuncionario = sc.nextDouble();
			numHoras = sc.nextDouble();
			valorHoras = sc.nextDouble();
			
			
			salario = numHoras * valorHoras;
			
			System.out.println("NUMBER = " + idFuncionario);
			System.out.printf("SALARY = U$ %.2f%n",salario);
			
			sc.next();
		}
	}

}
