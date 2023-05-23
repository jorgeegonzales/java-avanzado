package patterns.design.patterns.structural.facade;

/**
 * Facade es un patrón de diseño estructural que proporciona una interfaz que permite acceder a una biblioteca, un framework
 * o cualquier otro grupo complejo de clases.
 */
public class AppFacade {

    public static void main(String[] args) {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        videoConverterFacade.convert("graduationVideo","Ogg");
    }
}
