public class Inventory<T> {
    private T[] array;
    private int currentSize; // Number of items currently stored

    public Inventory(int maxCapacity){
        this.array = (T[]) new Object[maxCapacity];
        this.currentSize = 0;
    }

    public boolean addItem(T newItem){
        if (currentSize >= array.length){
            return false;
        }
        array[currentSize] = newItem;
        currentSize++; // need to increment this irgendwo!
        return true;
    }

    public T getMostRecent(){
        if (currentSize == 0){
            return null;
        }
        return array[currentSize -1];
    }

}
