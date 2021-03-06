package factory;

import prototype.PrototypeBase;
import prototype.PrototypeManager;

import java.util.ArrayList;
import java.util.List;

public class TosterPneumatyczny extends Factory {
    private List<PrototypeBase> elements = new ArrayList<>();

    @Override
    public List<PrototypeBase> getElements() {
        return elements;
    }

    public TosterPneumatyczny(PrototypeManager prototypeManager) {
        elements.add(prototypeManager.getCopy("A"));
        elements.add(prototypeManager.getCopy("B"));
        elements.add(prototypeManager.getCopy("B"));
        elements.add(prototypeManager.getCopy("B"));
        elements.add(prototypeManager.getCopy("A"));
        elements.add(prototypeManager.getCopy("D"));
    }
}
