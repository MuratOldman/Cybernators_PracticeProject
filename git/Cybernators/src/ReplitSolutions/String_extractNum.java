package ReplitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class String_extractNum {
    public static void main(String[] args) {
        String s ="!@#123$%^fgt&*hNRS098VB";
        String result = extractNum(s);
        System.out.println(result);
    }
    public static String extractNum(String s) {
        char [] chars = s.toCharArray();
        Character [] arr = new Character[s.length()];
        for (int i=0; i<chars.length; i++){
            arr[i]=chars[i];
        }
        ArrayList<Character> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(x->!Character.isDigit(x));
        Character [] arr2 = new Character[list.size()];
        for (int z=0; z<list.size(); z++){
            arr2[z]=list.get(z);
        }
        char [] chars2 = new char[arr2.length];
        for (int k=0; k<arr2.length; k++){
            chars2[k]=arr2[k];
        }
        String extractNum = new String(chars2);
        return extractNum;
    }
}
