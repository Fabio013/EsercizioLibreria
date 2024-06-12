package OopLibreria;

public class RaccoltaLibri {

    private int maxlibri; //contatore libri che inseriremo
    private Libro [] libro; //Classe + sotto diventa "oggetto" di questa classe
//Costruttore -----------------------
    public RaccoltaLibri () {
        this.maxlibri = 0;
        this.libro = new Libro[maxlibri];
    }
//Getter -----------------------
    public Libro[] getLibro() {
        return libro;
    }
// Metodo x aggiungere libri------------
    public void aggiungiLibro(Libro nuovoLibro) {
        if (maxlibri < libro.length) {
            libro[maxlibri] = nuovoLibro;
            maxlibri++;
        } else {
            System.out.println("Numero massimo di libri raggiunto!");
        }
    }
}
