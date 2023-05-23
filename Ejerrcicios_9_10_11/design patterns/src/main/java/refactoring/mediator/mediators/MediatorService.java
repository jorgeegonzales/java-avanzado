package refactoring.mediator.mediators;

/**
 * fix method signature
 */
public abstract class MediatorService {
    public abstract void initializeEvents(String event);

    public abstract String findClient(String name);

    public abstract void initializeClient();

    public abstract void create(String event, String name);

    public abstract void update(String event, String name);

    public abstract void delete(String event, String name);
}
