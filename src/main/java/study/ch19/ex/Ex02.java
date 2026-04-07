package study.ch19.ex;

import javax.imageio.event.IIOReadProgressListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        // 입력: ["Java", "Python", "Java", "C++", "Python", "Go"]
        // 출력: ["Java", "Python", "C++", "Go"]
        List<String> subjects = List.of("Java", "Python", "Java", "C++", "Python", "Go");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < subjects.size(); i++) {
            String subject = subjects.get(i);
            if (!result.contains(subject)) {
                result.add(subject);
            }
        }
        System.out.println(result);
    }
}
