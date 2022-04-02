import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        /*Entrar com o tempo em min*/
        System.out.println("Quantos minutos foram utilizados:");

        /*Receber os minutos na variavel criada*/
        int minutes = sc.nextInt();
        double billValue = 50;
        if (minutes > 100) {
            billValue = billValue + (minutes - 100)*2;
        }

        /*Mostrar o valor final da conta*/
        System.out.printf("Você usou %d minutos e o valor da conta é de R$ %.2f. %n Obrigado!", minutes, billValue);
       sc.close();
    }
}
