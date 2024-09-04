import java.util.Scanner;

public class TelaJogo {

    private Scanner scanner = new Scanner(System.in);

    public void exibir() {
        System.out.println();
        System.out.println("=== Tela do Jogo ===");
        System.out.println();
        System.out.println("Escolha a classe para jogar: ");
        System.out.println("1) Paladino [Lança ou Escudo]");
        System.out.println("2) Atirador [Arma]");
        System.out.println("3) Guerreiro [Espada e Escudo]");
        System.out.println("4) Bárbaro [Machado ou Marreta]");
        System.out.println("5) Arqueiro [Arco]");
        System.out.print("Digite o número da classe desejada: ");

        int classe = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        String nomeClasse = "";
        String modeloArma = "";

        switch (classe) {
            case 1:
                Paladino paladino = new Paladino();
                paladino.escolherArma();
                nomeClasse = "Paladino";
                modeloArma = paladino.getModeloArma();
                break;
            case 2:
                Atirador atirador = new Atirador();
                atirador.escolherArma();
                nomeClasse = "Atirador";
                modeloArma = atirador.getModeloArma();
                break;
            case 3:
                Guerreiro guerreiro = new Guerreiro();
                guerreiro.escolherArma();
                nomeClasse = "Guerreiro";
                modeloArma = guerreiro.getModeloArma();
                break;
            case 4:
                Barbaro barbaro = new Barbaro();
                barbaro.escolherArma();
                nomeClasse = "Barbaro";
                modeloArma = barbaro.getModeloArma();
                break;
            case 5:
                Arqueiro arqueiro = new Arqueiro();
                arqueiro.escolherArma();
                nomeClasse = "Arqueiro";
                modeloArma = arqueiro.getModeloArma();
                break;
            default:
                System.out.println("Opção inválida. Escolha um número entre 1 e 5.");
                exibir(); // Reinicia a tela de jogo se a opção for inválida
                return;
        }

        // Exibe a tela de avatar para personalizar o personagem
        TelaAvatar telaAvatar = new TelaAvatar();
        telaAvatar.exibir();

        // Imprime as escolhas feitas pelo jogador
        telaAvatar.imprimirEscolhas(nomeClasse, modeloArma);

        // Exibe a tela final
        telaAvatar.exibirTelaFinal();
    }
}
