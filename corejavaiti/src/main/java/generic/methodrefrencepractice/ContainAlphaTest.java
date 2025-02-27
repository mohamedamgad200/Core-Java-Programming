package generic.methodrefrencepractice;

import java.util.function.Predicate;

public class ContainAlphaTest {
    public static void main(String []args)
    {
        String test="Mohamed1234";
        boolean result=checkTest(test,Character::isLetter);
        System.out.println(result);
    }
    public static boolean checkTest(String s, Predicate<Character>p)
    {
        for(char c:s.toCharArray())
        {
            if(!p.test(c))
            {
                return false;
            }
        }
        return true;
    }
}
