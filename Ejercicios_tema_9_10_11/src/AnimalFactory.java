public class AnimalFactory {

    Animal animal;

    public Animal createAnimal(String nombre) throws Exception {
        switch (nombre) {
            case "Gato" -> animal = new Gato();
            case "Perro" -> animal = new Perro();
            case "Vaca" -> animal = new Vaca();
        }
        return animal;
    }

    public void haceSonido() {
        animal.haceSonido();
    }
}
