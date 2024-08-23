import java.util.Scanner;

public class ComparacaoMaiorEMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero ");
        Integer num1 = sc.nextInt();
        System.out.println("Digite o segundo numero ");
        Integer num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("o primeiro numero é maior " + num1);
        }else if (num1 < num2){
            System.out.println("o segundo numero é maior " + num2);
        }else{
            System.out.println("Iguais");
        }
    }
}
