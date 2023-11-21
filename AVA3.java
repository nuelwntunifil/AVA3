import java.util.Scanner;

public class ConversorDeUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Encerrando o Conversor de Unidades. Até logo!");
                break;
            }

            switch (escolha) {
                case 1:
                    converterComprimento();
                    break;
                case 2:
                    converterPeso();
                    break;
                case 3:
                    converterTemperatura();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Conversor de Unidades - Escolha uma opção:");
        System.out.println("1. Comprimento");
        System.out.println("2. Peso");
        System.out.println("3. Temperatura");
        System.out.println("0. Sair");
    }

    private static void converterComprimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();

        double polegadas = metros * 39.37;
        double centimetros = metros * 100;
        double quilometros = metros / 1000;

        System.out.println("Resultados:");
        System.out.println(metros + " metros é igual a " + polegadas + " polegadas.");
        System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");
        System.out.println(metros + " metros é igual a " + quilometros + " quilômetros.");
    }

    private static void converterPeso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em quilogramas: ");
        double quilogramas = scanner.nextDouble();

        double libras = quilogramas * 2.20462;
        double gramas = quilogramas * 1000;

        System.out.println("Resultados:");
        System.out.println(quilogramas + " quilogramas é igual a " + libras + " libras.");
        System.out.println(quilogramas + " quilogramas é igual a " + gramas + " gramas.");
    }

    private static void converterTemperatura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Resultados:");
        System.out.println(celsius + " Celsius é igual a " + fahrenheit + " Fahrenheit.");
        System.out.println(celsius + " Celsius é igual a " + kelvin + " Kelvin.");
    }
}
