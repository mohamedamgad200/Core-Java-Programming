package threads.example1;

import threads.example1.SimpleThread;

public class ThreatTest {
    public static void main(String[] args) {
        new SimpleThread("First thread").start();
        new SimpleThread("Second thread").start();
    }
}
