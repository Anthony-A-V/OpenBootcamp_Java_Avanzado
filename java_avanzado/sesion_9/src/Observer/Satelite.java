package Observer;

public class Satelite implements Receptor{
    @Override
    public void recibe() {
        System.out.println("señal recibida en satelite");
    }
}
