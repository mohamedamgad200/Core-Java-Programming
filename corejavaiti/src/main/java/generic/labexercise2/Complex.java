package generic.labexercise2;

import java.math.BigDecimal;

public class Complex<T extends BigDecimal, R extends BigDecimal> {
    private T r;
    private R i;

    public Complex(T rr, R ii) {
        r = rr;
        i = ii;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append(r);
        return sb.append(i).append('i').toString();
    }

    public R getImaginary() {
        return i;
    }
    public T getReal()
    {
        return r;
    }
    public Complex<T,R>add(Complex<T,R>other)
    {
        return new Complex<T,R>((T)(r.add(other.r)),(R)(i.add(other.i)));
    }
    public Complex<T,R>add(Complex<T,R>c1,Complex<T,R>c2)
    {
        return new Complex<T,R>((T)(c1.getReal().add(c2.getReal())),(R)(c1.getImaginary().add(c2.getImaginary())));
    }
    public Complex<T,R>subtract(Complex<T,R>other)
    {
        return new Complex<T,R>((T)(r.subtract(other.r)),(R)(i.subtract(other.i)));
    }
    public Complex<T,R>subtract(Complex<T,R>c1,Complex<T,R>c2)
    {
        return new Complex<T,R>((T)(c1.getReal().subtract(c2.getReal())),(R)(c1.getImaginary().subtract(c2.getImaginary())));
    }
    public Complex<T,R>multiply(Complex<T,R>other)
    {
        return new Complex<T,R>((T)(r.multiply(other.r)),(R)(i.multiply(other.i)));
    }
    public Complex<T,R>multiply(Complex<T,R>c1,Complex<T,R>c2)
    {
        return new Complex<T,R>((T)(c1.getReal().multiply(c2.getReal())),(R)(c1.getImaginary().multiply(c2.getImaginary())));
    }
}
