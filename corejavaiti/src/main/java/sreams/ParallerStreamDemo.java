package sreams;
import java.time.Duration;
import java.time.LocalTime;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ParallerStreamDemo {
    public static void main(String[] args) {
        LocalTime startTime=LocalTime.now();
        long count = Stream.iterate(0, n->n+1)
                .limit(1_000_000)
                //.parallel()
                .filter(ParallerStreamDemo::isPrime)
                .peek(x->System.out.format("%s\t",x))
                .count();
        LocalTime endTime=LocalTime.now();
        Duration duration =Duration.between(startTime,endTime);
        System.out.println("\n Total"+count);
        System.out.println("Computed in "+duration.getSeconds()+"seconds");
    }
    public static boolean isPrime(int number)
    {
        return !IntStream.rangeClosed(2,number/2).anyMatch(i->number%i==0);
    }
}
