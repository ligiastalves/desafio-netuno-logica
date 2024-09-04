import java.util.Scanner;

public class Barbaro {

    private Scanner scanner = new Scanner(System.in);
    private String modeloArma;

    public void escolherArma() {
        System.out.println("Você escolheu a classe Bárbaro.");
        System.out.print("Escolha sua arma: [1] Machado ou [2] Marreta: ");
        int escolhaArma = scanner.nextInt();

        switch (escolhaArma) {
            case 1:
                modeloArma = "Machado";
                break;
            case 2:
                modeloArma = "Marreta";
                break;
            default:
                System.out.println("Opção inválida. Escolha [1] Machado ou [2] Marreta.");
                escolherArma(); // Reinicia a escolha de arma
                break;
        }
    }

    public String getModeloArma() {
        return modeloArma;
    }
}
