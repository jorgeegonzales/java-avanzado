package patterns.design.patterns.structural.decorator;

/**
 * Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos colocando estos objetos dentro de
 * objetos encapsuladores especiales que contienen estas funcionalidades.
 */
public class AppDecorator {
    public static void main(String[] args) {

        FileDataSource source = new FileDataSource("somefile.dat");
        source.writeData();
        // El archivo objetivo se ha escrito con datos sin
        // formato.

        CompressionDecorator sourceCompress = new CompressionDecorator(source);
        sourceCompress.writeData();

        EncryptionDecorator sourceEncrypt = new EncryptionDecorator(source);
        // La variable fuente ahora contiene esto:
        // Cifrado > Compresión > FileDataSource
        sourceEncrypt.writeData();
        // El archivo se ha escrito con datos comprimidos y encriptados.

    }
}
