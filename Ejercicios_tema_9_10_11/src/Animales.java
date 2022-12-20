import java.util.ArrayList;
import java.util.List;

public class Animales implements AnimalIterator {
    private List<Animal> animales = new ArrayList<>();
    private int pos = 0;

    public void add(Animal animal) {
        animales.add(animal);
    }


    @Override
    public Animal next() {
        Animal animal = this.animales.get(pos);
        pos++;
        return animal;
    }

    @Override
    public void reset() {
        System.out.println("Reiniciando Iterador...");
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < animales.size();
    }
}
