package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static String repeat(String str, int n){
        String result = "";
        for(int i = 0; i < str.length(); i++){

            for(int j = 0; j < n; j++){
                result += str.charAt(i);
            }

        }

        return result;
    }

    public static int differenceMaxMin(int[] array){
        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }

            if (array[i] < min){
                min = array[i];
            }
        }

        return max - min;

    }

    public static boolean isAvgWhole(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum % array.length == 0;
    }

    public static int[] cumulativeSum(int[] array){
        int[] result = new int[array.length];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            result[i] = sum;
        }

        return result;
    }

    public static int getDecimalPlaces(String number){
        int dot_index = number.indexOf(".");
        if (dot_index == -1) return 0;
        number = number.substring(dot_index);
        return number.length() - 1;
    }

    public static int Fibonacci(int n){
        n++;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;

        for(int i = 2; i < array.length; i++){
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n - 1];
    }

    public static boolean isValid(String str){
        if(str.length() != 5){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static boolean isStrangePair(String fst, String snd){
        if (fst.isEmpty() && snd.isEmpty()) {
            return true;
        }
        return fst.charAt(0) == snd.charAt(snd.length() - 1) && fst.charAt(fst.length() - 1) == snd.charAt(0);
    }

    public static boolean isPrefix(String s, String prefix)
    {
        if(prefix.length() > s.length()) return false;
        prefix = prefix.substring(0, prefix.length() - 1);
        for(int i = 0; i < prefix.length(); i++){
            if(prefix.charAt(i) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isSuffix(String s, String suffix)
    {
        if(suffix.length() > s.length()) return false;
        suffix = suffix.substring(1);
        for(int i = 0; i < suffix.length(); i++){
            if(suffix.charAt(suffix.length() - 1 - i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static int boxSeq(int step){
        int odd = step / 2 + (step % 2); // 5 / 2  + 1 = 2 + 1 = 3    1 2 3 4 5
        int even = step / 2; // 5 / 2 = 2

        return odd * 3 - even;
    }


    public static void main(String[] args) {

        System.out.println(repeat("Hello", 3));
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));
        System.out.println(getDecimalPlaces("400.233"));
        System.out.println(Fibonacci(12));
        System.out.println(isValid("59012"));
        System.out.println(isStrangePair(" ", " "));
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(boxSeq(1));

    }
}
