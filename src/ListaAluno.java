package src;

public class ListaAluno {
    private Nodo pri;
    private Nodo ult;
    private int cont;

    public ListaAluno() {
        setPri(new Nodo());
        setUlt(getPri());
        getPri().setNext(null);
        this.cont = 0;
    }

    //VERIFICAR SE ESTÁ VAZIO
    public Boolean vazio(){
        return getPri()==getUlt();

    }

    public void inserirFim(Aluno aluno) {
        Nodo novo = new Nodo(aluno);

        getUlt().setNext(novo);
        setUlt(novo);
        novo.setNext(null);
    }


    //MÉTODO PARA INSERÇÃO EM ORDEM DA MAIOR NOTA PARA A MENOR
    public void inserirAluno(Aluno aluno) {
        Nodo novoAluno = new Nodo();
        Nodo aux = getPri();
        while (aux.getNext() != null && aluno.getNota() <= aux.getNext().getAluno().getNota()) {
            aux = aux.getNext();
        }
        novoAluno.setNext(aux.getNext());
        aux.setNext(novoAluno);
        novoAluno.setAluno(aluno);
        cont++;
        if (novoAluno.getNext() == null) {
            setUlt(novoAluno);
        }
    }


    //MÉTODO IMPRIMIR A LISTA DE ALUNOS
    public void imprimir(){
        Nodo novo = getPri();

        while (novo.getNext() != null) {
            novo = novo.getNext();
            System.out.println(novo.getAluno().toString());
        }
    }

    //BUSCAR POR NOTA
    public Aluno buscarAlunoPorNota(float nota){
        Aluno buscar = new Aluno();

        Nodo aux = getPri();
        while (aux.getNext() != null) {
            if(aux.getNext().getAluno().getNota()==nota){
                buscar = (aux.getNext().getAluno());
            }
            aux = aux.getNext();
        }
        return buscar;
    }

    //BUSCAR POR MATRÍCULA
    public Aluno buscarAlunoPorMatri(int matricula) throws Exception {
        if (vazio())
            throw new Exception("A lista está vázia!\n");

        Nodo aux = getPri();
        while (aux.getNext() != null && aux.getNext().getAluno().getMatricula() != matricula) {
            aux = aux.getNext();
        }
        if (aux.getNext() == null) {
            throw new Exception("Não existe esse aluno com essa matrícula!\n");
        }
        return aux.getNext().getAluno();
    }

    //REMOVER POR MATRÍCULA
    public Nodo removerAluno(int matricula) throws Exception {
        if (vazio())
            throw new Exception("A lista está vázia!\n");

        Nodo aux = getPri();
        while (aux.getNext() != null && aux.getNext().getAluno().getMatricula() != matricula) {
            aux = aux.getNext();
        }

        if (aux.getNext() == null)
            throw new Exception("Não existe esse aluno com essa matrícula!\n");

        Nodo alunoRemovido = aux.getNext();
        aux.setNext(alunoRemovido.getNext());
        cont--;

        if (aux.getNext() == null)
            setUlt(aux);

        return alunoRemovido;
    }





    //Métodos gettes e settes
    public Nodo getPri() {
        return pri;
    }

    public void setPri(Nodo pri) {
        this.pri = pri;
    }

    public Nodo getUlt() {
        return ult;
    }

    public void setUlt(Nodo ult) {
        this.ult = ult;
    }

    public int getCont() {
        return cont;
    }
}
