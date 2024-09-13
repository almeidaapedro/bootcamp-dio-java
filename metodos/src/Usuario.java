public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}