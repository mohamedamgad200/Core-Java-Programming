package string;

import java.util.StringTokenizer;

public class StringExercise {
    public static void main(String[] args) {
        //using split
        /*
        String s="Hello Amagad Hello mego";
        String []words=s.split("\\s");
        String wordCount="Hello";
        int counterOfWord=0;
        for (String word :words)
        {
            if(word.equals(wordCount))
            {
                counterOfWord++;
            }
        }
        System.out.println(counterOfWord);
         */
        //using tokenizer
        String s="Hello Amagad Hello mego";
        String wordCount="Hello";
        int counterOfWord=0;
        StringTokenizer tokenizer=new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()) {
            if(tokenizer.nextToken().equals(wordCount))
            {
               counterOfWord++;
            }
        }
        System.out.println(counterOfWord);
    }
}
