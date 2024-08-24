import java.util.Scanner;

public class ComparacaoMaiorEMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer maiorPosicao;

        System.out.println("Digite um numero ");
        Integer num1 = sc.nextInt();
        Integer maiorValor = num1;
        maiorPosicao = 1;
        System.out.println("Digite o segundo numero ");
        Integer num2 = sc.nextInt();
        if (num2 > maiorValor) {
            maiorValor = num2;
            maiorPosicao = 2;
        }
        System.out.println("Digite o terceiro numero ");
        Integer num3 = sc.nextInt();
        if (num3 > maiorValor) {
            maiorValor = num3;
            maiorPosicao = 3;
        }
        System.out.println("Digite o quarto numero ");
        Integer num4 = sc.nextInt();
        if (num4 > maiorValor) {
            maiorValor = num4;
            maiorPosicao = 5;
        }
        System.out.println("Digite o quinto numero ");
        Integer num5 = sc.nextInt();
        if (num5 > maiorValor) {
            maiorValor = num5;
            maiorPosicao = 5;
        }

        System.out.println("O maior valor informado foi " + maiorValor+" e maior posição foi " + maiorPosicao);


    }
}
