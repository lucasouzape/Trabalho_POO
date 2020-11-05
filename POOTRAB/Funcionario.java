package exercicio_03;

public class Funcionario {
    //Atributos da classe funcionário
    private String nome;
    private int matricula;


    //Método Construtor
    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }


    //Métodos de Acesso --> GETTERS E SETTERS
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

}
