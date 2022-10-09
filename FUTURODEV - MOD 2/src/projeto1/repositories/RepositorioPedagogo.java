package projeto1.repositories;

import projeto1.models.Pedagogo;
import projeto1.models.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static projeto1.repositories.RepositorioAluno.repositorioAlunos;

public class RepositorioPedagogo {

    public static List<Pedagogo> repositorioPedagogos = new ArrayList<>();

    public static void cadastraPedagogo(Scanner entrada) {
        System.out.printf("%nCADASTRO - NOVO PEDAGOGO%n");
        System.out.printf("Digite o nome do Pedagogo: ");
        String nome = entrada.nextLine();
        nome = nome.trim();
        System.out.printf("Digite um telefone para contato: ");
        String telefone = entrada.nextLine();
        telefone = telefone.trim();
        System.out.printf("Digite a data de nascimento de %s: ", nome);
        String dataNascimento = entrada.nextLine();
        dataNascimento = dataNascimento.trim();
        System.out.printf("Digite o CPF de %s: ", nome);
        String cpf = entrada.nextLine();
        cpf = cpf.trim();

        Pedagogo x = new Pedagogo(nome, telefone, dataNascimento, cpf);
        repositorioPedagogos.add(x);
    }

    public static void iniciaAtendimentoPedagogico(Scanner entrada) {
        System.out.printf("%nATENDIMENTO PEDAGÓGICO%n");
        System.out.printf("Digite o código do pedagogo que irá realizar o atendimento: ");
        int codigoPedagogo = Integer.parseInt(entrada.nextLine());
        int posicaoPedagogo = posicaoPedagogo(repositorioPedagogos, codigoPedagogo);
        if (posicaoPedagogo == -1) {
            System.out.println("Pedagogo não cadastrado.");
        } else {
            if (repositorioPedagogos.get(posicaoPedagogo).isEmAtendimentoPedagogico()) {
                System.out.printf("O pedagogo selecionado já está em um atendimento.%n");
            } else {
                System.out.printf("Digite o código do aluno que irá realizar o atendimento: ");
                int codigoAluno = Integer.parseInt(entrada.nextLine());
                int posicaoAluno = RepositorioAluno.posicaoAluno(repositorioAlunos, codigoAluno);
                if (posicaoAluno == -1) {
                    System.out.println("Aluno não cadastrado.");
                } else {
                    if (repositorioAlunos.get(posicaoAluno).getStatusMatricula().equals("Atendimento Pedagógico")) {
                        System.out.println("O aluno selecionado já está em um atendimento.%n");
                    } else {
                        repositorioPedagogos.get(posicaoPedagogo).setEmAtendimentoPedagogico(true);
                        repositorioAlunos.get(posicaoAluno).setStatusMatricula("Atendimento Pedagogico");
                    }
                }
            }
        }
    }

    public static void finalizaAtendimentoPedagogico
            (Scanner entrada) {
        System.out.printf("%nATENDIMENTO PEDAGÓGICO%n");
        System.out.print("Digite o código do pedagogo que irá realizar o atendimento: ");
        int codigoPedagogo = Integer.parseInt(entrada.nextLine());
        int posicaoPedagogo = posicaoPedagogo(repositorioPedagogos, codigoPedagogo);
        if (posicaoPedagogo == -1) {
            System.out.println("Pedagogo não cadastrado.");
        } else {
            if (!repositorioPedagogos.get(posicaoPedagogo).isEmAtendimentoPedagogico()) {
                System.out.println("O pedagogo " + repositorioPedagogos.get(posicaoPedagogo).getNome() +
                        " não está realizando atendimentos no momento.");
            } else {
                System.out.print("Digite o código do aluno que irá realizar o atendimento: ");
                int codigoAluno = Integer.parseInt(entrada.nextLine());
                int posicaoAluno = RepositorioAluno.posicaoAluno(repositorioAlunos, codigoAluno);
                if (posicaoAluno == -1) {
                    System.out.println("Aluno não cadastrado.");
                } else {
                    if (!repositorioAlunos.get(posicaoAluno).getStatusMatricula().equals("Atendimento Pedagogico")) {
                        System.out.println("O aluno " + repositorioAlunos.get(posicaoAluno).getNome() +
                                " não está em atendimento no momento.");
                    } else {
                        repositorioPedagogos.get(posicaoPedagogo).setEmAtendimentoPedagogico(false);
                        repositorioAlunos.get(posicaoAluno).setStatusMatricula("Ativo");
                        repositorioPedagogos.get(posicaoPedagogo).incrementoAtendimentoPedagogico();
                        repositorioAlunos.get(posicaoAluno).incrementoAtendimentoPedagogico();
                    }
                }
            }
        }
    }

    public static int posicaoPedagogo
            (List<Pedagogo> repositorioPedagogo,
             int codigo) {
        for (int i = 0; i < repositorioPedagogo.size(); i++) {
            if (repositorioPedagogo.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
}
