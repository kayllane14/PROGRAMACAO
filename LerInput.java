import java.util.Scanner;

public class LerInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int lerEscolha() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Valor inválido
        }
    }
}
