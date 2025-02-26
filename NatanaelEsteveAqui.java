package aulas1dm;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class NatanaelEsteveAqui {

    // Função principal que gerencia o menu e a lógica do sistema
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        List<String> recados = new ArrayList<>();

        // Carregar recados de um arquivo (caso existam)
        carregarRecados(recados);

        do {
            // Exibe o menu de opções
            System.out.println("\nBem-vindo ao sistema de recados para o Natanael!");
            System.out.println("1. Deixar um recado para o Natanael");
            System.out.println("2. Ver recados deixados para o Natanael");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    // Opção para deixar um recado
                    deixarRecado(sc, recados);
                    break;
                case "2":
                    // Opção para visualizar recados anteriores
                    verRecados(recados);
                    break;
                case "3":
                    // Opção para sair
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("3"));

        // Salvar recados no arquivo antes de sair
        salvarRecados(recados);

        sc.close();
    }

    // Função para deixar um recado
    private static void deixarRecado(Scanner sc, List<String> recados) {
        System.out.println("\nDeixe seu recado para o Natanael:");
        String recado = sc.nextLine().trim();

        // Validação: Não permitir recado vazio
        if (recado.isEmpty()) {
            System.out.println("Você não pode deixar um recado vazio. Tente novamente.");
        } else {
            // Adicionar timestamp ao recado
            String timestamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
            recados.add("Recado para Natanael: [" + timestamp + "] " + recado);
            System.out.println("Recado registrado com sucesso!");
        }
    }

    // Função para ver os recados registrados
    private static void verRecados(List<String> recados) {
        if (recados.isEmpty()) {
            System.out.println("\nAinda não há recados registrados para o Natanael.");
        } else {
            System.out.println("\nRecados registrados para o Natanael:");
            for (String recado : recados) {
                System.out.println(recado);
            }
        }
    }

    // Função para carregar recados de um arquivo (caso existam)
    private static void carregarRecados(List<String> recados) {
        try (BufferedReader reader = new BufferedReader(new FileReader("recados.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                recados.add(line);
            }
        } catch (IOException e) {
            // Se o arquivo não existir, não faz nada
            System.out.println("Nenhum recado anterior encontrado.");
        }
    }

    // Função para salvar recados em um arquivo
    private static void salvarRecados(List<String> recados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("recados.txt"))) {
            for (String recado : recados) {
                writer.write(recado);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os recados: " + e.getMessage());
        }
    }
}
