package src;

import java.util.Scanner;
/* Alunos: Eduardo Rodrigues da Silva, Marlon Neves da Mota, Guilherme Pereira da Silva
*  Disciplina: Estrutura de dados I
*  Data de codificação: 18/08/2024
*  Objetivo da classe Main: Tem como objetivo ser a interface principal de interação com o
*  usuário para gerenciar uma lista de alunos.
* */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListaAluno ls = new ListaAluno();
        int menu;
        while (true) {
            System.out.print(menu());
            menu = sc.nextInt();
            sc = new Scanner(System.in);
            if (menu == 1) {
                Aluno aluno = new Aluno();
                System.out.println("Insira seu nome: ");
                aluno.setNome(sc.nextLine());
                System.out.println("Insira a cidade: ");
                aluno.setEndereco(sc.nextLine());
                System.out.println("Insira o telefone: ");
                aluno.setTelefone(sc.nextLine());
                System.out.println("Insira a matrícula: ");
                aluno.setMatricula(sc.nextInt());
                System.out.println("Insira a nota: ");
                aluno.setNota(sc.nextFloat());
                ls.inserirAluno(aluno);
            } else if (menu == 2) {
                ls.imprimir();
            } else if (menu == 3) {
                System.out.println("Insira a nota para buscar o aluno: ");
                float numNoFormat = sc.nextFloat();
                ls.buscarAlunoPorNota(numNoFormat);

            } else if (menu == 4) {
                System.out.println("Insira a matrícula para buscar o aluno: ");
                System.out.println(ls.buscarAlunoPorMatri(sc.nextInt()).toString() + "\n");

            }else if (menu == 5) {
                System.out.println("Insira a cidade para buscar o aluno: ");
                ls.buscarAlunoPorCidade(sc.nextLine());
            } else if (menu == 6) {
                System.out.println("Remova o aluno inserindo a matrícula: ");
                System.out.println("O aluno removido: " + ls.removerAluno(sc.nextInt()).getAluno().toString());

            } else if (menu == 7) {
                System.out.println("\nO tamanho da lista é :" + ls.getCont() + "\n");

            } else if (menu == 0) {
                break;
            } else {
                System.out.println("Insira uma opção valida: ");

            }

        }
    }

    public static String menu() { //Método menu
        return """
                \nINSIRA A OPÇÃO QUE DESEJA:\s
                1 - Adicionar aluno\s
                2 - LISTAR alunos\s
                3 - Buscar aluno pela NOTA\s
                4 - Buscar aluno pela MATRÍCULA\s
                5 - Buscar aluno pela CIDADE\s
                6 - Remover aluno pela MATRÍCULA\s
                7 - Tamanho da lista\s
                0 - Para SAIR.\s
                """;
    }
}
