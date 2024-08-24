import java.util.Scanner;

public class ComparacaoMaiorNumeroComArray {
    public static void visualizarMaiores(Integer maior, Integer maiorPosicao) {
        System.out.println("\n O maior valor foi " + maior +" Na posição = "+maiorPosicao);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final Integer quantidade = 5;
        Integer numeros [] = new Integer[quantidade];
        Integer maior = 0, maiorPosicao =0;


        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe o "+(i+1) + " valor do array: ");
            numeros[i] = sc.nextInt();

            if(numeros[i] == 0){
                maior = i;
                maiorPosicao = i+1;
            }else if(numeros[i] > maior){
                maior = numeros[i];
                maiorPosicao = i+1;
            }
        }
        System.out.println("\nOs valores recebidos foram");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(i+1+" Posição = "+numeros[i]);
        }
        visualizarMaiores(maior, maiorPosicao);
    }
}
