public class Vaca implements Animal {

    @Override
    public void haceSonido() {
        System.out.println(this.getClass().getName()  + " muge");
    }
}
