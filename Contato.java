
import java.util.Scanner;

public class Contato {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int qtd;

        System.out.println("Informe a quantidade de contatinhos: ");
        qtd = entrada.nextInt();

        String contato[] = new String[qtd];
        String nome[] = new String[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe o nome do contatinho " + (i + 1) + ": ");
            nome[i] = entrada.next();

            if (nome[i].length() <= 1) {
                System.out.println("Nome inválido");
            } else {
                i--;
            }

            System.out.println("Informe o número do contatinho " + (i + 1) + ": ");
            contato[i] = entrada.next();

            if (contato[i].length() < 3) {
                System.out.println("Telefone inválido");
            } else {
                i--;
            }

        }

        System.out.println("Relatório");
        for (int i = 0; i < qtd; i++) {
            System.out.println("Nome: " + nome[i] + " contato: " + contato[i]);
        }

        entrada.close();
    }
}

// tarefa: criar um programa que limpe a tela, e as palavras numero e nome
// fiquem em negrito