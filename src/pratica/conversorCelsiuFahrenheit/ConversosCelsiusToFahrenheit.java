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
