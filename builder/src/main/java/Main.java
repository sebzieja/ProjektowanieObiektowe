public class Main {
    public static void main(String[] args) {
        CellBuilderBuilder builder = new CellBuilderBuilder();
        Cell cell = builder.setNucleus()
                .setChloroplasts()
                .setLysosomes()
                .setEndoplasmicReticulum()
                .build();
        System.out.println(cell);
    }
}
