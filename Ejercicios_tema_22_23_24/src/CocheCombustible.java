public class CocheCombustible extends Coche {

    public CocheCombustible() {
    }

    public CocheCombustible(String placa, String marca, String color, String modelo) {
        super(placa, marca, color, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("Un coche de combustible arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Un coche de combustible frenando...");
    }
}
