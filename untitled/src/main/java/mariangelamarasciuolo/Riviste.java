package mariangelamarasciuolo;

public class Riviste extends Catalogo {
    private Periodicita periodicita;

    public Riviste(String isbn, String titolo, int annoPubb, int numeroPag, Periodicita periodicita) {
        super(isbn, titolo, annoPubb, numeroPag);
        this.periodicita = periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicita=" + periodicita +
                '}';
    }
}
