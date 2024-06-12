package OopLibreria;

public class Libro { //1- i private 2- costruttore 3-get 4-set
    private String titolo, autore;
    private int anno;
//COSTRUTTORE
    public Libro (String titolo, String autore, int anno){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }
// GETTER
    public String getTitolo() {
        return titolo;
    }
    public String getAutore(){
        return autore;
    }
    public int getAnno(){
        return anno;
    }
//SETTER
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
// METODO x convertire l'interno della classe in un'unica stringa x poi poter essere stampato
    public String toString() {
        return "Titolo: " + titolo + "; Autore: " + autore;
    }
}


