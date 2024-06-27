package br.com.dio;

public class SistemaIBGE {

    public static void main(String[] args) {
        // imprimindo os estados existentes no enum
        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
        }

        // selecionando um estado a partir das opções disponíveis
        EstadoBrasileiro ufSelecionado = EstadoBrasileiro.SAO_PAULO;

        System.out.println("---------DADOS DO ESTADO SELECIONADO---------");
        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
        System.out.println("Código IBGE: " + ufSelecionado.getCodigoIbge());
    }
}
