package exercicio_01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Scanners para a entrada de dados
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);


        //Inicialização de variáveis
        int menu, opcao, numCorretor;
        String cnpjB;
        float valorNovo;

        Endereco[] e = new Endereco[3];
        e[0] = new Endereco("Espírito Santo", "Vila Velha", "Itapuã", "Avenida Belo Horizonte", 452, "29167-042");
        e[1] = new Endereco("São Paulo", "São Paulo", "Capão Redondo", "Rua Antunes Santos", 98, "31155-007");
        e[2] = new Endereco("Minas Gerais", "Belo Horizonte", "Uberlândia", "Av. dos Andradas", 3000, "45122-040");


        Corretor[] c = new Corretor[2];
        c[0] = new Corretor("Lucas Pegoretti", 202089666, 10000.02f, e[0]);
        c[1] = new Corretor("Aline Kato", 2020121452, 10034.98f, e[1]);


        Construtora ct = new Construtora("Constroi Super Rápido", "41.507.373/0001-30", e[2]);


        c[0].inserirVendaMes(1, 5000.06f);
        c[0].inserirVendaMes(2, 12500.72f);

        c[1].inserirVendaMes(1, 1212.02f);
        c[1].inserirVendaMes(2, 2323.3f);


        do {
            exibirMenu();
            menu = entrada.nextInt();


            switch (menu) {
                case 1:
                    System.out.println("===> LISTAGEM DE ENDEREÇOS REGISTRADOS");

                    for (int i = 0; i < 3; i++) {
                        System.out.println("========== ENDEREÇO N° " + (i + 1) +" ==========");
                        System.out.println(e[i].status());
                        System.out.println("=====================================");
                    }

                    break;

                case 2:
                    for (int i = 0; i < 2; i++) {
                        System.out.println("========== CORRETOR N° " + (i + 1) + " ==========");
                        System.out.println(c[i].statusCorretor());
                        System.out.println("=======================================");
                    }

                    break;

                case 3:
                    System.out.println("========== EMPRESA ATUANTE ==========");
                    System.out.println("Nome: " + ct.getNome());
                    System.out.println("CNPJ: " + ct.getCnpj());
                    System.out.println("Endereço: " + ct.getLocalizacao().toString());

                    break;

                case 4:
                    System.out.println("===> VERIFICAR O CNPJ DA EMPRESA");

                    if (ct.isCnpjValido()) {
                        System.out.println("CNPJ é válido.");
                    }
                    else {
                        System.out.println("CNPJ não é válido.");
                    }

                    break;

                case 5:
                    System.out.println("===> ADIÇÃO DE VENDA PARA CORRETOR");

                    System.out.println("Digite o número do corretor na lista: ");
                    numCorretor = entrada.nextInt();

                    System.out.println("Digite o valor para adicionar a uma venda: ");
                    valorNovo = entrada.nextFloat();



                    break;
            }

        } while (menu != 6);


    }

    static void exibirMenu() {
        System.out.println("\n========== MENU DE OPÇÕES: ==========");
        System.out.println("1 - LISTAR ENDEREÇOS");
        System.out.println("2 - LISTAR CORRETORES");
        System.out.println("3 - MOSTRAR INFORMAÇÕES DA EMPRESA");
        System.out.println("4 - VALIDAR CNPJ");
        System.out.println("5 - ADICIONAR VENDA MENSAL EM UM CORRETOR");
        System.out.println("6 - SAIR");
        System.out.print("Digite a opção desejada: ");
    }

}
