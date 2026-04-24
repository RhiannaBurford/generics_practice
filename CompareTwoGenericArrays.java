public class CompareTwoGenericArrays<T> // Only need the T once
 {
    /* Write a Java program to create a generic method that takes two 
    arrays of the same type and checks if they have the same elements 
    in the same order. */

    private T[] array1;
    private T[] array2;

    public CompareTwoGenericArrays(T[] array1, T[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean compare(){
        if (array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++){
            if (!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }

}
// Duplicate parameters (if there are two x T, then just do <T>)