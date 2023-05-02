package patterns.design.patterns.structural.facade;

public class CodecFactory {

    public String extract(VideoFile file){
        return "Se codificaron los datos del archivo: " + file;
    }
}
