import java.util.Random;
import java.util.ArrayList;

public class NumeroAleatorio {
    Random gerador = new Random();
    private int limite;
    private int numero;
    private int tentativas;
    private int contador = 0;
    private boolean ganhou = false;

    public int getContador() {
        return contador;
    }
    public boolean getGanhou() {
        return this.ganhou;

    }

    public void setLimite(int limite) {
        this.limite = limite;
        this.contador = 0;
        this.ganhou = false;
        if (limite <= 0) {
            this.numero = gerador.nextInt(100);
            System.out.println("Valor inválido!!! Limite definido para: 100!");
        } else {
            this.numero = gerador.nextInt(limite) + 1;
        }

    }

    public void setTentativas(int tentativas) {
        if (tentativas <= 0) {
            this.tentativas = 1;
            System.out.println("Número inválido!!! Quantidade de tentativas definido para: 1.");
        } else {
            this.tentativas = tentativas;
        }
    }

    public int getTentativas() {
        return tentativas;
    }

    public void validarResposta(int resposta) {

        contador++;
        if (resposta == numero) {
            this.ganhou = true;
            if (contador == 1) {
                System.out.println("Parabéns! Acertou com " + contador + " tentativa." + "\n");
            } else {
                System.out.println("Parabéns! Acertou com " + contador + " tentativas." + "\n");
            }
            tentativas = 0;
            return;
        }

        tentativas--;
        if (resposta < 0) {
            System.out.println("Valor inválido!");
        } else if (resposta < numero) {
            System.out.println("O número é maior que " + resposta + ".");
        } else {
            System.out.println("O número é menor que " + resposta + ".");
        }

        System.out.println("Tentativas restantes: " + tentativas + "." + "\n");

        if (tentativas == 0) {
            System.out.println("Você errou! O número era: " + numero + ".");
        }

    }

}