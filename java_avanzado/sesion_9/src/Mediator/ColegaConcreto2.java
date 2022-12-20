package Mediator;

public class ColegaConcreto2 extends Colega {

        @Override
        void recibe() {
            System.out.println("he recibido un mensaje ,soy 2");
        }

        @Override
        void envia() {
            System.out.println("soy 2, envio un mensaje");
            mediator.reenvia(this);
        }

}
