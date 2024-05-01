package pratica.calculadoraImc;

public class CalculadoraImc {
   private final float PESO;
    private final float ALTURA;

    public CalculadoraImc(float peso, float altura) {
        this.PESO = peso;
        this.ALTURA = altura;
    }

    private void imprimeInformacoes() {
        System.out.println("Peso informado " + this.PESO);
        System.out.println("Altura informada " + this.ALTURA);
    }

    private float calculaImc(){
       return this.PESO /( this.ALTURA * this.ALTURA);

    }

    public void verificaObesidade() {
        float imc = calculaImc();
        imprimeInformacoes();
        System.out.println("Seu imc é: " + String.format("%.2f", imc));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso...Vai comer !!!");
        } else if (imc < 24.9) {
            System.out.println("Peso normal...Continua assim..");
        } else if (imc < 29.9) {
            System.out.println("Sobre Peso...Ihhhh cuidado");
        } else {
            System.out.println("Obesidade...Vai para academia agora !!!!");
        }
    }
}
