

package br.com.questao2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu: " +
                    "\n<1> Cadastar Projeto Distribuir Alimentos" +
                    "\n<2> Cadastar Projeto Trabalho Voluntário" +
                    "\n<3> Sair.");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                cadastrarProjetoDistribuicaoAlimentos(sc);
            } else if (escolha == 2) {
                cadastrarProjetoTrabalhoVoluntario(sc);
            } else if (escolha == 3) {
                System.out.println("Saindo");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }

    public static void cadastrarProjetoDistribuicaoAlimentos(Scanner sc) {
        System.out.print("Nome do Projeto: ");
        sc.nextLine();
        String nomeProjeto = sc.nextLine();
        System.out.print("Descricao: ");
        String descricao = sc.nextLine();
        System.out.print("Endereco: ");
        String endereco = sc.nextLine();
        System.out.print("Data de inicio: ");
        String dataInicio = sc.next();
        System.out.print("Data termino: ");
        String dataFim = sc.next();
        System.out.print("Descricao do alimento: ");
        sc.nextLine();
        String descAlimento = sc.nextLine();
        System.out.print("Quantidade: ");
        float qtde = sc.nextFloat();

        DistrAlimento projeto = new DistrAlimento(nomeProjeto, descricao, endereco, dataInicio, dataFim, descAlimento, qtde);

        boolean validacao = projeto.validaProjeto();
        System.out.println("");
        if (validacao) {
            System.out.println("Projeto validado.");
        } else {
            System.out.println("Projeto recusado. O projeto deve conter uma data fim.");
        }
        System.out.println(projeto.imprimeProjeto());
    }

    public static void cadastrarProjetoTrabalhoVoluntario(Scanner sc) {
        System.out.print("Nome do Projeto: ");
        sc.nextLine();
        String nomeProjeto = sc.nextLine();
        System.out.print("Descricao: ");
        String descricao = sc.nextLine();
        System.out.print("Endereco: ");
        String endereco = sc.nextLine();
        System.out.print("Data de inicio: ");
        String dataInicio = sc.next();
        System.out.print("Data termino: ");
        String dataFim = sc.next();
        System.out.print("Tipo de trabalho: ");
        sc.nextLine();
        String tipoTrabalho = sc.nextLine();
        System.out.print("Duracao do trabalho em meses: ");
        int duracaoTrabalho = sc.nextInt();

        TrabVoluntario projeto = new TrabVoluntario(nomeProjeto, descricao, endereco, dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);

        boolean validacao = projeto.validaProjeto();
        System.out.println("");
        if (validacao) {
            System.out.println("Projeto validado.");
        } else {
            System.out.println("Projeto recusado. A duração do projeto deve ser superior a 2 meses.");
        }
        System.out.println(projeto.imprimeProjeto());
    }
}

