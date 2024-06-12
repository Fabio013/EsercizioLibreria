/* Crea un programma per gestire una libreria.
   Ogni libro avrà una classe 'Libro' con campi:
- titolo
- autore
- anno di pubblicazione

  Utilizza un array per memorizzare i libri e implementare i metodo per:
- aggiungere un libro
- ricercare un libro
- visualizzare tutti i libri
- rimuovere un libro
  La ricerca per titolo e/o autore
 */

package OopLibreria;

public class Main {
    public static void main(String[] args) {
        Libro primoLibro = new Libro("Addio alle armi", "Ernest Hemingway", 1929);
        Libro secondoLibro = new Libro("Ciaone", "Io", 2024);
        RaccoltaLibri libreria = new RaccoltaLibri();
        libreria.aggiungiLibro(primoLibro);
        libreria.aggiungiLibro(secondoLibro);
        Libro[] libriaggiunti = libreria.getLibro();
        System.out.println(libriaggiunti[0].toString());
        System.out.println(libriaggiunti[1].toString());
    }
}
