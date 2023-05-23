package patterns.design.patterns.structural.facade;

public class BitrateReader {

    public static String read(String filename, String sourceCodec){
        return "Se leyeron la tasa e bits del archivo: " + filename;
    }

    public static String convert(String buffer, OggCompressionCodec destinationCodec){
        return "Se convirtio el archivo de video al formato de destino ";
    }
}
