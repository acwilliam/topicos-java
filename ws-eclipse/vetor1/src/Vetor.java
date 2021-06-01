import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];//criando um vetor
		
		for(int i=0; i<n; i++) {//acessando os dados do vetor
			vect[i]= sc.nextDouble();
			
		}
		double soma =0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		double media = soma/n;
		
		System.out.println( media);
		sc.close();
	}

}
