package ru.gb.savin;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        int x = -2, b = 15;
        int i = 2100;
        int l = 7;
        String n = "Super";
        checkWhilenumbers(x, b);
        System.out.println(checkWhilenumbers(x, b));
        second(x);
        third(b);
        System.out.println(third(b));
        four(n, l);
        System.out.println(five(i));
    }


    public static boolean checkWhilenumbers(int x, int b) {
        if ((x + b) >= 10 && (x + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public static void second(int x) {
        if (x >= 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("Число является отрицательным");
        }
    }

    public static boolean third(int b) {
        if (b > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void four(String n, int i) {
        for (int d = 1; d <= i; d++) {
            System.out.println("[" + d + "]" + " " + n);
        }
    }
    public static boolean five(int i) {
        if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}


