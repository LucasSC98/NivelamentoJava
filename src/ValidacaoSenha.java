import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final Integer senhaCorreta = 12345, maxTentativas = 3;
        Integer senha = 0, quantidadeTentativas = 0;
        do{
        System.out.println("Digite seu senha: ");
        senha = sc.nextInt();
        if(!senha.equals(senhaCorreta)){
            System.out.println("Senha incorreta!");
            quantidadeTentativas++;
        }

        }while (!senha.equals(senhaCorreta) && quantidadeTentativas < maxTentativas);

        if(quantidadeTentativas.equals(maxTentativas)){
            System.out.println("Sua conta está bloqueada por muitas tentativas");
        }else {
            System.out.println("Senha correta!");
        }

    }
}
