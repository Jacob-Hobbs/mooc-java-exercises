
import java.util.ArrayList;


public class Pipe<T> {
    
    ArrayList<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayList<>();    
    }
    
    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null;
        }
        return pipe.get(0);
    }
    
    public boolean isInPipe() {
        if (pipe.isEmpty()) {
            return false;
        } return true;
    }
    
}
