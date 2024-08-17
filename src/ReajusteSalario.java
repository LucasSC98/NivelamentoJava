import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        double salario = sc.nextDouble();
        double salarioTotal;
        double reajuste;

        if (salario <= 1412) {
            reajuste = salario * 0.12;
            salarioTotal = salario + reajuste;
        }else  if (salario <= 3000 ){
            reajuste = salario * 0.09;
            salarioTotal = salario + reajuste;
        }else if (salario <= 5000 ){
            reajuste = salario * 0.05;
            salarioTotal = salario + reajuste;
        }else{
            reajuste = salario * 0.0;
            salarioTotal = salario + reajuste;
        }

        System.out.println("O salario é: R$" + salario+" Com o reajuste no salario ficou: R$"+salarioTotal+" O reajuste foi de: " + reajuste+ " reais");
    }
}
