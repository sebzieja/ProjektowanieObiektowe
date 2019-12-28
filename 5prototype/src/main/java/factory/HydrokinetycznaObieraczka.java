package factory;

import prototype.PrototypeBase;
import prototype.PrototypeManager;

import java.util.ArrayList;
import java.util.List;

public class HydrokinetycznaObieraczka extends Factory {
    private List<PrototypeBase> elements = new ArrayList<>();

    @Override
    public List<PrototypeBase> getElements() {
        return elements;
    }

    public HydrokinetycznaObieraczka(PrototypeManager prototypeManager) {
        elements.add(prototypeManager.getCopy("C"));
        elements.add(prototypeManager.getCopy("D"));
        elements.add(prototypeManager.getCopy("A"));
        elements.add(prototypeManager.getCopy("D"));
    }
}
