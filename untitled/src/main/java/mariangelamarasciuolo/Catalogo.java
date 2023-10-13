package mariangelamarasciuolo;

public abstract class Catalogo {
    String isbn;
    String titolo;
    int annoPubb;
    int numeroPag;


    public Catalogo(String isbn, String titolo, int annoPubb, int numeroPag) {

        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPubb = annoPubb;
        this.numeroPag = numeroPag;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn() {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubb() {
        return annoPubb;
    }

    public void setAnnoPubb(int annoPubb) {
        this.annoPubb = annoPubb;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "isbn=" + isbn +
                ", titolo='" + titolo + '\'' +
                ", annoPubb=" + annoPubb +
                ", numeroPag=" + numeroPag +
                '}';
    }
}
