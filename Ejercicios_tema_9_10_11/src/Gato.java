public class Gato implements Animal{

    @Override
    public void haceSonido() {
        System.out.println(this.getClass().getName()  + " maulla");
    }
}
