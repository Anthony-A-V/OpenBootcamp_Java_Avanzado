package Observer;

public class Radio implements Receptor{

    @Override
    public void recibe() {
        System.out.println("recibido Radio");
    }
}
