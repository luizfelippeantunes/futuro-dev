package projeto1.reports;

import static projeto1.repositories.RepositorioAluno.repositorioAlunos;
import static projeto1.repositories.RepositorioPedagogo.repositorioPedagogos;
import static projeto1.repositories.RepositorioProfessor.repositorioProfessores;

public class Relatorios {

    public static void relatorioTodasPessoas() {
        for (int i = 0; i < repositorioAlunos.size(); i++) {
            System.out.println(repositorioAlunos.get(i));
        }

        for (int i = 0; i < repositorioProfessores.size(); i++) {
            System.out.println(repositorioProfessores.get(i));
        }
        for (int i = 0; i < repositorioPedagogos.size(); i++) {
            System.out.println(repositorioPedagogos.get(i));
        }
    }

    public static void relatorioTodosAlunos() {
        for (int i = 0; i < repositorioAlunos.size(); i++) {
            System.out.println(repositorioAlunos.get(i));
        }
    }

    public static void relatorioTodosProfessores() {
        for (int i = 0; i < repositorioProfessores.size(); i++) {
            System.out.println(repositorioProfessores.get(i));
        }
    }

    public static void relatorioTodosPedagogos() {
        for (int i = 0; i < repositorioPedagogos.size(); i++) {
            System.out.println(repositorioPedagogos.get(i));
        }
    }

