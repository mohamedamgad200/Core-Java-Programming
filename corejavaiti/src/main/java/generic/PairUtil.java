package generic;

public class PairUtil {
    public static <A extends Number,B extends Number>double add(DualPair<A,B>p)
    {
        return p.getFirst().doubleValue()+p.getSecond().doubleValue();
    }
    public static <A,B>DualPair<B,A>swap(DualPair<A,B>p){
        A first=p.getFirst();
        B second=p.getSecond();
        return new DualPair<>(second,first);
    }
}
