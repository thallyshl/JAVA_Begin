import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro:");
        int valor1 = sc.nextInt();
        System.out.println("Digite Outro valor inteiro:");
        int valor2 = sc.nextInt();
        int result = valor1 + valor2;
        System.out.printf("A soma entre os dois valores digitados é igual a %n" + result);

        sc.close();
    }
}
