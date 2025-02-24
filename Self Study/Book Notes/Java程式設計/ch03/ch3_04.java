/*   檔名:ch3_04.java   功能:比較運算子與邏輯運算子範例   */

package myJava.ch03;
import java.lang.*;

public class ch3_04         //主類別
{
  public static void main(String args[])
  {
      int x=10,y=20;
      boolean a=true,b=false;
      
      System.out.print(" x=" + x);
      System.out.println(" y=" + y);
      System.out.println("---------------");
      System.out.println("x==y ==> " + (x==y));
      System.out.println("x!=y ==> " + (x!=y));
      System.out.println("x>y  ==> " + (x>y));
      System.out.println("x<y  ==> " + (x<y));
      System.out.println("x>=y ==> " + (x>=y));
      System.out.println("x<=y ==> " + (x<=y));
      System.out.println("====================");
      System.out.print(" a=" + a);
      System.out.println(" b=" + b);
      System.out.println("---------------");
      System.out.println("not a    ==> " + !a);
      System.out.println("a and b  ==> " + (a && b));
      System.out.println("a or b   ==> " + (a || b));
      System.out.println("a nand b ==> " + !(a && b));
      System.out.println("a nor b  ==> " + !(a || b));
      System.out.println("a and (x<y) ==> " + (a && (x<y)));        
  }
}