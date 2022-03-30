import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos fazer um jogo. Digite quatro números A, B, C D:");
        double A, B, C, D;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        D = sc.nextDouble();
        double produtoAB = A*B;
        double produtoCD = C*D;
        double result = produtoAB - produtoCD;
        System.out.printf("O produto entre os dois primeiro valores digitados é: %.2f %n", produtoAB);
        System.out.printf("O produto entre os dois últimos valores digitados é: %.2f %n", produtoCD);
        System.out.printf("A diferença entre os produtos calculados é: %.2f", result);
        sc.close();
    }
}
