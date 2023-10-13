package mariangelamarasciuolo;

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
}
