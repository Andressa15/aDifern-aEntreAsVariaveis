package DiferencaDeDoisNumero;

import java.util.Scanner;

public class DiferencaDeDoisNumero {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Informe um numero");
		int X = scan.nextInt();

		System.out.println("Informe outro numero menor que o primeiro");
		int Y = scan.nextInt();
		
		int diferenca = X - Y;
		System.out.println(  " A diferença é " + diferenca + " entre os números");
	}
}
