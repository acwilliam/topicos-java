import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double result = Math.pow(raio, 2);
		double total = result * pi;
		
		System.out.println("A = "+ total);
		
		
		
		
		
		sc.close();
	}

}
