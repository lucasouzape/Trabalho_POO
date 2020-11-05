package exercicio_03;

import java.util.HashSet;
import java.util.Set;

public class Pedido {
    //Atributos da classe "Pedido"
    private int pedidoId;
    private String dataEmissao;
    private float valorTotalCalculado;
    private Set<ItemPedido> itens = new HashSet<>();


    //Método Principal --> CONSTRUTOR (Padrão e Sobrecarregado)
    public Pedido() {
    }
    public Pedido(int pedidoId, String dataEmissao) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
    }


    public String toString() {
        return "pedidoId: " + pedidoId +
                "\nData de Emissao: " + dataEmissao + '\'' +
                "\n" + String.format("Preço Total: R$ %.2f", valorTotalCalculado) +
                "\nItens: " + itens;
    }

    //Métodos de Acesso --> GETTERS E SETTERS
    public int getPedidoId() {
        return pedidoId;
    }
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }
    public String getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public float getValorTotalCalculado() {
        return valorTotalCalculado;
    }
    public void setValorTotalCalculado(float valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }

    //Métodos Especiais da Classe
    public boolean inserirItemPedido(String item, int quantidade, float precoUnitario) {
        itens.add(new ItemPedido(item, quantidade, precoUnitario));

        return true;
    }

    public boolean removerItemPedido(String item) {
        for (ItemPedido i : itens) {
            if (i.getItem().equals(item)) {
                itens.remove(i);

                return true;
            }
        }

        return false;
    }

    public ItemPedido buscarItemPedido(String item) {
        for (ItemPedido i : itens) {
            if (i.getItem().equals(item)) {
                i.mostrar();
            }
        }
        return null;
    }

    public float calcularValorTotal() {
        for (ItemPedido i : itens) {
            valorTotalCalculado += (i.getPrecoUnitario() * i.getQuantidade());

        }

        return valorTotalCalculado;
    }
}
