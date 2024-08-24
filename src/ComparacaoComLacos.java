import java.util.Scanner;

public class ComparacaoComLacos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero, maiorValor =0, maiorPosicao=0;
        final Integer quantidade = 5;
        for (int x = 1; x <=quantidade; x++) {
            System.out.println("Digite o " + x + " valor: ");
            numero = sc.nextInt();
            if(x==0) {
                maiorValor = numero;
                maiorPosicao = x;
            } else if (numero > maiorValor) {
                maiorValor = numero;
                maiorPosicao = x;
            }

        }
        System.out.println("O maior valor informado foi " + maiorValor+" e maior posição foi " + maiorPosicao);

    }

}
