package study.ch19.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        // 점수: 85, 92, 78, 96, 88
        // 출력:
        // 전체 점수: [85, 92, 78, 96, 88]
        // 평균: 87.8
        // 최고 점수: 96

        List<Integer> scores = new ArrayList<>(List.of(85, 92, 78, 96, 88));
        int total = 0;
        double avg = 0;
        int max = scores.get(0);
        for (Integer score : scores) {
            total += score;
            if (score > max) max = score;
        }
        avg = (double) total / scores.size();
        System.out.println("평균: " + avg);
        System.out.println("최고 점수: " + max);


    }
}
