package study.ch08;

import study.ch01.Main;

public class OBJ02 {
    public static void main(String[] args) {
        class Addition {
            int defaultNumber = 10;

            Addition() {
                System.out.println("생성자 호출");
            }

            // 1. 중복 코드 제거
            // 2. 기능별로 코드를 나눌 때
            int add(int a, int b) {
                System.out.println("변수a: " + a);
                System.out.println("변수b: " + b);
                System.out.println("기본값: " + defaultNumber);
                return a + b + defaultNumber;
            }

            void printDefaultNumber() {
                System.out.println("기본값: " + defaultNumber);
            }
        }

        Addition add1 = new Addition();
        int num = 1000;
//        System.out.println("변수a: " + 100);
//        System.out.println("변수b: " + 200);
//        System.out.println("기본값: " + add1.defaultNumber);
//        int num2 = 100 + 200;
//        System.out.println("변수a: " + 400);
//        System.out.println("변수b: " + 500);
//        System.out.println("기본값: " + add1.defaultNumber);
//        int num3 = 400 + 500;
        int num2 = add1.add(100, 200);
        int num3 = add1.add(400, 500);
        add1.printDefaultNumber();
        System.out.println(num + num2 + num3);
    }
}


