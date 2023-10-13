package mariangelamarasciuolo;

public class Application {

    public static void main(String[] args) {
        Libro libro1 = new Libro("545441", "libro bello", 2023, 2000, "Fantasy", "Peppino Magnarone");
        //Libro libro2 = new Libro("654652", "libro stupendo", 2021, 1500, "Romantico", "Mario Pappolla");

        Riviste riviste1 = new Riviste("445454", "Alieni", 2023, 200, Periodicita.MENSILE);
        //Riviste riviste2 = new Riviste("565476", "Vichinghi", 2023, 150, Periodicita.TREMESTRALE);

        Archivio archivio = new Archivio();
        archivio.aggiungiElemento(libro1);
        archivio.aggiungiElemento(riviste1);

        archivio.rimuoviElemento(libro1.getIsbn());
        archivio.rimuoviElemento(riviste1.getIsbn());
    }
}
