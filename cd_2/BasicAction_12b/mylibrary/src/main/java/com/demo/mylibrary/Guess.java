package com.demo.mylibrary;

public class Guess {

    public static int getNum() {
        int num = (int) (Math.random() * 10);
        return num;
    }
}
