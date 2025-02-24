/*   檔名:ch6_15.java        功能:設計樂透開獎遊戲  */

package myJava.ch06;
import java.lang.*;

public class ch6_15         //主類別
{
    public static void main(String args[])
    {
        int special;              //存放特別號
        int lottos[]=new int[6];   //存放六球

        special = generate_lottos(lottos);
        System.out.println("樂透號碼如下.....");
        for(int num : lottos)
           System.out.print(num + "\t");
        System.out.println();
        System.out.println("特別號:" + special);       
    } 
    
    public static int generate_lottos(int[] arr)
    {
        int generateNum;

        for(int i=0;i<arr.length;i++)
        {
          generateNum = (int)((Math.random()*49)+1);
          while (seqSearch(generateNum,arr)!=-1)  //是否與陣列元素重複
          {
            generateNum = (int)((Math.random()*49)+1);
          }
          arr[i] = generateNum;
        }
        generateNum = (int)((Math.random()*49)+1);
        while (seqSearch(generateNum,arr)!=-1)  // 特別號是否與其他號碼重複
        {
           generateNum = (int)((Math.random()*49)+1);
        }
        return generateNum;
    }
    
    public static int seqSearch(int target,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
           if(target == arr[i])       // 找到了
              return i;
        return -1;                  // 完全找不到
    }
}