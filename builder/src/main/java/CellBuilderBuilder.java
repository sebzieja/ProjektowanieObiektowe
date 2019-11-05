public class CellBuilderBuilder implements WithCellBuilderNucleus, WithCellBuilderWall, ICellBuilder {
    private boolean wall;
    private boolean membrane;
    private boolean nucleus;
    private boolean nucleusMembrane;
    private boolean endoplasmicReticulum;
    private boolean ribosomes;
    private boolean mitochondrion;
    private boolean vacuoles;
    private boolean lysosomes;
    private boolean chloroplasts;

    public WithCellBuilderWall setWall() {
        this.wall = true;
        return this;
    }

    public CellBuilderBuilder setMembrane() {
        this.membrane = true;
        return this;
    }

    public WithCellBuilderNucleus setNucleus() {
        this.nucleus = true;
        return this;
    }

    public CellBuilderBuilder setNucleusMembrane() {
        this.nucleusMembrane = true;
        return this;
    }

    public CellBuilderBuilder setEndoplasmicReticulum() {
        this.endoplasmicReticulum = true;
        return this;
    }

    public CellBuilderBuilder setRibosomes() {
        this.ribosomes = true;
        return this;
    }

    public CellBuilderBuilder setMitochondrion() {
        this.mitochondrion = true;
        return this;
    }

    public CellBuilderBuilder setVacuoles() {
        this.vacuoles = true;
        return this;
    }

    public CellBuilderBuilder setLysosomes() {
        this.lysosomes = true;
        return this;
    }

    public CellBuilderBuilder setChloroplasts() {
        this.chloroplasts = true;
        return this;
    }

    public Cell build() {
        return new Cell(wall, membrane, nucleus, nucleusMembrane, endoplasmicReticulum, ribosomes, mitochondrion, vacuoles, lysosomes, chloroplasts);
    }
}