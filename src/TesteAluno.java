package src;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListaAluno ls = new ListaAluno();
        int menu;
        while (true) {
            System.out.print(menu());
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                Aluno aluno = new Aluno();
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
                sc.nextLine();
            } else if (menu == 4) {
                System.out.println("Insira a matrícula para buscar o aluno: ");
                System.out.println(ls.buscarAlunoPorMatri(sc.nextInt()).toString() + "\n");
            } else if (menu == 5) {
                System.out.println("Remova o aluno inserindo a matrícula: ");
                System.out.println("O aluno removido: " + ls.removerAluno(sc.nextInt()).getAluno().toString());
            } else if (menu == 6) {
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
                1 - Para adicionar aluno\s
                2 - Para LISTAR alunos\s
                3 - Para buscar aluno pela NOTA\s
                4 - Para buscar aluno pela MATRÍCULA\s
                5 - Para remover aluno pela MATRÍCULA\s
                6 - Tamanho da lista\s
                0 - Para SAIR.\s
                """;
    }


//        Scanner sc = new Scanner(System.in);
//
//
//        Aluno a = new Aluno("Aluno1",1234,sc.nextFloat());
//        Aluno a2 = new Aluno("Aluno2",1234,sc.nextFloat());
//        Aluno a3 = new Aluno("Aluno3",1234,sc.nextFloat());
//        Aluno a4 = new Aluno("Aluno4",1234,sc.nextFloat());
//        Aluno a5 = new Aluno("Aluno5",1234,sc.nextFloat());
//
//
//        ListaAluno l = new ListaAluno();
//        l.inserirAluno(a);
//        l.inserirAluno(a2);
//        l.inserirAluno(a3);
//        l.inserirAluno(a4);
//        l.inserirAluno(a5);
//
//        l.imprimir();
}
