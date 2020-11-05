package exercicio_03;

public class Gerente extends Funcionario {
    //Atributos da classe "Gerente"
    private String senha;


    //Método Construtor
    public Gerente(String nome, int matricula, String senha) {
        super(nome, matricula);
        setSenha(senha);
    }


    //Métodos de Acesso --> GETTERS E SETTERS
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    //Métodos Especiais da Classe
    public float calcularDescontoMaior() {
        return 0;
    }
}
