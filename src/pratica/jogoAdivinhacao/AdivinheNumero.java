package pratica.jogoAdivinhacao;

import java.util.Scanner;

public class AdivinheNumero {
    static int palpite;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            double doublenNumeroEscondido = Math.random() * 10;
            int numeroEscondido = (int)doublenNumeroEscondido;

            System.out.println("Digite um numero");
            palpite = scanner.nextInt();

            if(palpite == numeroEscondido) {
                System.out.println("Parabéns, você acertou. O numero escondido era " + numeroEscondido);
            } else {
                System.out.println("Que pena, você errou. O numero escondido era " + numeroEscondido);
            }

            System.out.println("Continuar a jogar ? 1 - SIM 2- NÃO ");
            int continuar = scanner.nextInt();

            if(continuar == 2){
                System.out.println("==== Finalizando ====");
                return;
            }
        }
    }
}
