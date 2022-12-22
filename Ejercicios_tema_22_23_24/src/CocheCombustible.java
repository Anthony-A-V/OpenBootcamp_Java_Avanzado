public class CocheCombustible extends Coche{
    private String tipoCombustible;

    @Override
    public void arrancar() {
        System.out.println("Un coche de combustible arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Un coche de combustible frenando...");
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
