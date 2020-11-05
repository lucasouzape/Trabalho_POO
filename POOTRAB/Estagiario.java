package exercicio_03;

public class Estagiario extends Funcionario {


    //Método Construtor
    public Estagiario(String nome, int matricula) {
        super(nome, matricula);
    }

    //Métodos Especiais da Classe
    public float calcularDescontoMenor() {
        return 0;
    }
}
