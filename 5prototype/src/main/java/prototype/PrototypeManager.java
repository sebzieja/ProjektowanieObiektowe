package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private Map<String, PrototypeBase> prototypeBaseMap = new HashMap<>();

    public void addPrototype(String name, PrototypeBase prototypeBase) {
        prototypeBaseMap.put(name, prototypeBase);
    }

    public void deletePrototype(String name) {
        prototypeBaseMap.remove(name);
    }

    public void dropAll() {
        prototypeBaseMap.clear();
    }

    public PrototypeBase getCopy(String name) {
        if (prototypeBaseMap.containsKey(name)) {
            try {
                return (PrototypeBase) prototypeBaseMap.get(name).clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        } else {
            return null;
        }
    }
}
