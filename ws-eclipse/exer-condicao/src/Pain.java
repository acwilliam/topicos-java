import java.util.Scanner;

public class Pain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um numero inteiro");
		x= sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
