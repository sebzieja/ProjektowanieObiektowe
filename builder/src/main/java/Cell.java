public class Cell {
    public boolean wall;
    public boolean membrane;
    public boolean nucleus;
    public boolean nucleusMembrane;
    public boolean endoplasmicReticulum;
    public boolean ribosomes;
    public boolean mitochondrion;
    public boolean vacuoles;
    public boolean lysosomes;
    public boolean chloroplasts;

    public Cell(boolean wall, boolean membrane, boolean nucleus, boolean nucleusMembrane, boolean endoplasmicReticulum, boolean ribosomes, boolean mitochondrion, boolean vacuoles, boolean lysosomes, boolean chloroplasts) {
        this.wall = wall;
        this.membrane = membrane;
        this.nucleus = nucleus;
        this.nucleusMembrane = nucleusMembrane;
        this.endoplasmicReticulum = endoplasmicReticulum;
        this.ribosomes = ribosomes;
        this.mitochondrion = mitochondrion;
        this.vacuoles = vacuoles;
        this.lysosomes = lysosomes;
        this.chloroplasts = chloroplasts;
    }
}
