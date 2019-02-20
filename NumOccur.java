import java.io.*;
import java.util.*;
  class NumOccur{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      char c=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==c)
          {
            count++;
          }
        }
      System.out.println(count);
    }
 }
