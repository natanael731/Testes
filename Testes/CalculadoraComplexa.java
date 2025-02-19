package Testes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraComplexa {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        // Declaração da variável scanner dentro do método main
		        
		        System.out.println("Bem-vindo à Calculadora Operacional Complexa!");
		        while (true) {
		            try {
		                System.out.println("\nEscolha uma operação:");
		                System.out.println("1. Soma");
		                System.out.println("2. Subtração");
		                System.out.println("3. Multiplicação");
		                System.out.println("4. Divisão");
		                System.out.println("5. Sair");

		                int operacao = obterEntradaInteira(scanner, "Digite o número da operação desejada: ");

		                if (operacao == 5) {
		                    System.out.println("Saindo do programa. Até logo!");
		                    break;
		                }

		                int numeroDeOperacoes = obterEntradaInteira(scanner, "Quantas operações você deseja realizar? ");
		                
		                for (int i = 1; i <= numeroDeOperacoes; i++) {
		                    System.out.println("\nOperação " + i + ":");
		                    double num1 = obterEntradaDecimal(scanner, "Digite o primeiro número: ");
		                    double num2 = obterEntradaDecimal(scanner, "Digite o segundo número: ");
		                    
		                    double resultado = realizarOperacao(operacao, num1, num2);
		                    System.out.println("Resultado da operação: " + resultado);
		                }

		            } catch (InputMismatchException e) {
		                System.out.println("Erro de entrada! Por favor, insira valores válidos.");
		                scanner.nextLine(); // Limpar o buffer do scanner
		            }
		        }
		        scanner.close();  // Fechar o scanner no final do programa
		    }

		    private static int obterEntradaInteira(Scanner scanner, String mensagem) {
		        System.out.print(mensagem);
		        while (!scanner.hasNextInt()) {
		            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
		            scanner.nextLine(); // Limpar o buffer do scanner
		        }
		        return scanner.nextInt();
		    }

		    private static double obterEntradaDecimal(Scanner scanner, String mensagem) {
		        System.out.print(mensagem);
		        while (!scanner.hasNextDouble()) {
		            System.out.println("Entrada inválida. Por favor, insira um número decimal.");
		            scanner.nextLine(); // Limpar o buffer do scanner
		        }
		        return scanner.nextDouble();
		    }

		    private static double realizarOperacao(int operacao, double num1, double num2) {
		        switch (operacao) {
		            case 1: // Soma
		                return num1 + num2;
		            case 2: // Subtração
		                return num1 - num2;
		            case 3: // Multiplicação
		                return num1 * num2;
		            case 4: // Divisão
		                if (num2 == 0) {
		                    System.out.println("Erro: Divisão por zero não é permitida.");
		                    return Double.NaN; // Retorna "NaN" se houver tentativa de divisão por zero
		                }
		                return num1 / num2;
		            default:
		                System.out.println("Operação inválida!");
		                return Double.NaN;
		        }
		    }
		

	

	}


