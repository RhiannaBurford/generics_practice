import java.util.List;

public class CountValid{

    public static <T> int countValid(List<? super T> items){
        int count = 0;
        for (int i = 0; i < items.size(); i++){
            try {
                T element = (T) items.get(i);
                count++;
            }
            catch (ClassCastException e){
            }
        }
        return count;
    }

}



