package Testes;

import java.util.Scanner;

public class Esudo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de IMC");
		
		//Entrada
		System.out.print("Digite o seu peso (kg): ");
		 Double peso = sc.nextDouble();
		
		System.out.print("Digite a sua altura (m): ");
		 Double altura = sc.nextDouble();
		 
		 //Calculando o IMC
		 Double imc = peso / (altura * altura );
		 
		 
		 //Exibindo o IMC
		  System.out.printf("Seu IMC é : %.2f\n", imc);
		 
		// Classificando o IMC
	        if (imc < 18.5) {
	            System.out.println("Você está abaixo do peso.");
	        } else if (imc >= 18.5 && imc < 24.9) {
	            System.out.println("Você está com o peso normal.");
	        } else if (imc >= 25 && imc < 29.9) {
	            System.out.println("Você está com sobrepeso.");
	        } else if (imc >= 30 && imc < 34.9) {
	            System.out.println("Você está com obesidade moderada.");
	        } else if (imc >= 35 && imc < 39.9) {
	            System.out.println("Você está com obesidade severa.");
	        } else {
	            System.out.println("Você está com obesidade grave.");
	        }
	        
	        
	        
		  sc.close();
		 
		
		
		
		

	}

}
