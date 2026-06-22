package com.bridgelabz.programming;

import java.util.Scanner;

public class CheckTwoStringRotation {
    public static boolean checkRotation(String s1,String s2)
    {
          if(s1.length()==s2.length() && (s1+s2).contains(s2))
          {
              return true;
          }
          else {
              return  false;
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(checkRotation(s1,s2));
    }
}
