public class Main {

    public static void main(String[] args) throws Exception {
        Animales animales = new Animales();

        AnimalFactory animalFactory = new AnimalFactory();

        animales.add(animalFactory.createAnimal("Gato"));
        animales.add(animalFactory.createAnimal("Perro"));
        animales.add(animalFactory.createAnimal("Vaca"));

        while (animales.hasNext()) {
            Animal animal = animales.next();
            animal.haceSonido();
        }
        animales.reset();
        while (animales.hasNext()) {
            Animal animal = animales.next();
            animal.haceSonido();
        }
    }

}