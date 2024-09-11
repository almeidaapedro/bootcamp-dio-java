public class MyClass{
    public static void main(String[] args) {
        String primeiroNome = "Pedro";
        String segundoNome = "Almeida";
        int idade = 20;


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, idade);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome, int idade) {
        return "Seu nome é: " + primeiroNome.concat(" ").concat(segundoNome) + ", você tem " + idade + " anos";
    }
}