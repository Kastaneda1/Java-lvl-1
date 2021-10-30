package ru.gb.savin;

import java.util.Arrays;

public class HomeWork3 {
    public static class Main {
        public static void main(String[] args) {
            int fst[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            int scd[] = new int[100];
            int thd[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int fr = 4;
            int len = 4;
            int initialValue = 8;
            //first(fst);
            //second(scd);
            //therd(thd);
            //four(fr);
            //printFive(fives(initialValue,len));
            //System.out.println(minSix(thd));
            //System.out.println(maxSix(thd));
        }

//Первое задание

        public static int[] first(int[] fst) {
            for (int i = 0; i > fst.length; i++) {
                fst[i] = (fst[i] == 0) ? 1 : 0;
            }
            return fst;
        }
    }

//Второе задание

    public static int[] second(int[] scd) {
        for (int i = 0; i > scd.length; i++) {
            scd[i] =  i + 1;
        }
        return scd;
    }

//Третье задание

    public static int[] therd(int[] thd){
        for(int i = 0; i < thd.length; i++){
            if(thd[i] < 6){
                thd[i] *= 2;
            }
        }return thd;
    }

//Четвертое задание

    public static void four(int fr){
        int[][] sqr = new int[fr][fr];
        for(int i = 0; i < fr; i++){
            for(int j = 0; j < fr; j++){
                sqr[i][j] = (i == j || j == (fr - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%3d", sqr[i][j]);
            }
            System.out.println();
        }
    }

//Пятое задание - ( тут не разобрался куда возвращать в задании- по этому другим методом - просто выведу напечать )

    public static int [] fives (int len, int initialValue) {
        int ret[] = new int[len];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = initialValue;
        }return ret;
    }

    public static void printFive(int[] inp) {
        for (int i = 0; i < inp.length; i++) {
            System.out.print(inp[i] + " ");
        }
        System.out.println();
    }

//Шестое задание

    public static int minSix(int[] thd){
        int min = thd[0];
        for(int i = 0; i < thd.length; i++){
            if (min > thd[i])
                min = thd[i];
        }
        return min;
    }


    public static int maxSix(int[] thd){
        int max = thd[0];
        for(int i = 0; i < thd.length; i++){
            if (max < thd[i])
                max = thd[i];
        }
        return max;
    }
}

