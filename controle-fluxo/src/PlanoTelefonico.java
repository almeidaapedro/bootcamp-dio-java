import java.util.Scanner;

public class PlanoTelefonico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o plano que você deseja? ");
        String plano = scanner.next();

        switch (plano){
            case "BASIC":
                System.out.println("O seu plano é o BASIC, você só terá 100 minutos de ligação.");
                break;

            case "MIDIA":
                System.out.println("O seu plano é o MIDIA, você terá 100 minutos de ligação, Whatsapp e Instagram gratuito.");
                break;

            case "TURBO":
                System.out.println("O seu plano é o TURBO, além de você ter 100 minutos de ligação e Whatsapp e Instagram gratuito, terá a disponibilidade de 5Gb para Youtube. ");
                break;

            default:
                System.out.println("Ocorreu um problema, não temos esse plano na nossa operadora, muito obrigado.");
                break;
        }
    }
}
