package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {
        /**
         * 100명의 학생정보 저장하세요.
         * 이름, 나이
         */
        class 학생 {
            String 이름;
            int 나이;

            학생() {
                System.out.println("학생 한명 생성");
            }

            void printInfo() {
                System.out.println("name: " + 이름);
                System.out.println("age: " + 나이);
            }

            void increaseAge() {
                System.out.println("나이 한살 더 먹기");
                나이++;
            }
        }

        int num;

        학생 학생1 = new 학생();
        학생1.이름 = "김준일";
        학생1.나이 = 33;
        학생1.printInfo();
        학생1.increaseAge();
        학생1.printInfo();
        학생1.printInfo();
        System.out.println();

        학생 학생2 = new 학생();
        학생2.이름 = "김준이";
        학생2.나이 = 34;
        학생 학생3 = new 학생();
        학생3.이름 = "김준삼";
        학생3.나이 = 35;

        String n = "김준일";
        String n2 = new String("김준일");
        n.getBytes();
        "김준일".getBytes();
        n2.getBytes();
        new String("김준일").getBytes();
        n.getBytes();
        n.toLowerCase();
        new String("김준일").toLowerCase();

    }
}
