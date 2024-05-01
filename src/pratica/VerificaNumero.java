package pratica;

public class VerificaNumero {
    public void verificaNumero(int numero){
        if(numero > 0) {
            System.out.println("Numero é positivo");
        } else if (numero < 0) {
            System.out.println("Numero é negativo");
        } else {
            System.out.println("Numero é zero");
        }
    }
}
