package pratica;

public class Variaveis {
    int numero;
    double decimal;
    char letra;
    boolean logico;
    String texto;

    public Variaveis(int numero, double decimal, char letra, boolean logico, String texto) {
        this.numero = numero;
        this.decimal = decimal;
        this.letra = letra;
        this.logico = logico;
        this.texto = texto;
    }

    public  void  imprimir() {
        System.out.println("O variavel de valor INT é " + numero);
        System.out.println("O variavel de valor FLOAT é " + decimal);
        System.out.println("O variavel de valor CHAR é " + letra);
        System.out.println("O variavel de valor BOOLEAN é " + logico);
        System.out.println("O variavel de valor STRING é " + texto);

    }
}
