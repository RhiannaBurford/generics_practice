public class JustGenericMethod {

    public static <E> E[]  swapFirstAndLast(E[] genericArray){
        if (genericArray.length < 2){
            return null;
        }
        E temp = genericArray[0];
        genericArray[0] = genericArray[genericArray.length - 1];
        genericArray[genericArray.length - 1] = temp;
        return genericArray;
    }
}
