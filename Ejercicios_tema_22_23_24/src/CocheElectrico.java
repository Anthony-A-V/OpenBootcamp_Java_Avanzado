public class CocheElectrico extends Coche {
    public CocheElectrico() {
    }

    public CocheElectrico(String placa, String marca, String color, String modelo) {
        super(placa, marca, color, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("Un coche eléctrico arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Un coche eléctrico frenando...");
    }
}
