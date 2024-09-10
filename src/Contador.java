import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número:");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();

            contar(numero1, numero2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            int count = 1;
            for (int i = numero2; i < numero1; i++) {

                System.out.println("imprimindo o " + count + "º número: " + i);
                count++;
            }
        } else {
            throw new ParametrosInvalidosException("O primeiro número deve ser maior que o segundo número.");
        }
    }
}
