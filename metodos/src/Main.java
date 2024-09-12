public class Main {
    public static void main(String[] args) {
        int numero1 = 35;
        int numero2 = 12;

        int somar = somar(numero1, numero2);
        System.out.println("A soma dos dois números são: " + somar);

        int subtrair = subtrair(numero1, numero2);
        System.out.println("A subtração dos dois números são: " + subtrair);

        int multiplicar = multiplicar(numero1, numero2);
        System.out.println("A multiplicação dos dois números são: " + multiplicar);

        int dividir = dividir(numero1, numero2);
        System.out.println("A divisão dos dois números é: " + dividir);

        int restar = restar(numero1, numero2);
        System.out.println("O resto dos dois números é: " + restar);

        String parImpar = parImpar(numero1, numero2);
        System.out.println("Esses números são: " + parImpar);
    }
    public static int somar(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int subtrair(int numero1, int numero2){
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2){
        return numero1 / numero2;
    }

    public static int restar(int numero1, int numero2){
        return numero1 % numero2;
    }

    public static String parImpar(int numero1, int numero2) {
        if (numero1 / numero2 == 0){
            return "Par";
        }else{
            return "Impar";
        }
    }

}