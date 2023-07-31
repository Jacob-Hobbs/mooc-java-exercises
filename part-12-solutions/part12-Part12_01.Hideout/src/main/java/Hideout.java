
import java.util.ArrayList;


public class Hideout<T> {
    
    private T t;
    private ArrayList<T> hideout;
    
    public Hideout() {
        this.t = t;
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if (hideout.isEmpty()) {
            hideout.add(toHide);
        } else {
            hideout.clear();
            hideout.add(toHide);
        }
    }
    
    public T takeFromHideout() {
        this.t = hideout.get(0);
        hideout.remove(0);
        return t;
    }
    
    public boolean isInHideout() {
        if (hideout.isEmpty()) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
