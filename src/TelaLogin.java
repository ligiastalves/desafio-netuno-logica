/*
var
   email_login, senha_login: caracter
   login_sucesso: logico
inicio
   escreval()
   escreval("=== Tela de Login ===")
   escreval()
   login_sucesso <- falso

   para tentativas de 1 ate 3 faca
      escreva("Digite seu email cadastrado: ")
      leia(email_login)

      se (email_login = email_cad) entao
         escreva("Digite sua senha cadastrada: ")
         leia(senha_login)

         se (senha_login = senha_cad) entao
            escreval("Login realizado com sucesso!")
            escreval()
            TelaJogo()
            login_sucesso <- verdadeiro
            interrompa  // Sai do laço de repetição
         senao
            escreval("Senha incorreta. Tentativas restantes: ", 3 - tentativas)
         fimse
      senao
         escreval("Email não cadastrado. Tentativas restantes: ", 3 - tentativas)
      fimse
   fimpara

   se nao login_sucesso entao
      escreval("Número máximo de tentativas excedido.")
      FinalizarAlgoritmo()
   fimse

 */
public class TelaLogin {

}
