/*  檔名:ch6_04.java       功能:函式應用   */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;

public class ch6_04         //主類別
{
    public static void main(String args[])
    {
        int m,n;
        long ans;
        Scanner keyboardInput = new Scanner(System.in);
        long temp[]=new long[3];
        
        System.out.println("求排列組合C(m,n)");
        System.out.print("m = ");
        m = Integer.parseInt(keyboardInput.nextLine());
        System.out.print("n = ");
        n = Integer.parseInt(keyboardInput.nextLine());
 
        temp[0] = factorial(m);      //  計算 m! 的值
        temp[1] = factorial(n);      //  計算 n! 的值
        temp[2] = factorial(m-n);    //  計算 (m-n)! 的值
        ans = (temp[0])/(temp[1]*temp[2]);  // C(m,n) = (m!)/(n!*(m-n)!)
        System.out.println("C(" + m + "," + n + ")=" + ans);                        
    }
    
    public static long factorial(int p)  /* 函式定義 */
    {
        long result = 1L;
  
        for(int count=1;count<=p;count++)
            result = result * count;
        return result;
    }
}