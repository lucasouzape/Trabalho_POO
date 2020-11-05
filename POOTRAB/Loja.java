package exercicio_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    //Atributos da classe "Loja"
    private static ArrayList<Pedido> listaPedidos = new ArrayList<>();


    //Métodos de Acesso --> GETTERS E SETTERS
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }


    //Métodos especiais da classe
    public static void inserirPedido(Pedido p) {
        listaPedidos.add(p);
    }
    public static void removerPedido(Pedido p) {
        listaPedidos.remove(p);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu, codigo,codigoBusca, codigoRemocao, quant, contador = 0, quantidade;
        String data, item;
        Pedido objPedido;
        float preco;

        do {
            exibirMenu();
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n===> CADASTRO DE PEDIDOS");

                    System.out.print("Digite o ID do pedido: ");
                    codigo = entrada.nextInt();

                    System.out.print("Digite a data de emissão do pedido: ");
                    data = entradaString.nextLine();

                    System.out.print("\nDigite quantos tipos de itens você deseja adicionar: ");
                    quant = entrada.nextInt();



                    objPedido = new Pedido(codigo, data);

                    do {
                        System.out.print("\nDigite o nome do item: ");
                        item = entradaString.nextLine();

                        System.out.print("Digite a quantidade do item (" + item + ") que você deseja: ");
                        quantidade = entrada.nextInt();

                        System.out.print("Digite o preço de cada " + item + ": ");
                        preco = entrada.nextFloat();

                        objPedido.inserirItemPedido(item, quantidade, preco);

                        contador++;

                        if (contador == quant) {
                            contador = 0;
                            break;
                        }

                    } while (contador < quant);

                    inserirPedido(objPedido);

                    objPedido.calcularValorTotal();

                    break;

                case 2:
                    System.out.println("\n===> BUSCA DE PEDIDOS");

                    System.out.print("Digite o ID de seu pedido: ");
                    codigoBusca = entrada.nextInt();

                    for (Pedido p : listaPedidos) {
                        if (codigoBusca == p.getPedidoId()) {
                            System.out.println("\n========== PEDIDO N° " + codigoBusca + " ==========");

                            System.out.println(p.toString() + "\n");

                        }
                    }

                    break;

                case 3:
                    System.out.println("\n===> REMOÇÃO DE PEDIDOS");

                    System.out.print("Digite o ID do pedido que deseja remover: ");
                    codigoRemocao = entrada.nextInt();

                    for (Pedido p : listaPedidos) {
                        if (codigoRemocao == p.getPedidoId()) {
                            removerPedido(p);
                            System.out.println("O pedido foi removido com sucesso!");
                            break;
                        }
                        else {
                            System.out.println("O pedido não existe.");
                        }
                    }
                    break;
            }


        } while (menu != 4);
    }

    static void exibirMenu() {
        System.out.println("\n========== MENU DE OPÇÕES: ==========");
        System.out.println("1 - SOLICITAR UM PEDIDO");
        System.out.println("2 - BUSCAR PEDIDOS");
        System.out.println("3 - REMOVER PEDIDOS");
        System.out.println("4 - SAIR");
        System.out.print("Digite a opção desejada: ");
    }
}
