package patterns.design.patterns.structural.facade;

public class File {
    private String estate;

    public File() {
    }

    public File(String estate) {
       // System.out.println("Se creo el arhivo final luego de realizar la conversion exitosamente");
        this.estate = estate;

    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }
}
