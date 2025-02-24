/*   檔名:ch6_10.java        功能:傳參考值呼叫(傳遞陣列)   */

package myJava.ch06;
import java.lang.*;

public class ch6_10         //主類別
{
    public static void main(String args[])
    {
        int lottos[]=new int[6];
       
        generate_lottos(lottos);
        System.out.println("樂透號碼如下.....");
        for(int i=0;i<6;i++)
            System.out.print(lottos[i] + "\t");
    }
    
    public static void generate_lottos(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
       	   arr[i] = (int)((Math.random()*49)+1);
           System.out.println("第" + (i+1) + "個隨機亂數為" + arr[i]);
       }
    }
}