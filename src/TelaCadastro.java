import java.util.Scanner;

/*
var
   nome: caracter
   anoNascimento, mesNascimento, diaNascimento, anoAtual: inteiro
   idade: inteiro
   senha_confirm: caracter
inicio
   escreval("=== Tela de Cadastro ===")
   escreval()
   escreva("Digite o seu nome: ")
   leia(nome)
   // Leitura da data de nascimento do usuário
   escreva("Digite o ano de nascimento: ")
   leia(anoNascimento)
   escreva("Digite o mês de nascimento: ")
   leia(mesNascimento)
   escreva("Digite o dia de nascimento: ")
   leia(diaNascimento)
   escreval()

   anoAtual <- 2024  // Sempre colocar o ano atual
   idade <- anoAtual - anoNascimento

   se (mesNascimento > 7) ou ((mesNascimento = 7) e (diaNascimento > 3)) entao
      idade <- idade - 1
   fimse

   se idade >= 18 entao
      escreval("Você é maior de idade, continue... ")
      escreva("Digite um email: ")
      leia(email_cad)
      escreva("Digite uma senha: ")
      leia(senha_cad)
      escreva("Para confirmar, digite novamente sua senha: ")
      leia(senha_confirm)

      se ValidarSenha(senha_cad, senha_confirm) entao
         escreval("Cadastro realizado com sucesso!")
         TelaLogin()
      senao
         escreval("Senhas não conferem, tente novamente.")
         TelaCadastro()
      fimse
   senao
      escreval("Você é menor de idade.")
      FinalizarAlgoritmo()
   fimse


   // Função para verificar a senha
funcao ValidarSenha(senha_cad, senha_confirm: caracter): logico
inicio
   retorne (senha_cad = senha_confirm)
fimfuncao
 */
public class TelaCadastro {
    private final Scanner scanner;

    public TelaCadastro() {
        scanner = new Scanner(System.in);
    }

    public void exibir() {
        System.out.println("=== Tela de Cadastro ===");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua data de nascimento: ");
        String data_nasc = scanner.nextLine();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome: " + nome);

        // Voltar para a tela inicial
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.exibir();
    }
}