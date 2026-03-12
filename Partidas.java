public class Partidas {
    private int id;
    private int tentativasEscolhidas;
    private int limiteMaximo;
    private String resultado;
    private int tentativasUsadas;

    public Partidas (int id, int tentativasEscolhidas,int limiteMaximo, String resultado, int tentativasUsadas){
        this.id = id;
        this.tentativasEscolhidas = tentativasEscolhidas;
        this.limiteMaximo = limiteMaximo;
        this.resultado = resultado;
        this.tentativasUsadas = tentativasUsadas;
    }

    @Override
    public String toString() {
        return String.format("Partida %d | Limite: %d | Tentativas: %d/%d | Resultado: %s",
                id, limiteMaximo, tentativasUsadas, tentativasEscolhidas, resultado);
    }
}