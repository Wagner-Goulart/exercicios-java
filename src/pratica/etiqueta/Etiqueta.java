package pratica.etiqueta;

import java.util.Properties;
import java.util.Scanner;

public class Etiqueta {
   static String nomeCompleto;
   static  String endereco;
   static int cep;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite seu seu nome Completa");
        nomeCompleto = scanner.nextLine();
        System.out.println("Digite seu endereço");
        endereco = scanner.nextLine();
        System.out.println("Digite seu cep");
        cep = scanner.nextInt();

        System.out.println(nomeCompleto + "\n" + endereco +"\n" + cep );

    }
}
