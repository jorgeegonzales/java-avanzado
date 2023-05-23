package patterns.design.patterns.behaviors;

public interface Iterator {
    public Profile getNext();
    public boolean hasMore();
    public void reset();
}
