package edu.pedro.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("Reprovado, sua média final é: " + mediaFinal);
        else if (mediaFinal == 6)
            System.out.println("Sua média final foi: " + mediaFinal + ", por isso você terá que fazer uma prova minerva");
        else
            System.out.println("Parabéns, você foi aprovado, sua média foi: " + mediaFinal);

    }
}
