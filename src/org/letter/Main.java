package org.letter;

public class Main {

    public static void main(String[] args) {
        Horse[] arr = new Horse[4];
        arr[0] = new Horse("인재(왕바우)");
        arr[1] = new Horse("고은(다크레전드)");
        arr[2] = new Horse("아람(썬더)");
        arr[3] = new Horse("영준(찌꾸)");

        for (Horse h : arr) {
            h.start();

        }
//        Looper looper = new Looper();
//
//        new Thread(() -> {
//          looper.loop();
//        }).start(); //
//        looper.loop();
//
//        new Thread(() -> {
//            looper.loop();
//        }).start();
//
//
//        looper.loop();
//
    }
}
