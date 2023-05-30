package exceptions;

public class ArithmeticOperations {

    public void division(int dividend, int divider) throws ArithmeticOperationsException {
        int result = 0;
        if(divider == 0) throw new ArithmeticOperationsException("No se puede dividir entre cero");
        result = dividend/divider;
    }
}
