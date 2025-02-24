/*   檔名:ch5_03.java       功能:陣列與排序    */

package myJava.ch05;
import java.lang.*;

public class ch5_03         //主類別
{
    public static void main(String args[])
    {
       int x[] = {25,10,39,40,33,12};
       int spec=11;
       int k,times,temp;
  
       k = x.length-1;   //x.length=6 ,代表 6球
       while(k!=0)
       { 
          times = 0;
          for(int i=0;i<=k-1;i++)
          {
             if(x[i]>x[i+1])
             {
              temp = x[i]; x[i] = x[i+1]; x[i+1] = temp;  // x[i]<->x[i+1]
              times = i;
             }
          }
          k = times;
       }
       for(int num : x)         //使用foreach語法蜜糖
            System.out.print(num+ "\t");
       System.out.println("\n特別號\t" + spec);   
    }
}