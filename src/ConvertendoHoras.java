import java.util.Scanner;

public class ConvertendoHoras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas");
        int horas = sc.nextInt();
        System.out.println("Digite as minutos");
        int minutos = sc.nextInt();
        System.out.println("Digite as segundos");
        int segundos = sc.nextInt();


        int resultado = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.println(resultado);

    }
}
