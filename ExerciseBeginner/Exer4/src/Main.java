import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário:");
        String nameEmployee = sc.nextLine();
        System.out.printf("Digite a quantidade de horas trabalhadas no mês do funcionário %s %n", nameEmployee);
        double hourWorked = sc.nextDouble();
        System.out.println("Digite o valor por hora trabalhada:");
        double valuePerHour = sc.nextDouble();
        double resultSalary = hourWorked*valuePerHour;
        System.out.printf("O salário de %s é igual a: %n R$ %.2f", nameEmployee,  resultSalary);

        sc.close();

    }
}
