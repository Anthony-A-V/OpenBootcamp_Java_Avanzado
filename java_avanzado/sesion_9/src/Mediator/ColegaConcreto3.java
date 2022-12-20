package Mediator;

public class ColegaConcreto3 extends Colega {

        @Override
        void recibe() {
            System.out.println("he recibido un mensaje ,soy 3");
        }

        @Override
        void envia() {
            System.out.println("soy 3, envio un mensaje");
            mediator.reenvia(this);
        }

}
