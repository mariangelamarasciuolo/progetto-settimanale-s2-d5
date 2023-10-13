package mariangelamarasciuolo;

public class Application {

    public static void main(String[] args) {
        Libro libro1 = new Libro("545441", "libro bello", 2022, 2000, "Fantasy", "Peppino Magnarone");
        Libro libro2 = new Libro("654652", "libro stupendo", 2021, 1500, "Romantico", "Mario Pappolla");

        Riviste riviste1 = new Riviste("445454", "Alieni", 2022, 200, Periodicita.MENSILE);
        Riviste riviste2 = new Riviste("565476", "Vichinghi", 2023, 150, Periodicita.TREMESTRALE);

        System.out.println("-----Aggiungi elemento-----");
        Archivio.aggiungiElemento(libro1);
        Archivio.aggiungiElemento(riviste1);

        System.out.println("-----Ricerca per anno-----");
        Archivio.ricercaAnnoPubblicazione(2022);

        System.out.println("-----Ricerca per ISBN-----");
        Archivio.ricercaIsbn("545441");

        System.out.println("-----Ricerca per autore-----");
        Archivio.ricercaAutore("Peppino Magnarone");

        System.out.println("-----Elimina elemento-----");
        Archivio.rimuoviElemento(libro1.getIsbn());
        Archivio.rimuoviElemento(riviste1.getIsbn());


    }
}
