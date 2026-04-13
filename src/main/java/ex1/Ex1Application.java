package ex1;

import ex1.util.InputUtil;
import ex1.view.MainView;

import java.io.*;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class Ex1Application {
    public static void main(String[] args) throws IOException {
        List<Boolean> b = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Scanner sc = new Scanner(new StringReader("100000000"));
            long t1 = System.nanoTime();
            if (sc.hasNextInt()) sc.nextInt();
            long t2 = System.nanoTime();

            long t3 = System.nanoTime();
            InputUtil.nextInt();
            long t4 = System.nanoTime();

            b.add(t2-t1 > t4-t3);
        }
        System.out.println("scanner:" + b.stream().filter(bb -> bb).count());
        System.out.println("custom:" + b.stream().filter(bb -> !bb).count());


        System.out.println("[ 학생관리 프로그램 실행 ]");
        boolean flag = true;

//        while (flag) {
//            MainView.getInstance().run();
//            System.out.print("입력: ");
////            List<Integer> ints = InputUtil.nextInts();
////            int cmd = ints.get(0);
//            int cmd = InputUtil.nextInt();
//
//            if (cmd == 1) {
//
//            } else if (cmd == 2) {
//
//            } else if (cmd == 3) {
//
//            } else if (cmd == 4) {
//
//            } else if (cmd == 5) {
//
//            } else if (cmd == 6) {
//                break;
//            } else {
//                System.out.println(cmd);
//                System.out.println("다시 입력하세요.");
//            }
//
//        }

        System.out.println("[ 학생관리 프로그램 종료 ]");
    }
}
