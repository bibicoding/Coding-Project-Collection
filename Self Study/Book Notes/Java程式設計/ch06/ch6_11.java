/*   檔名:ch6_11.java       功能:回傳陣列   */

package myJava.ch06;
import java.lang.*;

public class ch6_11         //主類別
{
    public static void main(String args[])
    {
        int lottos[];
       
        lottos = generate_lottos();
        System.out.println("樂透號碼如下.....");
        for(int num : lottos)
            System.out.print(num + "\t");
    }
    
    public static int[] generate_lottos()
    {
       int arr[]=new int[6];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]= (int)((Math.random()*49)+1);
           System.out.println("第" + (i+1) + "個隨機亂數為" + arr[i]);
       }
       return arr;
    }
}