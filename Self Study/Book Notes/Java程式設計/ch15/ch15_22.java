/*  檔名:ch15_22.java          功能:lambda運算式與forEach方法  */

package myJava.ch15;
import java.lang.*;
import java.util.*;      //使用Collections Framework的類別需載入

public class ch15_22       //主類別
{
    public static int sum = 0;
    public static void main(String args[])
    {
        HashSet<Integer> objHS = new HashSet<Integer>();
        objHS.add(7);     objHS.add(6);
        objHS.add(3);    objHS.add(5);

        System.out.print("HashSet集合:");
        objHS.forEach(obj ->  System.out.print(obj + "\t"));
        System.out.println();
        objHS.forEach((obj) -> 
                       {
                          sum = sum + obj;
                       });

        System.out.println("集合內元素和:" + sum);
    }  
}