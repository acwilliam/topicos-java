import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt();
		int x;
		int soma=0;
		for(int i=0; i<N; i++) {
			x = sc.nextInt();
			soma = soma + x;
		}	
		System.out.println(soma);
		sc.close();

	}

}
