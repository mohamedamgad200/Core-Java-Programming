package generic;

public class PairTest {
    public static void main(String[] args){
        String[]words={"Marry","had","a","little","lamb"};
        Pair<String>minmax=ArrayAlg.minmax(words);
        System.out.println("min= "+minmax.getFirst());
        System.out.println("max= "+minmax.getSecond());
    }
}
