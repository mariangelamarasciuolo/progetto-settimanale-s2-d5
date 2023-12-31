package mariangelamarasciuolo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

;

public abstract class Archivio {
    static Map<String, Catalogo> remember = new HashMap<>();

    public static void aggiungiElemento(Catalogo cat) {
        remember.put(cat.getIsbn(), cat);
        System.out.println("Elemento aggiunto Correttamente");
    }

    public static void rimuoviElemento(String codiceIsbn) {
        remember.remove(codiceIsbn);
        System.out.println("Eliminato correttamente");
    }

    public static void ricercaAnnoPubblicazione(int annoPubb) {
        Collection<Catalogo> listaCatalogo = remember.values();
        Map<Integer, List<Catalogo>> listaProvvisoria = listaCatalogo.stream().collect(Collectors.groupingBy(Catalogo::getAnnoPubb));
        List<Catalogo> listaAnno = new ArrayList<>(listaProvvisoria.get(annoPubb));
        System.out.println(listaAnno);
    }

    public static void ricercaIsbn(String codiceIsbn) {
        Catalogo elemento = remember.get(codiceIsbn);
        if (elemento != null) {
            System.out.println(elemento);
        } else {
            System.out.println("Nessun elemento trovato con ISBN: " + codiceIsbn);
        }
    }

    public static void ricercaAutore(String Autore) {
        remember.values().stream()
                .filter(ele -> ele instanceof Libro)
                .map(ele -> (Libro) ele)
                .filter(ele -> Autore.equals(ele.getAutore()))
                .forEach(System.out::println);
    }

  public static void salvaFile() {
  File file = new File("remember/remember.txt");
        StringBuilder dato = new StringBuilder();
        for (Catalogo cat : remember.values()) {
            dato.append(cat.toString());
        }
        try {
            FileUtils.writeStringToFile(file, dato.toString(), StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            System.err.println("Impossibile scrivere il file: " + e.getMessage());
        }
    }

}
