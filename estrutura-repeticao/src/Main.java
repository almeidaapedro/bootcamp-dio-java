import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O passageiro deseja parar no próximo ponto? sim/não ");
        String parada = scanner.next();

        if(parada.equals("sim")){
            System.out.println("A parada foi solicitada, o ônibus vai parar no próximo ponto");
        }else{
            System.out.println("A parada não foi solicitada, o ônibus vai continuar o trajeto.");
        }

        scanner.close();
    }
}