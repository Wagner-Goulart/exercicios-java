package pratica.ehPalindromo;

public class ehPalindromo {
   static String palavra = "Arara";

    public static void main(String[] args) {
        String palavraInversa = new StringBuilder(palavra).reverse().toString().toLowerCase();

        if(palavra.toLowerCase().equals(palavraInversa)) {
            System.out.println("A palavra " + palavra +" é um palindromo");
        } else {
            System.out.println("A palavra " + palavra +" não é um palindromo");
        }
    }
}
