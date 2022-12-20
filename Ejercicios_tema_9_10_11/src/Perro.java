public class Perro implements Animal {

    @Override
    public void haceSonido() {
        System.out.println(this.getClass().getName()  + " ladra");
    }
}
