package src;
/* Alunos: Eduardo Rodrigues da Silva, Marlon Neves da Mota, Guilherme Pereira da Silva
 *  Disciplina: Estrutura de dados I
 *  Data de codificação: 18/08/2024
 *  Objetivo da classe Aluno: Essa classe serve como uma estrutura básica para
 *  armazenar e manipular as informações dos alunos (Classe modelo).
 * */
public class Aluno {
    private String nome;
    private int matricula;
    private float nota;
    private String endereco;
    private String telefone;

    public Aluno(){

    }

    public Aluno(String nome, int matricula, float nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
