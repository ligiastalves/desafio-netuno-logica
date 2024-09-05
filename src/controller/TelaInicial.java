package controller;

public class TelaInicial {

    // Método para mostrar a tela inicial
    public void exibir() {
        System.out.println("Bem-vindo ao Desafio Netuno feito por Lígia Alves");
        System.out.println();

        // Chama a tela de cadastro
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.exibir();
    }
}