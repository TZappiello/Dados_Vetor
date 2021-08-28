package treinoCondicao;

import java.util.Scanner;

//Contador decrescente 

public class ContDecrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor:  ");

		int c = sc.nextInt();
		while (c >= 0) {
			System.out.println(c);
			c--;

		}
		System.out.println("Terminei de contar: ");
	}

}
