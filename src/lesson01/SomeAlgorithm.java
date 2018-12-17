package lesson01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SomeAlgorithm {
    public static void main(String[] args) {
        doAlgorithm(new Scanner(System.in).next());
    }
    static char[] shift(char[] arr, int n) {
        char[] charr = arr;
        for (int i = 0; i < n; i++) {
            char first = charr[0];
            for (int j = 0; j < charr.length-1; j++) {
                charr[j] = charr[j+1];
            }
            charr[charr.length-1] = first;
        }
        return charr;
    }
    static String[] getShiftedArrays(String str) {
        String[] strings = new String[str.length()];
        for (int i = 0; i < str.length(); i++)
            strings[i] = new String(shift(str.toCharArray(), i));
        return strings;
    }
    static void doAlgorithm(String string) {
        String[] strings = getShiftedArrays(string);
        Arrays.sort(strings);
        int number = 0;
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i].toCharArray()[strings[i].length()-1]);
            if (strings[i].equals(string)) number = i+1;
        }
        System.out.print("\n"+number);
    }
}
