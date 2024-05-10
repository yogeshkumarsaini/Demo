import java.util.Arrays;
import java.util.Scanner;

import Day7.Array;

public class StringMethod{
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // String s1=new String("hello");
    // String s2=new String("Hello");
    // String s3="hello";
    // System.out.println(s1==s2);
    // System.out.println(s1.equalsIgnoreCase(s2));
    // System.out.println(s1.intern()==s3);
    // System.out.println(s1==s3);
    // String s4=s3.replace('e', 'a');
    //System.out.println(s4);
   // System.out.println(s4+="employee");
    // s4+=" employee";
    // System.out.println(s4);
    // System.out.println(s4.charAt(6));

// String s5="  Hello World  ";
// String s6=s5.trim();
// System.out.println(s6);

// String s3=" Hello ***** World!";
// String s=s3.replace("*", "");
// System.out.println(s);
// String s4[] =s3.split(" ");
// System.out.println(Arrays.toString(s4));

// String s2="    Hello World   ";
// System.out.println(s2.strip());
// String s="";
// System.out.println(s.isEmpty());
// System.out.println(s.isBlank());

    StringBuilder sb=new StringBuilder("Hello");
    sb.append(" world");
    // System.out.println(sb);
    // sb.delete(2, 7);
    // System.out.println(sb);
    // sb.insert(5, 'v');
    // System.out.println(sb);
    // sb.reverse();
    // System.out.println(sb);
    sb.setLength(15);
    System.out.println(sb);
    System.out.println(sb.capacity());

}

}