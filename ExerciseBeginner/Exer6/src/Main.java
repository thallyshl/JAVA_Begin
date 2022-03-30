import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual número você quer testar para inteiro negativo?");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.printf("O número %d é positivo", number);
        } else {
            System.out.printf("O número %d é negativo", number);
        }

        sc.close();
    }
}
