package ecommerce;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("C001", "Luca", "Verdi", "luca@email.com", LocalDate.now());

        Articolo a1 = new Articolo("A100", "Mouse Wireless", 25.99, 10);
        Articolo a2 = new Articolo("A101", "Tastiera Meccanica", 59.90, 5);

        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);

        carrello.stampaCarrello();
    }
}

