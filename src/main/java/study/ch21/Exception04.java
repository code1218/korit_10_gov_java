package study.ch21;

import java.io.IOException;

public class Exception04 {
    public static void checked() throws IOException {
        IOException e = new IOException();
        throw e;

    }

    public static void unChecked() throws Exception {
        throw new RuntimeException();
    }


    public static void main(String[] args) {
        System.out.println("프로그램 실행");

        try {
            checked();
            unChecked();
            return;
        } catch (IOException e) {
            return;
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("?");
        }



//        System.out.println("프로그램 종료");
    }

}
