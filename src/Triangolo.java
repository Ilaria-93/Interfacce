public class Triangolo implements Forma{

    //costanti per proprietà rettangolo
    private final double base;
    private final double altezza;

    // Costruttore per inizializzare base e altezza
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}
