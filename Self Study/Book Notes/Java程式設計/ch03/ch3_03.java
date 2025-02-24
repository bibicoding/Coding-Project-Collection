/*  檔名:ch3_03.java    功能:算術運算子範例   */

package myJava.ch03;
import java.lang.*;

public class ch3_03         //主類別
{
  public static void main(String args[])
  {
    float answer;
    float a=2.1f,b=3.5f,c=4.0f;
    int x,y;
    x = 20;
    y = 7;
    System.out.print("當x=" + x + "    ");
    System.out.println("y=" + y + "時");
    System.out.println("x + y = " + (x+y));
    System.out.println("x - y = " + (x-y));
    System.out.println("x * y = " + (x*y));
    System.out.println("x / y = " + (x/y));  // y不可為0
    System.out.println("x % y = " + (x%y));  // y不可為0
    System.out.println("----------------------");
    System.out.print("當a=" + a + "   ");
    System.out.print("b=" + b + "   ");
    System.out.println("c" + c + "時");
    answer = b*b-4*a*c;
    System.out.println("b^2-4ac=" + answer);
  }
}