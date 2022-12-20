public class Main {
    public static void main(String[] args) {
        //Identifica las características principales de los patrones de diseño más conocidos,
        //indica para qué valen y un caso de uso para cada uno de ellos.

        //Singleton: Permite que una clase solo haga la instanciación de un objeto
        //Factory: Permite fabricar diferentes objetos de clases hijas haciendo uso de una clase Factory que las fabrique
        //Builder: Permite armar un objeto poco a poco desde una clase Builder en el orden en el que queramos
        //Prototype: Permite clonar un objeto ya creado
        //Decorator: Envuelve objetos para agregarle las funcionalidades de otras clases
        //Adapter: Permite adaptar un objeto distinto a otro
        //Facade: Permite que el funcionamiento de una clase compleja se pueda usar en una clase Facade de forma sencilla como una fachada

        //Crea una pequeña aplicación implementando el patrón Singlenton y demuestra que, efectivamente, no crea instancias nuevas.
        Singleton aplicacion = Singleton.getInstance();
        System.out.println("Aplicación: " + aplicacion);

        Singleton aplicacion2 = Singleton.getInstance();
        System.out.println("Aplicación: " + aplicacion2);
    }
}