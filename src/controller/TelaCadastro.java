package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TelaCadastro {
    private Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void exibir() {
        String nome, emailCad, senhaCad, senhaConfirm;
        int anoNascimento, mesNascimento, diaNascimento, idade;
        LocalDate dataNascimento = null;
        LocalDate dataAtual = LocalDate.now();


        System.out.println("=== Tela de Cadastro ===");
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        // Validação da data de nascimento
        boolean dataValida = false;
        while (!dataValida) {
            System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
            String dataEntrada = scanner.nextLine();
            try {
                dataNascimento = LocalDate.parse(dataEntrada, formatter);
                // Verifica se a data de nascimento é uma data futura
                if (dataNascimento.isAfter(dataAtual)) {
                    System.out.println("Data de nascimento não pode ser no futuro. Tente novamente.");
                } else {
                    dataValida = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
            }
        }

        // Calcula a idade
        idade = dataAtual.getYear() - dataNascimento.getYear();
        if (dataNascimento.getMonthValue() > dataAtual.getMonthValue() ||
                (dataNascimento.getMonthValue() == dataAtual.getMonthValue() && dataNascimento.getDayOfMonth() > dataAtual.getDayOfMonth())) {
            idade--;
        }

        if (idade >= 18) {
            System.out.println("Você é maior de idade, continue...");
            System.out.print("Digite um email: ");
            emailCad = scanner.nextLine();

            System.out.print("Digite uma senha: ");
            senhaCad = scanner.nextLine();

            System.out.print("Para confirmar, digite novamente sua senha: ");
            senhaConfirm = scanner.nextLine();

            if (senhaCad.equals(senhaConfirm)) {
                System.out.println("Cadastro realizado com sucesso!");

                // Chama a Tela de Login
                TelaLogin telaLogin = new TelaLogin();
                telaLogin.exibir(emailCad, senhaCad);
            } else {
                System.out.println("Senhas não conferem, tente novamente.");
                exibir(); // Reinicia a tela de cadastro
            }
        } else {
            System.out.println("Você é menor de idade.");
            finalizarAlgoritmo();
        }
    }

    private void finalizarAlgoritmo() {
        System.out.println("Algoritmo finalizado.");
        System.exit(0);  // Encerra o programa
    }
}