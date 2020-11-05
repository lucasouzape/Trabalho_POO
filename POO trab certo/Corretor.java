package exercicio_01;

import java.util.HashMap;

public class Corretor {
    //Atributos da classe "corretor"
    private String nome;
    private int matricula;
    private float metaMensal;
    private HashMap<Integer, Float> vendasMes = new HashMap<>();
    private Endereco endResidencial;
    private static float totalVendido;


    //Método Principal --> CONSTRUTOR (Padrão e Sobrecarregado)


    public Corretor(String nome, int matricula, float metaMensal, Endereco endResidencial) {
        this.nome = nome;
        this.matricula = matricula;
        this.metaMensal = metaMensal;
        this.endResidencial = endResidencial;
    }

    //Métodos de acesso --> GETTERS E SETTERS
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
    public float getMetaMensal() {
        return metaMensal;
    }
    public void setMetaMensal(float metaMensal) {
        this.metaMensal = metaMensal;
    }
    public Endereco getEndResidencial() {
        return endResidencial;
    }
    public void setEndResidencial(Endereco endResidencial) {
        this.endResidencial = endResidencial;
    }
    public HashMap<Integer, Float> getVendasMes() {
        return vendasMes;
    }


    //Métodos de manipulação do HashMap
    public void inserirVendaMes(Integer key, float valor) {
        vendasMes.put(key, valor);
        Corretor.totalVendido = Corretor.totalVendido + valor;
    }
    public void removerVendaMes(Integer key) {
        vendasMes.remove(key);
    }
    public float buscarVendasMes(Integer key) {
        return vendasMes.get(key);
    }


    //Método estático "Total Vendido"
    public static float mostrarTotalVendido() {
        return totalVendido;
    }


    public String mostrarTamanhoLista() {
        return "Quantidade de vendas: " + vendasMes.size();
    }

    public String statusCorretor() {
        return "Nome: " + getNome() + "\nMatricula: " + getMatricula() + "\nMeta Mensal: " + getMetaMensal() + "\nUltima Venda: " + vendasMes.get(vendasMes.size());
    }
}
