import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();
        int op = 0;
        double valorPraConverter;
        while (op!=9) {
            menu.mostraMenu();
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor1 = new ConversorDeMoeda("USD", "ARS", valorPraConverter);
                    double valorConvertido1 = conversor1.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f USD convertido para Peso argentino é %.2f", valorPraConverter, valorConvertido1);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor2 = new ConversorDeMoeda("ARS", "USD", valorPraConverter);
                    double valorConvertido2 = conversor2.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f ARS convertido para Dólar é %.2f", valorPraConverter, valorConvertido2);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor3 = new ConversorDeMoeda("USD", "BRL", valorPraConverter);
                    double valorConvertido3 = conversor3.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f USD convertido para Real brasileiro é %.2f", valorPraConverter, valorConvertido3);
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor4 = new ConversorDeMoeda("BRL", "USD", valorPraConverter);
                    double valorConvertido4 = conversor4.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f BRL convertido para Dólar é %.2f", valorPraConverter, valorConvertido4);
                    break;
                case 5:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor5 = new ConversorDeMoeda("USD", "COP", valorPraConverter);
                    double valorConvertido5 = conversor5.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f USD convertido para Peso colombiano é %.2f", valorPraConverter, valorConvertido5);
                    break;
                case 6:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor6 = new ConversorDeMoeda("COP", "USD", valorPraConverter);
                    double valorConvertido6 = conversor6.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f COP convertido para Dólar é %.2f", valorPraConverter, valorConvertido6);
                    break;
                case 7:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor7 = new ConversorDeMoeda("EUR", "BRL", valorPraConverter);
                    double valorConvertido7 = conversor7.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f EUR convertido para Real brasileiro é %.2f", valorPraConverter, valorConvertido7);
                    break;
                case 8:
                    System.out.println("Digite o valor que deseja converter: ");
                    valorPraConverter = teclado.nextDouble();
                    ConversorDeMoeda conversor8 = new ConversorDeMoeda("BRL", "EUR", valorPraConverter);
                    double valorConvertido8 = conversor8.converter();
                    System.out.println("Valor convertido com sucesso!");
                    System.out.printf("%.2f BRL convertido para Euro é %.2f", valorPraConverter, valorConvertido8);
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\nDigite uma opção válida!");
            }
        }
    }
}
