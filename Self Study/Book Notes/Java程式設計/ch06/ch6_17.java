/*  檔名:ch6_17.java        功能:設計樂透開獎遊戲  */

package myJava.ch06;
import java.lang.*;

public class ch6_17         //主類別
{
    public static void main(String args[])
    {
        int special,balls=6;              //存放特別號
        
        if(args.length>0)
           balls = Integer.parseInt(args[0]);
        if((balls>48)||(balls<0)) return;      //球數錯誤，離開
        int lottos[]=new int[balls];            //存放balls球
        special = generate_lottos(lottos);
        System.out.println("樂透號碼如下.....");
        for(int i=0;i<balls;i++)
        {
           if((i%6==0)&&(i!=0))
               System.out.println();
           System.out.print(lottos[i] + "\t");
        }
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