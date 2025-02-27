package generic;

public class DualPair <X,Y>{
    private final X a;
    private  final Y b;

    public DualPair(X a, Y b) {
        this.a = a;
        this.b = b;
    }

    public X getFirst() {
        return a;
    }

    public Y getSecond() {
        return b;
    }
}
