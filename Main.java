import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
    int resposta;
    boolean status = true;
    int define;
    
    while (status == true){
        System.out.println("""
        ------ Jogo do número secreto ------
        ------      1 - Jogar         ------
        ------      2 - Sair          ------
        ------------------------------------
        """);
        System.out.print("Digite um número para continuar: ");
        define = scan.nextInt();
        
        switch (define){
            case 1:
                System.out.print("Digite a quantidade de tentativas: ");
                int tentativas = scan.nextInt();
                numeroAleatorio.setTentativas(tentativas);
        
                System.out.print("Digite o limite máximo do número: ");
                int limite = scan.nextInt();
                numeroAleatorio.setLimite(limite);
        
                while (numeroAleatorio.getTentativas() > 0){
                    System.out.print("Digite a reposta: ");
                    resposta = scan.nextInt();
                    numeroAleatorio.validarResposta(resposta);
                }
                    break;
            case 2:
                System.out.println("Encerrando...");
                status = false;
                break;
                
            default:
                System.out.println("Opção inválida!!");
                
        }
        }
        scan.close();
    }
    
}
