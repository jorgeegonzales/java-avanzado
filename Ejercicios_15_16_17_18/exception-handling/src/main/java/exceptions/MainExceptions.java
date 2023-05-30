package exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * exception handling
 */
public class MainExceptions {
    public static void main(String[] args) throws InputAndOutputOfFilesException {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        try{
            arithmeticOperations.division(5,0);
        } catch (ArithmeticOperationsException e){
            System.out.println(e.getMessage());
        }

        OperationsOnArrays operations = new OperationsOnArrays();
        try{
            operations.ArrayIndexOutOfBounds(8,5);
        } catch (OperationsOnArraysException e){
            System.out.println(e.getMessage());
        }

        InputAndOutputOfFiles inputAndOutputOfFiles = new InputAndOutputOfFiles();


        try {
            InputStream fileIn = new FileInputStream("Ejercicios_15_16_17_18/exception-handling/src/files/fileIn.txt");
            PrintStream fileOut = new PrintStream("Ejercicios_15_16_17_18/exception-handling/src/files/fileOut.txt");
            inputAndOutputOfFiles.copyFile(fileIn,fileOut);
        } catch (IOException e){
            System.out.println("El fichero no existe");
        }






    }
}