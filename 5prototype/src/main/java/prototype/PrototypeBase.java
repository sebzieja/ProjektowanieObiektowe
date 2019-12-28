package prototype;

public abstract class PrototypeBase implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public abstract void action();
}