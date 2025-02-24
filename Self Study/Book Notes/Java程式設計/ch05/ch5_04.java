/*   檔名:ch5_04.java        功能:二維陣列的練習   */

package myJava.ch05;
import java.lang.*;

public class ch5_04         //主類別
{
    public static void main(String args[])
    {
       // 宣告二維陣列m[9][9]，共有81個元素，從m[0][0]~m[8][8]
       int m[][] = new int[9][9];
 
       for(int i=1;i<=9;i++)
          for(int j=1;j<=9;j++)
             m[i-1][j-1] = i * j;   // 將九九乘法的結果存入二維陣列中
       
       for(int i=1;i<=9;i++)
       {
          for(int j=1;j<=9;j++)
             System.out.print(i + "*" + j + "=" + m[i-1][j-1] + "\t");
          System.out.println();
       }
    }
}
