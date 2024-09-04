import java.util.Scanner;

public class Paladino {
    private Scanner scanner = new Scanner(System.in);
    private String modeloArma;

    public void escolherArma() {
        System.out.println("Você escolheu a classe Paladino.");
        System.out.print("Escolha sua arma: [1] Lança ou [2] Escudo: ");
        int escolhaArma = scanner.nextInt();

        switch (escolhaArma) {
            case 1:
                modeloArma = "Lança";
                break;
            case 2:
                modeloArma = "Escudo";
                break;
            default:
                System.out.println("Opção inválida. Escolha [1] Lança ou [2] Escudo.");
                escolherArma(); // Reinicia a escolha de arma
                break;
        }
    }

    public String getModeloArma() {
        return modeloArma;
    }
}
