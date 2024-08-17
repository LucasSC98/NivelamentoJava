import java.util.Scanner;

public class ReajusteSalarioDinamico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o reajuste: ");
        double reajuste = sc.nextDouble();
        double salarioTotal = salario + (salario / 100 * reajuste);


        System.out.println("Salario antes do reajuste: " + salario);
        System.out.println("Percentual do Reajuste: " + reajuste + "%");
        System.out.println("Salario total com reajuste: " + salarioTotal);

    }
}