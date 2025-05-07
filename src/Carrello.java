package ecommerce;

import java.util.ArrayList;

public class Carrello {
    private Cliente cliente;
    private ArrayList<Articolo> articoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
    }

    public double calcolaTotale() {
        double totale = 0;
        for (Articolo a : articoli) {
            totale += a.getPrezzo();
        }
        return totale;
    }

    public void stampaCarrello() {
        System.out.println("Carrello di " + cliente.getNomeCompleto());
        for (Articolo a : articoli) {
            a.stampaDettagli();
        }
        System.out.println("Totale: €" + calcolaTotale());
    }
}

