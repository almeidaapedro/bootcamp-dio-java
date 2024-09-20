import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scanner.next();

        switch (letra){
            case "P":
                System.out.println("PEQUENO");
                break;

            case "M":
                System.out.println("MEDIO");
                break;

            case "G":
                System.out.println("GRANDE");
                break;

            default:
                System.out.println("A letra que você digitou não está em nosso servidor");
                break;
        }
    }
}
