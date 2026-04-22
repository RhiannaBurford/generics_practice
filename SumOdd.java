public class SumOdd<E> {
    /* Sum Even and Odd in List */
    /* Write a Java program to create a generic method that takes a list 
    of numbers and returns the sum of all the even and odd numbers. */

    public static <E extends Number> double sumEven(E[] array){
        double evenSum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].doubleValue() % 2 == 0){
                evenSum = evenSum + array[i].doubleValue();
            }
        }
        return evenSum;
    }

     public static <E extends Number> double sumOdd(E[] array){
        double oddSum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].doubleValue() % 2 == 1){
                oddSum = oddSum + array[i].doubleValue();
            }
        }
        return oddSum;
    }
}
