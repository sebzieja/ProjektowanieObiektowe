package factory;

import prototype.PrototypeBase;
import prototype.PrototypeManager;

import java.util.List;

public abstract class Factory {
    public abstract List<PrototypeBase> getElements();

    public static Factory createItem(FactoryTypes type, PrototypeManager prototypeManager) {
        switch (type) {
            case TOSTER_PNEUMATYCZNY: return new TosterPneumatyczny(prototypeManager);
            case TELEWIZOR_MARKI_RETRO: return new TelewizorMarkiRetro(prototypeManager);
            case HYDROKINETYCZNA_OBIERACZKA: return new HydrokinetycznaObieraczka(prototypeManager);
            default: break;
        }
        System.out.println("Type " + type + " is not recognized");
        return null;
    }
    public enum FactoryTypes {
        TELEWIZOR_MARKI_RETRO, TOSTER_PNEUMATYCZNY, HYDROKINETYCZNA_OBIERACZKA

    }
}
