package Observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();
        Radio radio = new Radio();
        Satelite satelite = new Satelite();
        emisora.meteReceptor(radio);
        emisora.meteReceptor(satelite);

        emisora.emite();
    }
}
