public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        int numero2 = 5;

        int somar = somar(numero, numero2);
        System.out.println(somar);

        int subtrair = subtrair(numero, numero2);
        System.out.println(subtrair);

        int multiplicar = multiplicar(numero, numero2);
        System.out.println(multiplicar);

        int dividir = dividir(numero, numero2);
        System.out.println(dividir);

    }
    public static int somar(int numero, int numero2){
        return numero + numero2;
    }
    public static int subtrair(int numero, int numero2){
        return numero - numero2;
    }
    public static int multiplicar(int numero, int numero2){
        return numero * numero2;
    }
    public static int dividir(int numero, int numero2){
        return numero / numero2;
    }
}