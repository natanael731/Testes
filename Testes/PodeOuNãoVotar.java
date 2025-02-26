package IfElse;

import java.util.Scanner;

public class PodeOuNãoVotar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veifique se pode votar");
		System.out.print("Digite a sua idade: ");
		int idd = sc.nextInt();
		
		
		
		if (idd <= 0) {
			System.err.println("Digite uma idade válida!");
			
		}else if(idd <18) {
			System.out.println("Você não pode votar:");
		}else {
			System.out.println("Você pode votar");
		}
		

	}

}
