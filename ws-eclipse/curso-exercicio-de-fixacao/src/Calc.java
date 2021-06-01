import java.util.Locale;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, tri, cir, tra, qua, ret;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = A * C / 2;
		cir = Math.pow(C, 2) * 3.14159;
		tra = (A + B) / 2 * C;
		qua = Math.pow(B, 2);
		ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n ", tra);
		System.out.printf("QUADRADO: %.3f%n ", qua);
		System.out.printf("RETANGULO: %.3f%n ", ret );
		
		
		
		
		
		
		sc.close();
	}

}
