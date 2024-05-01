package pratica.tabuada;

public class Tabuada {
    private final int NUMERO;

    public Tabuada(int numero) {
        this.NUMERO = numero;
    }

    public void calculaTabuada() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(NUMERO + " x " + i + " = "+ (NUMERO * i));
        }
    }
}
