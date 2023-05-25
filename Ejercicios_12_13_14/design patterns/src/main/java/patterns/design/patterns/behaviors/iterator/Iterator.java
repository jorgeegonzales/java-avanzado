package patterns.design.patterns.behaviors.iterator;

public interface Iterator {
    public Profile getNext();
    public boolean hasMore();
    public void reset();
}
