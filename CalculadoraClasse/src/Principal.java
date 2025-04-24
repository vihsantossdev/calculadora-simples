import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        try {
            double resultado = calculadora.calcular(num1, num2, operador);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}