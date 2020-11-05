package exercicio_01;

import java.util.ArrayList;

public class Construtora {
    //Atributos da classe "construtora"
    private String nome;
    private String cnpj;
    private Endereco localizacao;
    private ArrayList<Corretor> listaCorretores = new ArrayList<>();


    public String toString() {
        return "Construtora{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", localizacao=" + localizacao +
                ", listaCorretores=" + listaCorretores +
                '}';
    }

    //Método Principal --> CONSTRUTOR (Padrão e Sobrecarregado)
    public Construtora() {
    }

    public Construtora(String nome, String cnpj, Endereco localizacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.localizacao = localizacao;
    }

    //Métodos de acesso --> GETTERS E SETTERS
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Endereco getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Endereco localizacao) {
        this.localizacao = localizacao;
    }
    public ArrayList<Corretor> getListaCorretores() {
        return listaCorretores;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    //Método de Validação de CNPJ
    public boolean isCnpjValido() {
        cnpj = this.getCnpj();

        if (!cnpj.substring(0, 1).equals("")) {
            try {
                cnpj = cnpj.replace('.', ' ');//onde há ponto coloca espaço
                cnpj = cnpj.replace('/', ' ');//onde há barra coloca espaço
                cnpj = cnpj.replace('-', ' ');//onde há traço coloca espaço
                cnpj = cnpj.replaceAll(" ", "");//retira espaço
                int soma = 0, dig;
                String cnpj_calc = cnpj.substring(0, 12);

                if (cnpj.length() != 14) {
                    return false;
                }
                char[] chr_cnpj = cnpj.toCharArray();
                /* Primeira parte */
                for (int i = 0; i < 4; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                        soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(
                        dig);
                /* Segunda parte */
                soma = 0;
                for (int i = 0; i < 5; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                        soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(
                        dig);
                return cnpj.equals(cnpj_calc);
            }
            catch (Exception e) {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
