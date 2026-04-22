public class Vault<T> {
    private T secretItem;
    private String hint;

    public Vault(T secretItem, String hint){
        this.secretItem = secretItem;
        this.hint = hint;
    }

    public T getItem(String passwordHint){
        if (hint.equals(passwordHint)){
            return secretItem;
        }
        return null;
    }
    
}