    public static void relatorioAlunosAtivos() {
        int contador = 0;
        if (repositorioAlunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < repositorioAlunos.size(); i++) {
                if (repositorioAlunos.get(i).getStatusMatricula().equals("Ativo")) {
                    contador++;
                    System.out.println("C�digo: " + repositorioAlunos.get(i).getCodigo() +
                            ", Nome: " + repositorioAlunos.get(i).getNome() +
                            ", Nota: " + repositorioAlunos.get(i).getNotaProcessoSeletivo() +
                            ", Total de Atendimentos pedag�gicos: " + repositorioAlunos.get(i).getQtdAtendimentosPedagogicos() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum aluno com a matr�cula ativa.");
            }
        }
    }

    public static void relatorioAlunosIrregulares() {
        int contador = 0;
        if (repositorioAlunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < repositorioAlunos.size(); i++) {
                if (repositorioAlunos.get(i).getStatusMatricula().equals("Irregular")) {
                    contador++;
                    System.out.println("C�digo: " + repositorioAlunos.get(i).getCodigo() +
                            ", Nome: " + repositorioAlunos.get(i).getNome() +
                            ", Nota: " + repositorioAlunos.get(i).getNotaProcessoSeletivo() +
                            ", Total de Atendimentos pedag�gicos: " + repositorioAlunos.get(i).getQtdAtendimentosPedagogicos() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum aluno com a matr�cula irregular.");
            }
        }
    }

    public static void relatorioAlunosEmAtendimento() {
        int contador = 0;
        if (repositorioAlunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < repositorioAlunos.size(); i++) {
                if (repositorioAlunos.get(i).getStatusMatricula().equals("Atendimento Pedagogico")) {
                    contador++;
                    System.out.println("C�digo: " + repositorioAlunos.get(i).getCodigo() +
                            ", Nome: " + repositorioAlunos.get(i).getNome() +
                            ", Nota: " + repositorioAlunos.get(i).getNotaProcessoSeletivo() +
                            ", Total de Atendimentos pedag�gicos: " + repositorioAlunos.get(i).getQtdAtendimentosPedagogicos() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum aluno em atendimento pedag�gico.");
            }
        }
    }


    public static void relatorioAlunosInativos() {
        int contador = 0;
        if (repositorioAlunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < repositorioAlunos.size(); i++) {
                if (repositorioAlunos.get(i).getStatusMatricula().equals("Inativo")) {
                    contador++;
                    System.out.println("C�digo: " + repositorioAlunos.get(i).getCodigo() +
                            ", Nome: " + repositorioAlunos.get(i).getNome() +
                            ", Nota: " + repositorioAlunos.get(i).getNotaProcessoSeletivo() +
                            ", Total de Atendimentos pedag�gicos: " + repositorioAlunos.get(i).getQtdAtendimentosPedagogicos() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum aluno com a matr�cula inativa.");
            }
        }
    }

    public static void relatorioAlunosTodos() {
        if (repositorioAlunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < repositorioAlunos.size(); i++) {
                System.out.println("C�digo: " + repositorioAlunos.get(i).getCodigo() +
                        ", Nome: " + repositorioAlunos.get(i).getNome() +
                        ", Nota: " + repositorioAlunos.get(i).getNotaProcessoSeletivo() +
                        ", Total de Atendimentos pedag�gicos: " + repositorioAlunos.get(i).getQtdAtendimentosPedagogicos() + ".");
            }
        }
    }

    public static void relatorioProfessoresFront() {
        int contador = 0;
        if (repositorioProfessores.size() == 0) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (int i = 0; i < repositorioProfessores.size(); i++) {
                if (repositorioProfessores.get(i).getExperienciaDev().equals("Front-End")) {
                    contador++;
                    System.out.println("C�digo: " + repositorioProfessores.get(i).getCodigo() +
                            ", Nome: " + repositorioProfessores.get(i).getNome() +
                            ", Experi�ncia DEV: " + repositorioProfessores.get(i).getExperienciaDev() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum professor Front-End cadastrado.");
            }
        }
    }

    public static void relatorioProfessoresBack() {
        int contador = 0;
        if (repositorioProfessores.size() == 0) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (int i = 0; i < repositorioProfessores.size(); i++) {
                if (repositorioProfessores.get(i).getExperienciaDev().equals("Back-End")) {
                    contador++;
                    System.out.println("C�digo: " + repositorioProfessores.get(i).getCodigo() +
                            ", Nome: " + repositorioProfessores.get(i).getNome() +
                            ", Experi�ncia DEV: " + repositorioProfessores.get(i).getExperienciaDev() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum professor Back-End cadastrado.");
            }
        }
    }

    public static void relatorioProfessoresFull() {
        int contador = 0;
        if (repositorioProfessores.size() == 0) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (int i = 0; i < repositorioProfessores.size(); i++) {
                if (repositorioProfessores.get(i).getExperienciaDev().equals("Full-Stack")) {
                    contador++;
                    System.out.println("C�digo: " + repositorioProfessores.get(i).getCodigo() +
                            ", Nome: " + repositorioProfessores.get(i).getNome() +
                            ", Experi�ncia DEV: " + repositorioProfessores.get(i).getExperienciaDev() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum professor Full-Stack cadastrado.");
            }
        }
    }

    public static void relatorioProfessoresTodos() {
        if (repositorioProfessores.size() == 0) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (int i = 0; i < repositorioProfessores.size(); i++) {
                System.out.println("C�digo: " + repositorioProfessores.get(i).getCodigo() +
                        ", Nome: " + repositorioProfessores.get(i).getNome() +
                        ", Experi�ncia DEV: " + repositorioProfessores.get(i).getExperienciaDev() + ".");
            }
        }
    }

    public static void relatorioPedagogosDisponiveis() {
        int contador = 0;
        if (repositorioPedagogos.size() == 0) {
            System.out.println("Nenhum pedagogo cadastrado.");
        } else {
            for (int i = 0; i < repositorioPedagogos.size(); i++) {
                if (!repositorioPedagogos.get(i).isEmAtendimentoPedagogico()) {
                    contador++;
                    System.out.println("C�digo: " + repositorioPedagogos.get(i).getCodigo() +
                            ", Nome: " + repositorioPedagogos.get(i).getNome() +
                            ", Quantidade Atendimentos: " + repositorioPedagogos.get(i).getQtdAtendimentosPedagogicos() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("N�o h� nenhum pedagogo dispon�vel.");
            }
        }
    }

    public static void relatorioPedagogosEmAtendimento() {
        int contador = 0;
        if (repositorioPedagogos.size() == 0) {
            System.out.println("Nenhum pedagogo cadastrado.");
        } else {
            for (int i = 0; i < repositorioPedagogos.size(); i++) {
                if (repositorioPedagogos.get(i).isEmAtendimentoPedagogico()) {
                    contador++;
                    System.out.println("C�digo: " + repositorioPedagogos.get(i).getCodigo() +
                            ", Nome: " + repositorioPedagogos.get(i).getNome() +
                            ", Quantidade Atendimentos: " + repositorioPedagogos.get(i).getQtdAtendimentosPedagogicos() + ".");
                }
            }
            if (contador == 0) {
                System.out.println("Nenhum pedagogo em atendimento.");
            }
        }
    }

    public static void relatorioAlunoMaisAtendido() {
        int alunoMaisAtendido = -1;
        int qtdAtendimentos = 0;
        if (repositorioAlunos.size() == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < repositorioAlunos.size(); i++) {
                if (repositorioAlunos.get(i).getQtdAtendimentosPedagogicos() > qtdAtendimentos) {
                    qtdAtendimentos = repositorioAlunos.get(i).getQtdAtendimentosPedagogicos();
                    alunoMaisAtendido = i;
                }
            }
            if (alunoMaisAtendido == -1) {
                System.out.println("Nenhum aluno recebeu atendimento pedag�gico.");
            } else {
                System.out.println("C�digo: " + repositorioAlunos.get(alunoMaisAtendido).getCodigo() +
                        ", Nome: " + repositorioAlunos.get(alunoMaisAtendido).getNome() + ".");
            }
        }
    }

    public static void relatorioPedagogoMaisAtendeu() {
        int pedagogoMaisAtendeu = -1;
        int qtdAtendimentos = 0;
        if (repositorioPedagogos.size() == 0) {
            System.out.println("Nenhum pedagogo cadastrado.");
        } else {
            for (int i = 0; i < repositorioPedagogos.size(); i++) {
                if (repositorioPedagogos.get(i).getQtdAtendimentosPedagogicos() > qtdAtendimentos) {
                    qtdAtendimentos = repositorioPedagogos.get(i).getQtdAtendimentosPedagogicos();
                    pedagogoMaisAtendeu = i;
                }
            }
            if (pedagogoMaisAtendeu == -1) {
                System.out.println("Nenhum pedagogo efetuou atendimentos.");
            } else {
                System.out.println("C�digo: " + repositorioPedagogos.get(pedagogoMaisAtendeu).getCodigo() +
                        ", Nome: " + repositorioPedagogos.get(pedagogoMaisAtendeu).getNome() + ".");
            }
        }
    }
}