public class Main {
    public static void main(String[] args) {
        Sim miaSim = new Sim("3201234567");

        miaSim.aggiungiChiamata(3, "3281112222");
        miaSim.aggiungiChiamata(10, "3273334444");
        miaSim.aggiungiChiamata(2, "3295556666");
        miaSim.aggiungiChiamata(7, "3267778888");
        miaSim.aggiungiChiamata(5, "3219990000");
        miaSim.aggiungiChiamata(4, "3301122334"); // Questa farà uscire la prima chiamata

        miaSim.stampaDati();
    }
}
