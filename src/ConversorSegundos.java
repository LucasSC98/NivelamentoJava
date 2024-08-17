import java.util.Scanner;

public class ConversorSegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as segundos: ");
        int segundos = sc.nextInt();
        int horas = segundos / 60 /60;
        segundos= segundos - (horas * 60 * 60);
        int minutos = segundos /60;
        segundos= segundos - (minutos * 60);

        System.out.println(horas + " horas " + minutos + " minutos e " + segundos + " segundos ");
    }
}
