import java.util.Scanner;
import java.util.Locale;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, " + nome + " " + sobrenome + " você tem " + idade + " anos e " + altura + " m de altura. Seja bem vindo!");
    }
}