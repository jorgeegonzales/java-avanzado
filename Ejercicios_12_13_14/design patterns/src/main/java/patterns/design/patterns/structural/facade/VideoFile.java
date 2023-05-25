package patterns.design.patterns.structural.facade;

public class VideoFile {

    private String fileName;

    public VideoFile() {
    }

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    public void findByFileName(String fileName){
        System.out.println("Se creo el archivo: " + fileName);
    }
}
