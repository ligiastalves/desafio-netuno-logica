/*
var
   escolha_montaria: inteiro
   montaria_valida: logico
inicio
   escreval()
   escreval("Escolha as características do seu avatar: ")
   escreval()
   escreva("Digite a cor da pele: ")
   leia(cor_pele)
   escreva("Digite a cor do cabelo: ")
   leia(cor_cabelo)
   escreva("Digite o tipo de cabelo (curto, longo, careca, moicano): ")
   leia(tipo_cabelo)
   escreva("Digite a cor dos olhos: ")
   leia(cor_olhos)
   escreva("Digite a cor da armadura ou vestimenta: ")
   leia(cor_vestes)
   escreval()

   montaria_valida <- falso

   enquanto não montaria_valida faca
      escreval("Escolha a montaria do seu avatar: ")
      escreval("6) Cavalo")
      escreval("7) Panda")
      escreval("8) Dragão")
      escreval("9) Tigre")
      escreval("10) Mamute")
      escreva("Digite o número da montaria desejada: ")
      leia(escolha_montaria)

      escolha escolha_montaria
      caso 6
         montaria_escolhida <- "Cavalo"
         velocidade_montaria <- randi(5) // Escolha aleatória dos pontos para as características da montaria
         tempo_descanso <- randi(6)
         ataque_montaria <- randi(9)
         montaria_valida <- verdadeiro
      caso 7
         montaria_escolhida <- "Panda"
         velocidade_montaria <- randi(3)
         tempo_descanso <- randi(7)
         ataque_montaria <- randi(6)
         montaria_valida <- verdadeiro
      caso 8
         montaria_escolhida <- "Dragão"
         velocidade_montaria <- randi(4)
         tempo_descanso <- randi(5)
         ataque_montaria <- randi(10)
         montaria_valida <- verdadeiro
      caso 9
         montaria_escolhida <- "Tigre"
         velocidade_montaria <- randi(5)
         tempo_descanso <- randi(6)
         ataque_montaria <- randi(8)
         montaria_valida <- verdadeiro
      caso 10
         montaria_escolhida <- "Mamute"
         velocidade_montaria <- randi(3)
         tempo_descanso <- randi(8)
         ataque_montaria <- randi(5)
         montaria_valida <- verdadeiro
      outrocaso
         escreval("Opção inválida. Escolha um número entre 6 e 10 para a montaria.")
      fimescolha
   fimenquanto

   // Escolha aleatória dos pontos para as características da classe
   vida <- randi(100)
   mana <- randi(90)
   velocidade_ataque <- randi(10)
   forca_ataque <- randi(80)
fimprocedimento
 */

public class Avatar {


}
