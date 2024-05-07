package pratica.ehBisexto;

public class EhAnoBisexto {
    static int ano = 2100;

    public static void main(String[] args) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println(ano + " é um ano bisexto");
        } else {
            System.out.println(ano + " não é um ano bisexto");
        }
    }
}
