package forme;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);
        System.out.println("Rettangolo 2:");
        stampaRettangolo(r2);
        System.out.println("Somma Aree: " + (r1.calcolaArea() + r2.calcolaArea()));
        System.out.println("Somma Perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
    }
}

