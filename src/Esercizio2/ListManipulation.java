package Esercizio2;

import java.util.*;

public class ListManipulation {
    public static List<Integer> generateRandomList(int n) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(101));
        }
        Collections.sort(list);
        return list;
    }
    
    public static List<Integer> reverseAndDuplicateList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        List<Integer> result = new ArrayList<>(list);
        result.addAll(reversed);
        return result;
    }
    
    public static void printListByPosition(List<Integer> list, boolean even) {
        for (int i = 0; i < list.size(); i++) {
            if (even && i % 2 == 0) {
                System.out.println(list.get(i));
            } else if (!even && i % 2 != 0) {
                System.out.println(list.get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        List<Integer> randomList = generateRandomList(10);
        System.out.println("Random list: " + randomList);
        
        List<Integer> reversedAndDuplicated = reverseAndDuplicateList(randomList);
        System.out.println("Reversed and duplicated list: " + reversedAndDuplicated);
        
        System.out.println("Even positions:");
        printListByPosition(reversedAndDuplicated, true);
        
        System.out.println("Odd positions:");
        printListByPosition(reversedAndDuplicated, false);
    }
}
