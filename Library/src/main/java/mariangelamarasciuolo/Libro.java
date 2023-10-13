package mariangelamarasciuolo;

public class Libro extends Catalogo {
    private String genere;
    private String autore;

    public Libro(String isbn, String titolo, int annoPubb, int numeroPag, String genere, String autore) {
        super(isbn, titolo, annoPubb, numeroPag);
        this.genere = genere;
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere() {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore() {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "genere='" + genere + '\'' +
                ", autore='" + autore + '\'' +
                '}';
    }
}
