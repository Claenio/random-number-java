import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        int resposta;
        int totalPartidas = 0;
        ArrayList<Partidas> historico = new ArrayList<>();
        boolean status = true;
        int define;

        while (status == true) {
            System.out.println("""
                    ------ Jogo do número secreto ------
                    ------      1 - Jogar         ------
                    ------      2 - Histórico     ------
                    ------      3 - Sair          ------
                    ------------------------------------
                    """);
            System.out.print("Digite um número para continuar: ");
            define = scan.nextInt();

            switch (define) {
                case 1:
                    totalPartidas++;
                    System.out.print("Digite a quantidade de tentativas: ");
                    int tentativasDigitadas = scan.nextInt();
                    numeroAleatorio.setTentativas(tentativasDigitadas);

                    System.out.print("Digite o limite máximo do número: ");
                    int limite = scan.nextInt();
                    numeroAleatorio.setLimite(limite);

                    while (numeroAleatorio.getTentativas() > 0) {
                        System.out.print("Digite a reposta: ");
                        resposta = scan.nextInt();
                        numeroAleatorio.validarResposta(resposta);
                    }
                    String resultadoTexto = (numeroAleatorio.getGanhou()) ? "Ganhou" : "Perdeu";
                    historico.add(new Partidas(totalPartidas, tentativasDigitadas, limite, resultadoTexto, numeroAleatorio.getContador()));
                    break;

                case 2:
                    System.out.println("\n=== HISTÓRICO DE JOGADAS ===");
                    if (historico.isEmpty()) {
                        System.out.println("Nenhuma partida registrada.");
                    } else {
                        for (Partidas p : historico) {
                            System.out.println(p);
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Encerrando... Até mais!");
                    status = false;
                    break;

                default:
                    System.out.println("Opção inválida!!");

            }
        }
        scan.close();
    }

}