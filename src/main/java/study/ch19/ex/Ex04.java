package study.ch19.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        // listA: [5, 2, 8]
        // listB: [3, 9, 1]
        // 결과: [1, 2, 3, 5, 8, 9]
        List<Integer> listA = List.of(5, 2, 8);
        List<Integer> listB = List.of(3, 9, 1);
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        System.out.println(result);
        Collections.sort(result);
        System.out.println(result);
    }
}
