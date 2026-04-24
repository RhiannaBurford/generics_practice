public class Question1 {
    /* Write a generic method:
        public static <T> int countOccurrences(T[] arr, T item)
        that returns how many times item appears in the array arr.
        You may assume T has a working .equals() method. 
    */

        public static <T> int countOccurrences(T[] arr, T item){
            int count = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i].equals(item)){
                    count++;
                }
            }
            return count;
        }
}
