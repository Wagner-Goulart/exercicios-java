# Exercicios Java

## Ferramental utilizada 🛠️
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Repositório dedicado para guarda de exercicios escritos em java

## Exercicios 💪

<details>
<summary>Calculadora abastecimento</summary>

```JAVA
public class AlcoolOuGasolina {
    private final float PRECO_GASOLINA;
    private final float PRECO_ALCOOL;

    public AlcoolOuGasolina (float precoGasolina, float precoAlcool) {
        this.PRECO_ALCOOL = precoAlcool;
        this.PRECO_GASOLINA = precoGasolina;
    }

    private float calculaDiferenca() {
         return this.PRECO_ALCOOL / this.PRECO_GASOLINA;
    }

    public void gasolinaOuAlcool() {
        float diferenca = calculaDiferenca();

        if( diferenca > 0.7) {
            System.out.println("Gasolina vale mais a pena");
        } else {
            System.out.println("Melhor abastecer com alcool");
        }
    }

}

```
</details>
<details>
<summary>Caixa Eletronico</summary>

```JAVA
public class CaixaEletronico {
    private float SALDO = 0;

    public float imprimiSaldo() {
        return this.SALDO;
    }

    public float adcionaSaldo(float valor) {
        return this.SALDO += valor;
    }

    public float retiraSaldo(float valor){
        if(this.SALDO <= 0) {
            System.out.println("Conta Negativa não é permitido saque");
        }
        return this.SALDO -= valor;
    }

}
```
</details>
<details>
<summary>Caixa Eletronico</summary>

```JAVA
public class CaixaEletronico {
    private float SALDO = 0;

    public float imprimiSaldo() {
        return this.SALDO;
    }

    public float adcionaSaldo(float valor) {
        return this.SALDO += valor;
    }

    public float retiraSaldo(float valor){
        if(this.SALDO <= 0) {
            System.out.println("Conta Negativa não é permitido saque");
        }
        return this.SALDO -= valor;
    }

}
```
</details>

<details>
<summary>Calculadora IMC</summary>

```JAVA
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

```
</details>
<details>
<summary>Calculadora Fatorial</summary>

```JAVA
package pratica.calculaFatorial;

public class CalculaFatorial {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = 1;

        for(int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }
}
```
</details>

<details>
<summary>Calculadora Media Numeros</summary>

```JAVA
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

```
</details>

<details>
<summary>Contador Letras</summary>

```JAVA
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


```
</details>

<details>
<summary>Conversor temperatura</summary>

```JAVA
package pratica.conversorCelsiuFahrenheit;
import java.util.Scanner;

public class ConversosCelsiusToFahrenheit {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Converter a temperatura para ? 1-CELSIUS 2-FAHRENHEIT 3-SAIR");
            int escolha = scanner.nextInt();
            float temperatura;

            if(escolha == 3) {
                System.out.println("Finalizando programa");
                return;
            }

            if(escolha == 1 || escolha ==2) {
                System.out.println("Informa a temperatura: ");
                temperatura = scanner.nextFloat();

                switch (escolha) {
                    case 1:
                        converteFahrenheitParaCelsius(temperatura);
                        break;
                    case 2:
                        converteCelsiuParaFahrenheit(temperatura);
                        break;
                    default:
                        System.out.println("Escolha um opção válida");
                }
            }


        }

    }

    static void converteCelsiuParaFahrenheit(float temperatura) {
        float fahrenheit = (temperatura * 1.8F) + 32;
        System.out.println("Temperatura em Fahranheit é " + fahrenheit);
    }

    static void converteFahrenheitParaCelsius(float temperatura) {
        float celsius= (temperatura - 32) / 1.8F;

        System.out.println("Temperatura em Celsius é " + celsius);
    }
}

```
</details>

<details>
<summary>Tabuada</summary>

```JAVA
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

```
</details>

<details>
<summary>Verifica se o ano é Bisexto</summary>

```JAVA

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
```
</details>



