/*   檔名:ch6_12.java       功能:循序搜尋法  */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;

public class ch6_12         //主類別
{
    public static void main(String args[])
    {
        int workArr[]={43,23,67,27,39,15,39,37,57,26,14};
        int findNum,location;
        Scanner keyboardInput = new Scanner(System.in);
 
        System.out.print("請輸入您要找的數值:");
        findNum = Integer.parseInt(keyboardInput.nextLine());
        location = seqSearch(findNum,workArr);
        if(location==-1)
           System.out.println("在陣列中找不到要找的數值");
        else
           System.out.println("數值" + findNum + "位於work[" + location + "]");
    }
    
    public static int seqSearch(int target,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
           if(target == arr[i])       // 找到了
              return i;
        return -1;                  // 完全找不到
    }
}