package study.ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda03 {
    public static String search(List<String> list, Predicate<String> p) {
        for (String s : list) {
            if (p.test(s)) return s;
        }
        return null;
    }

    public static String search2(List<String> list, Predicate<String> p) {
        for (String s : list) {
            if (s.contains("이")) return s;
        }
        return null;
    }

    public static void applicationMain(Runnable runnable) {
        System.out.println("프로그램 시작");
        runnable.run();
        System.out.println("프로그램 종료");
    }

    public static List<Integer> createNumListOfRange(int multNum, Function<Integer, List<Integer>> f) {
        return f.apply(multNum);
    }

    public static void main(String[] args) {
        List<String> names = List.of("박준일", "김준이", "이준삼");
        String foundName = search(names, name -> name.startsWith("김"));
        System.out.println(foundName);

        applicationMain(() -> {
            List<Integer> numList = createNumListOfRange(10, (multNum) -> {
                int start = 10;
                int end = 20;
                List<Integer> nums = new ArrayList<>();
                for (int i = start; i < end + 1; i++) {
                    nums.add(i * multNum);
                }
                return nums;
            });

            System.out.println(numList);
        });
        System.out.println("프로그램 진짜 완전 종료");

    }
}
