/*   檔名:ch6_13.java      功能:二分搜尋法  */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;

public class ch6_13         //主類別
{
    public static void main(String args[])
    {
        int workArr[]={33,41,52,54,63,74,79,86};
        int findNum,location;
        Scanner keyboardInput = new Scanner(System.in);
 
        System.out.print("請輸入您要找的數值:");
        findNum = Integer.parseInt(keyboardInput.nextLine());
        location = binarySearch(workArr,findNum);
        if(location==-1)
           System.out.println("在陣列中找不到要找的數值");
        else
           System.out.println("數值" + findNum + "位於work[" + location + "]");
    }
    
    public static int binarySearch(int[] x,int k)
    {
        int left,right,middle;
        left = 0;
        right = x.length-1;

        while(left<=right)
        {
           middle = (left + right) / 2;
           if(k==x[middle])  return middle;
           if(k>x[middle])   left = middle + 1;    // 放棄左半部
           else              right = middle - 1;   // 放棄右半部
        }
        return -1;
    }
}