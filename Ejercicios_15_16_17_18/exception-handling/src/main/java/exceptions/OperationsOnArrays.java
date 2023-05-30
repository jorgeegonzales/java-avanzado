package exceptions;

public class OperationsOnArrays {
    public int[] createArray(int length){
        int[] numbers = new int[length];
        for(int i = 0; i < numbers.length;i++){
            numbers[i]= i+1;
        }
        return numbers;
    }

    public void ArrayIndexOutOfBounds(int index,int length) throws OperationsOnArraysException {
        int [] array = createArray(length);
        if(index >= length) throw new OperationsOnArraysException("Indice fuera de los limites del array");
        int elementInIndex = array[index];
    }
}
