package exercicio_01;

public class Endereco {
    //Atributos da classe "endereço"
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numeroCasa;
    private String cep;


    @Override
    public String toString() {
        return "Endereco{" +
                "estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                ", numeroCasa=" + numeroCasa +
                ", cep='" + cep + '\'' +
                '}';
    }

    //Método Principal --> CONSTRUTOR (Padrão e Sobrecarregado)
    public Endereco() {

    }
    public Endereco(String estado, String cidade, String bairro, String rua, int numeroCasa, String cep) {
        setEstado(estado);
        setCidade(cidade);
        setBairro(bairro);
        setRua(rua);
        setNumeroCasa(numeroCasa);
        setCep(cep);
    }


    //Métodos de acesso --> GETTERS E SETTERS
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumeroCasa() {
        return numeroCasa;
    }
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }


    //Métodos Especiais da Classe
    public String status() {
        return "Estado: " + getEstado() + "\nCidade: " + getCidade() + "\nBairro: " + getBairro() + "\nRua: " + getRua() + "\nNúmero Localização: " + getNumeroCasa() + "\nCEP: " + getCep();
    }
}
