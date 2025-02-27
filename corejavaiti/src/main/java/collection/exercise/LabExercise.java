package collection.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LabExercise {
    public static void main(String[] args) {
        String []words={"apple", "banana", "apricot", "berry", "cherry", "avocado", "blue", "cat"};
        Map<Character, List<String>> wordMap=new TreeMap<>();
        for(String word:words)
        {
            char firstChar=word.charAt(0);
            wordMap.putIfAbsent(firstChar,new ArrayList<>());
            wordMap.get(firstChar).add(word);
        }
        printAllMapEntry(wordMap);
        printValueOfKey(wordMap,'a');
    }
    private static void printAllMapEntry(Map<Character,List<String>> wordMap)
    {
        for (Map.Entry<Character, List<String>> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
    private static void printValueOfKey(Map<Character,List<String>> wordMap,Character key)
    {
        System.out.println(wordMap.getOrDefault(key, new ArrayList<>()));
    }
}
