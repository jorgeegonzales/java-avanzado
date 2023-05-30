package exceptions;

import java.io.*;

public class InputAndOutputOfFiles {


    public void copyFile(InputStream fileIn, PrintStream fileOut) throws IOException{

        if(fileIn.read()==-1) throw new IOException("No existe el archivo en el directorio!");
           else if(fileIn.read() != -1){
                int dato = fileIn.read();
                while (dato != -1) {
                    System.out.print((char)dato);
                    fileOut.write(dato);
                    dato = fileIn.read();
                }
            }
    }
}
