package pratica.calculaMediaNumeros;

public class calculaMediaNumeros {
    public static void main(String[] args) {
        int[] numeros = {10,30,40,1000, 345, 1259};
        int soma = 0;
        float media = 0;

        for(int numero : numeros) {
            soma += numero;
            media = (float) soma / numeros.length;
        }
        System.out.println("A soma dos numeros do array é: " + soma);
        System.out.println("A média dos numeros do array é: " + media);
    }
}
