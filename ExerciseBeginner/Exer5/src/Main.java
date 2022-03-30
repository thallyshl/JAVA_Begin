import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor x:");
        double x = sc.nextDouble();
        System.out.println("Digite um valor y:");
        double y = sc.nextDouble();
        System.out.println("Digite um valos z:");
        double z = sc.nextDouble();
        double areaRet = (x*y)/2;
        double pi = Math.PI;
        double areaCircle = pi*z*z;
        double areaQuad = y*y;
        System.out.printf("A área do triângulo retângulo com altura x e base y é: %n %.2f %n", areaRet);
        System.out.printf("A área do círculo com raio igual z é: %n %.2f %n", areaCircle);
        System.out.printf("A área do quadrado com lado igual y é: %n %.2f %n", areaQuad);
        sc.close();2
    }
}
