import java.util.Scanner;

public class NotaEscolar {
    public static void main(String[] args) {
        //Pedindo ao usuário para digitar a note
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        double resultado = (nota1 + nota2)/2;

        if (resultado < 5){
            System.out.println("Você foi reprovado, sua nota foi: " + resultado);
        }else if (resultado == 5){
            System.out.println("Você ficou de recuperação, sua nota foi: " + resultado);
        }else {
            System.out.println("Parabéns, você foi aprovado, sua nota foi: " + resultado);
        }
    }
}