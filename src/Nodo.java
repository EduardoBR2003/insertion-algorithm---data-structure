package src;
/* Alunos: Eduardo Rodrigues da Silva, Marlon Neves da Mota, Guilherme Pereira da Silva
 *  Disciplina: Estrutura de dados I
 *  Data de codificação: 18/08/2024
 *  Objetivo da classe Nodo: A classe Nodo é utilizada como o bloco de construção básico de uma lista encadeada,
 *  permitindo armazenar e conectar múltiplos objetos Aluno em uma estrutura de dados dinâmica.
 * */
public class Nodo {

    private Nodo next;
    private Aluno aluno;

    public Nodo(Aluno aluno) {
        this.aluno = aluno;
    }
    public Nodo(){

    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
