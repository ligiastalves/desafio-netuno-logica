package view;

import java.util.Random;
import java.util.Scanner;

public class TelaAvatar {
        private Scanner scanner = new Scanner(System.in);
        private Random random = new Random();

        // Variáveis para armazenar as escolhas
        private String corPele, corCabelo, tipoCabelo, corOlhos, corVestes, montariaEscolhida;
        private int vida, mana, velocidadeAtaque, forcaAtaque;
        private int velocidadeMontaria, tempoDescanso, ataqueMontaria;

        public void exibir() {
            System.out.println();
            System.out.println("Escolha as características do seu avatar:");
            System.out.print("Digite a cor da pele: ");
            corPele = scanner.nextLine();
            System.out.print("Digite a cor do cabelo: ");
            corCabelo = scanner.nextLine();
            System.out.print("Digite o tipo de cabelo (curto, longo, careca, moicano): ");
            tipoCabelo = scanner.nextLine();
            System.out.print("Digite a cor dos olhos: ");
            corOlhos = scanner.nextLine();
            System.out.print("Digite a cor da armadura ou vestimenta: ");
            corVestes = scanner.nextLine();

            boolean montariaValida = false;

            while (!montariaValida) {
                System.out.println("Escolha a montaria do seu avatar: ");
                System.out.println("6) Cavalo");
                System.out.println("7) Panda");
                System.out.println("8) Dragão");
                System.out.println("9) Tigre");
                System.out.println("10) Mamute");
                System.out.print("Digite o número da montaria desejada: ");
                int escolhaMontaria = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer

                switch (escolhaMontaria) {
                    case 6:
                        montariaEscolhida = "Cavalo";
                        velocidadeMontaria = random.nextInt(5) + 1;
                        tempoDescanso = random.nextInt(6) + 1;
                        ataqueMontaria = random.nextInt(9) + 1;
                        montariaValida = true;
                        break;
                    case 7:
                        montariaEscolhida = "Panda";
                        velocidadeMontaria = random.nextInt(3) + 1;
                        tempoDescanso = random.nextInt(7) + 1;
                        ataqueMontaria = random.nextInt(6) + 1;
                        montariaValida = true;
                        break;
                    case 8:
                        montariaEscolhida = "Dragão";
                        velocidadeMontaria = random.nextInt(4) + 1;
                        tempoDescanso = random.nextInt(5) + 1;
                        ataqueMontaria = random.nextInt(10) + 1;
                        montariaValida = true;
                        break;
                    case 9:
                        montariaEscolhida = "Tigre";
                        velocidadeMontaria = random.nextInt(5) + 1;
                        tempoDescanso = random.nextInt(6) + 1;
                        ataqueMontaria = random.nextInt(8) + 1;
                        montariaValida = true;
                        break;
                    case 10:
                        montariaEscolhida = "Mamute";
                        velocidadeMontaria = random.nextInt(3) + 1;
                        tempoDescanso = random.nextInt(8) + 1;
                        ataqueMontaria = random.nextInt(5) + 1;
                        montariaValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha um número entre 6 e 10 para a montaria.");
                        break;
                }
            }

            // Escolha aleatória dos pontos para as características da classe
            vida = random.nextInt(100) + 1;
            mana = random.nextInt(90) + 1;
            velocidadeAtaque = random.nextInt(10) + 1;
            forcaAtaque = random.nextInt(80) + 1;
        }

        public void imprimirEscolhas(String nomeClasse, String modeloArma) {
            System.out.println("Você escolheu a classe: " + nomeClasse);
            System.out.println("Sua arma é: " + modeloArma);
            System.out.println();
            System.out.println("Seu avatar é:");
            System.out.println("Pele: " + corPele);
            System.out.println("Cabelo: " + corCabelo + " e " + tipoCabelo);
            System.out.println("Olhos: " + corOlhos);
            System.out.println("Armadura ou vestimenta: " + corVestes);
            System.out.println();
            System.out.println("Montaria: " + montariaEscolhida);
            System.out.println();
            System.out.println("Atributos da classe:");
            System.out.println("Vida: " + vida);
            System.out.println("Mana: " + mana);
            System.out.println("Velocidade de Ataque: " + velocidadeAtaque + " m/s");
            System.out.println("Força de Ataque: " + forcaAtaque + " %");
            System.out.println();
            System.out.println("Atributos da montaria:");
            System.out.println("Velocidade: " + velocidadeMontaria + " m/s");
            System.out.println("Tempo para Descanso: " + tempoDescanso + " min");
            System.out.println("Ataque da Montaria: " + ataqueMontaria + " %");
            System.out.println();
        }

        public void exibirTelaFinal() {
            System.out.println("=== Game Over ===");
            System.out.println();
        }
}