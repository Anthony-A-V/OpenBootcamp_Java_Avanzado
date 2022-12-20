public class Singleton {
    private static Singleton instancia;

    public static Singleton getInstance(){
        if (instancia == null){
            instancia = new Singleton();
            System.out.println("Iniciando aplicación");
        } else {
            System.out.println("Aplicación ya corriendo");
        }
        return instancia;
    }
}