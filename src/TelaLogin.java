import java.util.Scanner;

public class TelaLogin {

    private Scanner scanner = new Scanner(System.in);

    public void exibir(String emailCad, String senhaCad) {
        String emailLogin, senhaLogin;
        boolean loginSucesso = false;

        System.out.println();
        System.out.println("=== Tela de Login ===");
        System.out.println();

        for (int tentativas = 1; tentativas <= 3; tentativas++) {
            System.out.print("Digite seu email cadastrado: ");
            emailLogin = scanner.nextLine();

            if (emailLogin.equals(emailCad)) {
                System.out.print("Digite sua senha cadastrada: ");
                senhaLogin = scanner.nextLine();

                if (senhaLogin.equals(senhaCad)) {
                    System.out.println("Login realizado com sucesso!");
                    System.out.println();
                    TelaJogo telaJogo = new TelaJogo();
                    telaJogo.exibir();
                    loginSucesso = true;
                    break;  // Sai do laço de repetição
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + (3 - tentativas));
                }
            } else {
                System.out.println("Email não cadastrado. Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (!loginSucesso) {
            System.out.println("Número máximo de tentativas excedido.");
            finalizarAlgoritmo();
        }
    }

    private void finalizarAlgoritmo() {
        System.out.println("Algoritmo finalizado.");
        System.exit(0);  // Encerra o programa
    }
}
