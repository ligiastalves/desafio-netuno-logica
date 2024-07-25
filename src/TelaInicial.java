import java.util.Scanner;

public class TelaInicial {
    private final Scanner scanner;

    public TelaInicial() {
        scanner = new Scanner(System.in);
    }

    public void exibir() {
        System.out.println("=== \"Bem-vindo ao Desafio Netuno feito por Lígia Alves\" ===");
        System.out.println("1. Cadastro");
        System.out.println("2. Login");
        System.out.println("3. Jogo");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        switch (escolha) {
            case 1:
                TelaCadastro telaCadastro = new TelaCadastro();
                telaCadastro.exibir();
                break;
            case 2:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                exibir();
                break;
        }
    }
}