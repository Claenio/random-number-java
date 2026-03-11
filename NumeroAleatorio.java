import java.util.Random;

public class NumeroAleatorio{
    Random gerador = new Random();
    private int limite;
    private int numero;
    private int resposta;
    private int tentativas;
    private int contador = 0;
    
    public int mostrarNumero(){
        return numero;
    }
    
    public void setLimite(int limite){
        this.limite = limite;
        if (limite <= 0) {
            this.numero = gerador.nextInt(100);
            System.out.println("Valor inválido!!! Limite definido para: 100");
        } else {
            this.numero = gerador.nextInt(limite + 1);
        }
        
    }
    
    public void setTentativas(int tentativas){
        if (tentativas <= 0){
            this.tentativas = 1;
            System.out.println("Número inválido!!! Quantidade de tentativas definido para: 1");
        } else {
            this.tentativas = tentativas;
        }
    }
    public int getTentativas(){
        return tentativas;
    }
    public int getContador(){
        return contador;
    }
    
    public void validarResposta(int resposta){
        if (resposta < numero && resposta >= 0) {
            tentativas--;
            contador++;
            System.out.println("O número aleatório é maior que: " + resposta);
            System.out.println("Tentativas restantes: " + tentativas + "\n");
            if (tentativas == 0){
                System.out.println("Que pena! Você atingiu o limite de tentativas, o número era: " + numero);
                contador = 0;
            }
        } else if (resposta > numero) {
            tentativas--;
            contador++;
            System.out.println("O número aleatório é menor que: " + resposta);
            System.out.println("Tentativas restantes: " + tentativas + "\n");
            if (tentativas == 0){
                System.out.println("Que pena! Você atingiu o limite de tentativas, o número era: " + numero);
                contador = 0;
            }
        } else if (resposta < 0){
            tentativas--;
            contador++;
            System.out.println("Valor inválido!");
            System.out.println("Tentativas restantes: " + tentativas + "\n");
            if (tentativas == 0){
                System.out.println("Que pena! Você atingiu o limite de tentativas, o número era: " + numero);
                contador = 0;
            }
        } else {
            contador++;
            if (contador == 1) {
            System.out.println("Parabéns! Você acertou número aleatório: " + resposta + " com " + contador + " tentativa" + "\n");
            } else {
            System.out.println("Parabéns! Você acertou número aleatório: " + resposta + " com " + contador + " tentativas" + "\n");
            }
            tentativas = 0;
            contador = 0;
        }
    }
    
}
    