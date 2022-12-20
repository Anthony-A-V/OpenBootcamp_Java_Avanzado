package Mediator;

public class ColegaConcreto1 extends Colega {
    @Override
    void recibe() {
        System.out.println("he recibido un mensaje ,soy 1");
    }

    @Override
    void envia() {
        System.out.println("soy 1, envio un mensaje");
        mediator.reenvia(this);
    }
}
