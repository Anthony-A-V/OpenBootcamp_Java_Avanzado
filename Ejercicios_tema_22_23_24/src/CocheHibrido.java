public class CocheHibrido extends Coche{
    private String tipoUso;

    @Override
    public void arrancar() {
        System.out.println("Un coche híbrido arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Un coche híbrido frenando...");
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }
}
