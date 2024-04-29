public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal( int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal = canal + 3;
    System.out.println("Aumentar canal para: " + canal);
    }

    public void diminuirCanal() {
        canal = canal - 2;
    System.out.println("Diminuir canal para: " + canal);
    }

    public void aumentarVolume() {
        volume++;
    System.out.println("Aumentar o volume para : " + volume);
    }
    public void diminuirVolume() {
        volume--;
    System.out.println("Diminuir o volume para : " + volume);
    }

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}