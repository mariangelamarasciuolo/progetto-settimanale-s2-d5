package mariangelamarasciuolo;

import java.util.HashMap;
import java.util.Map;

;

public class Archivio {
    private Map<String, Catalogo> remember = new HashMap<>();

    public void aggiungiElemento(Catalogo cat) {
        remember.put(cat.getIsbn(), cat);
        System.out.println("Elemento aggiunto Correttamente");
    }

    public void rimuoviElemento(String codiceIsbn) {
        remember.remove(codiceIsbn);
        System.out.println("Eliminato correttamente");
    }
    
}
