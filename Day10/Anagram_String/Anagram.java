package Day10.Anagram_String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1=sc.nextLine();
        System.out.println("Enter the String 2");
        String s2=sc.nextLine();
        if(getAnagram(s1, s2))
            System.out.println("Both are Anagram");
        else
            System.out.println("Both are not Anagram");
        sc.close();
    }
    public static int[] getCount(String s){
        int[] a=new int[26];
        for(int i=0; i<s.length();i++){
           char c= s.charAt(i);
            if(c>=65 && c<=95)
                a[c-65]++;
            else if(c>=97 && c<=122)
                a[c-97]++;
        }
        return a;
    }
    public static boolean getAnagram(String s1, String s2){
        int[] x=getCount(s1);
        int[] y=getCount(s2);
        for(int i=0;i<x.length;i++){
            if(x[i]!=y[i]){
                return false;
            }
        }
        return true;
    }
}
