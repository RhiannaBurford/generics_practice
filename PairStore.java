public class PairStore<T> {

    private T first;
    private T second;

    public PairStore(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    public boolean contains(T item){
        if (first.equals(item) || second.equals(item)){
            return true;
        }
        return false;
    }
}
