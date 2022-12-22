public class CocheElectrico extends Coche{
    private String tipoEnergia;

    @Override
    public void arrancar() {
        System.out.println("Un coche eléctrico arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Un coche eléctrico frenando...");
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }
}
