package com.bridgelabz.programming;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String s1,String s2)
    {
     s1= s1.replace("//s","").toLowerCase();
     s2=s2.replace("//s","").toLowerCase();
     char[] ch1=s1.toCharArray();
     char[] ch2=s2.toCharArray();
     Arrays.sort(ch1);
     Arrays.sort(ch2);
     return Arrays.equals(ch1,ch2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(checkAnagram(s1,s2));
    }

}
