/*  檔名:ch5_05.java      功能:二維陣列的練習   */

package myJava.ch05;
import java.lang.*;

public class ch5_05         //主類別
{
    public static void main(String args[])
    {
        double scores[][] = {{85,78,65,0},
                            {75,85,69,0},
                            {63,67,95,0},
                            {94,92,88,0},
                            {74,65,73,0}};
 
        System.out.println("計概\t數學\t英文\t平均");
        System.out.println("==============================");
        for(int i=0;i<5;i++)
        {
          scores[i][3] = (scores[i][0]+scores[i][1]+scores[i][2])/3;
          for(int j=0;j<4;j++)
             System.out.print(scores[i][j] + "\t");
          System.out.println();
        }  
    }
}