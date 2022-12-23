public class CocheHibrido extends Coche {
    public CocheHibrido() {
    }

    public CocheHibrido(String placa, String marca, String color, String modelo) {
        super(placa, marca, color, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("Un coche híbrido arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Un coche híbrido frenando...");
    }
}
