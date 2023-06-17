package argsExample;

public class Saludo {

    public static void main(String[] args){

        if (args.length > 1) { //si hay más de 1 parámetro
            System.out.println("Hay demasiados parámetros. Debe escribir: saludo nombrePersona");
        } else if (args.length == 0) { //si no hay parámetros
            System.out.println("Falta el nombre de la persona");
        } else {
            System.out.println("Buenos Días " + args[0]);
        }




    }
}