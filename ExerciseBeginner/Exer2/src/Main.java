import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o valor do raio, em centímetros, para calcular a área do círculo:");
        double raio = sc.nextDouble();
        double pi = Math.PI;
        double areaCircle = pi*raio*raio;
        System.out.printf("A área do círculo com raio %.2f é: %n %.4f centímetros quadrados", raio, areaCircle);

        sc.close();
    }
}
