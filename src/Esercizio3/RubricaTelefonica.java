package Esercizio3;

import java.util.HashMap;

public class RubricaTelefonica {
    private HashMap<String, String> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
    }

    public void eliminaContatto(String nome) {
        contatti.remove(nome);
    }

    public String cercaNumero(String nome) {
        return contatti.get(nome);
    }

    public String cercaNome(String telefono) {
        for (String nome : contatti.keySet()) {
            if (contatti.get(nome).equals(telefono)) {
                return nome;
            }
        }
        return null;
    }

    public void stampaContatti() {
        for (String nome : contatti.keySet()) {
            String telefono = contatti.get(nome);
            System.out.println(nome + ": " + telefono);
        }
    }
}
