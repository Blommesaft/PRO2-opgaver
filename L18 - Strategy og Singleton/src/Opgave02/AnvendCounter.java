package Opgave02;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter counter = Counter.getInstance();
        System.out.println(counter.getValue());
        counter.count();
        counter.times2();
        counter.times2();
        System.out.println(counter.getValue());
        counter.zero();
        System.out.println(counter.getValue());
        counter.count();
        System.out.println(counter.getValue());

        Counter counter1 = Counter.getInstance();
        System.out.println(counter1.getValue());
        counter1.count();
        System.out.println(counter.getValue());
        System.out.println(counter1.getValue());

    }
}
