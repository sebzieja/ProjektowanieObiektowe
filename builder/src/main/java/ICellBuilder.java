public interface ICellBuilder {
    ICellBuilder setMembrane();

    ICellBuilder setNucleusMembrane();

    ICellBuilder setEndoplasmicReticulum();

    ICellBuilder setRibosomes();

    ICellBuilder setMitochondrion();

    ICellBuilder setVacuoles();

    ICellBuilder setLysosomes();

    ICellBuilder setChloroplasts();

    Cell build();
}
