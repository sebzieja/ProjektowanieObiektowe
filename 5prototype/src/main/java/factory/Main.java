package factory;

import prototype.*;

public class Main {
    public static void main(String[] args) {
        PrototypeManager prototypeManager = new PrototypeManager();
        prototypeManager.addPrototype("A", new RobotA());
        prototypeManager.addPrototype("B", new RobotB());
        prototypeManager.addPrototype("C", new RobotC());
        prototypeManager.addPrototype("D", new RobotD());

        Factory toster = Factory.createItem(Factory.FactoryTypes.TOSTER_PNEUMATYCZNY, prototypeManager);
        Factory obieraczka = Factory.createItem(Factory.FactoryTypes.HYDROKINETYCZNA_OBIERACZKA, prototypeManager);
        Factory telewizor = Factory.createItem(Factory.FactoryTypes.TELEWIZOR_MARKI_RETRO, prototypeManager);

        System.out.println(Factory.FactoryTypes.TOSTER_PNEUMATYCZNY);
        toster.getElements().forEach(PrototypeBase::action);
        System.out.println(Factory.FactoryTypes.HYDROKINETYCZNA_OBIERACZKA);
        obieraczka.getElements().forEach(PrototypeBase::action);
        System.out.println(Factory.FactoryTypes.TELEWIZOR_MARKI_RETRO);
        telewizor.getElements().forEach(PrototypeBase::action);
    }
}
