package formula;

public class Not implements Formula {

    boolean value;
    
    public Not(boolean value) {
        this.value = value;
    }
    
    public boolean evaluate() {
        return !value;
    }
    
    public String toString() {
        return String.valueOf(value);
    }
}