package study.ch23;

import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10, 20, 30, 40);

        Stream<Integer> numStream2 = numStream.map(num -> num * 10);
        numStream = Stream.of(10, 20, 30, 40);
        Stream<Integer> numStream3 = numStream.map(num -> num * 20);

        System.out.println(numStream2.toList());
        System.out.println(numStream3.toList());
    }
}