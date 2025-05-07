
package sim;

import forme.Rettangolo;

public class Sim {
    private String numero;
    private double credito;
    private String[] ultimeChiamate;

    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0.0;
        this.ultimeChiamate = new String[5];
        // esempio di chiamate fittizie
        this.ultimeChiamate[0] = "Chiamata a 3201234567 - 3 minuti";
        this.ultimeChiamate[1] = "Chiamata a 3339876543 - 5 minuti";
        this.ultimeChiamate[2] = "Chiamata a 3379852433 - 8 minuti";
        this.ultimeChiamate[3] = "Chiamata a 3478569874 - 10 minuti";
        this.ultimeChiamate[4] = "Chiamata a 3485874565 - 12 minuti";
    }

    public void stampaDati() {
        System.out.println("Numero: " + numero);
        System.out.println("Credito: " + credito + "€");
        System.out.println("Ultime chiamate:");
        for (String chiamata : ultimeChiamate) {
            if (chiamata != null)
                System.out.println("- " + chiamata);
        }
    }

    public static void main(String[] args) {
        Sim miaSim = new Sim("3291122334");
        miaSim.stampaDati();

        System.out.println();

        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 4);
        Rettangolo.stampaDueRettangoli(r1, r2);
    }
}

