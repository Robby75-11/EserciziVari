import java.util.LinkedList;

class Chiamata {
    int durata; // in minuti
    String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    @Override
    public String toString() {
        return "Numero chiamato: " + numeroChiamato + ", Durata: " + durata + " minuti";
    }
}

public class Sim {
    private String numeroTelefono;
    private double credito;
    private LinkedList<Chiamata> chiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new LinkedList<>();
    }

    public void aggiungiChiamata(int durata, String numero) {
        if (chiamate.size() == 5) {
            chiamate.removeFirst(); // rimuove la chiamata più vecchia
        }
        chiamate.add(new Chiamata(durata, numero));
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime chiamate:");
        for (Chiamata c : chiamate) {
            System.out.println(" - " + c);
        }
    }
}

