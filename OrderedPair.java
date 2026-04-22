public class OrderedPair<K,V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public boolean updateValue(V value2){
        if (!value2.equals(value)){
            value = value2;
            return true;
        }
        return false;
    }
}
