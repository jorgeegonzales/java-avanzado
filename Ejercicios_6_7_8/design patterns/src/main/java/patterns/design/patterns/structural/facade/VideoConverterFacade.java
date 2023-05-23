package patterns.design.patterns.structural.facade;

import java.util.Objects;

/**
 * Esta es la clase interfaz o Facade que permite acceder a multipless clases.
 */
public class VideoConverterFacade {

    public void convert(String filename, String format){
        VideoFile file = new VideoFile(filename);
       CodecFactory codecFactory = new CodecFactory();
        String sourceCodec = codecFactory.extract(file);

        if(Objects.equals(format, "mp4")){
            MPEG4CompressionCodec destinationCodec = new MPEG4CompressionCodec();
        } else {
            OggCompressionCodec destinationCodec = new OggCompressionCodec();
            String buffer = BitrateReader.read(filename,sourceCodec);
            String result = BitrateReader.convert(buffer,destinationCodec);
            result = (new AudioMixer()).fix(result);
            new File(result);
        }
    }

}
