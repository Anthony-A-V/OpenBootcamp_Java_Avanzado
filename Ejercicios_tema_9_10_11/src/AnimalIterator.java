public interface AnimalIterator {
    Animal next();

    void reset();

    boolean hasNext();
}