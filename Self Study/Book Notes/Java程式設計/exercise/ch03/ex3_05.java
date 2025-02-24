package myJava.exercise.ch03;
import java.lang.*;

public class ex3_05
{
      public static void main(String args[])
      {
         int a=3,b=4,c=5;
         a+=b*++c;
        
         System.out.println("a=" + a);
         System.out.println("b=" + b);
         System.out.println("c=" + c);
      }
}