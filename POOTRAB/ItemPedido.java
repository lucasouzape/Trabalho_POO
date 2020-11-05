package exercicio_03;

public class ItemPedido {
    //Atributos da classe "ItemPedido"
    private String item;
    private int quantidade;
    private float precoUnitario;

    //Método Principal --> CONSTRUTOR (Padrão e Sobrecarregado)
    public ItemPedido() {
    }
    public ItemPedido(String item, int quantidade, float precoUnitario) {
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }


    public String toString() {
        return "ItemPedido{" +
                "item='" + item + '\'' +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                '}';
    }

    //Métodos de Acesso --> GETTERS E SETTERS
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


    //Métodos Especiais da classe
    public String mostrar() {
        return "Item: " + this.item + "\nQuantidade: " + this.quantidade + String.format("\nPreço por Unidade: R$ %.2f", this.precoUnitario);
    }
}
