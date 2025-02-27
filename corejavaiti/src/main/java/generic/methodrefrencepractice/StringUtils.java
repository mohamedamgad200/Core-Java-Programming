package generic.methodrefrencepractice;

import java.util.function.BiPredicate;

public class StringUtils {
    public static void main(String[]args){
        String string1 = "Hello";
        String string2 = "World!";

        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longer String: " + longer);
        String first = betterString(string1, string2, (s1, s2) -> true);
        System.out.println("First String: " + first);
    }
    public static String betterString(String s1, String s2, BiPredicate<String,String> p)
    {
        if(p.test(s1,s2))
        {
          return s1;
        }
        return s2;
    }
}
