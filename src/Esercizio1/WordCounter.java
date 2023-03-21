package Esercizio1;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di parole da inserire: ");
        int n = input.nextInt();
        
        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci la parola " + (i+1) + ": ");
            String word = input.next();
            if (!words.add(word)) {
                duplicates.add(word);
            }
        }
        
        System.out.println("Parole duplicate: " + duplicates);
        System.out.println("Numero di parole distinte: " + words.size());
        System.out.println("Elenco delle parole distinte: " + words);
    }
}
