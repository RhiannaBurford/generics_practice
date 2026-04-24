import java.util.List;
import java.util.LinkedList;

public class RankedList<T extends Comparable<T>>{
    /* This class stores a list of T objects and maintains them in sorted 
    order whenever a new element is added. */

    private List<T> list;

    public RankedList(){
        this.list = new LinkedList<T> ();
    }

    public void add(T item){
        for (int i = 0; i < list.size(); i++){
            if (item.compareTo(list.get(i)) < 0){
                // Shuffle all the elements one place to the left - no need, java does it all for us anyway
                list.add(i, item); 
                return;
            }
        }
        list.add(item);
    }

    public T getHighest(){
        return list.get(list.size() - 1);
    }

    public boolean containsAny(List<? extends T> other){
        for (int i = 0; i < other.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if (other.get(i).equals(list.get(j))){
                    return true;
                }
            }
        }
        return false;
    }


    public void addAll(List<? super T> items){
        for (int i = 0; i < items.size(); i++){

            // instanceof T is illegal because Java erases generic types at runtime
            try {
                T value = (T) items.get(i);   // attempt the cast
                add(value);                   // only runs if cast succeeds
            } catch (ClassCastException e) {
            // ignore elements that are not actually T
            } 
        }
    }

}
