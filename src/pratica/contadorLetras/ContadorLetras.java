package pratica.contadorLetras;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ContadorLetras {
     static String[] vogais = {"a", "e", "i", "o", "u"};

    public static void main(String[] args) {
        estatisticasGerais("Carro");
    }

     static int contarLetras ( String palavra){
        int totalLetras = palavra.length();

        return totalLetras;
    }

    static int contaVogais(String palavra) {
        int quantidadeVogais = 0;
       String[] arrayPalavra = palavra.split("");
       for (int i = 0; i < palavra.length();i++) {
          for(String vogal : vogais) {
              if(arrayPalavra[i].equals(vogal)) {
                  quantidadeVogais++;
              }
          }
       }

       return quantidadeVogais;
    }

    static void estatisticasGerais( String palavra) {
        int quantidadeLetas = contarLetras(palavra);
        int quantidadeVogais = contaVogais(palavra);

        System.out.println(" A palavra " + palavra + " possui " + quantidadeLetas + " letras e " + quantidadeVogais + " vogais");
    }
}
