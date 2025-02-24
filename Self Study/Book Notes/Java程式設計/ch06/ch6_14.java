/*  檔名:ch6_14.java       功能:sort與binarySearch方法   */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;          //sort與binarySearch隸屬於該類別



public class ch6_14         //主類別
{
    public static void main(String args[])
    {
        int workArr[]={43,23,67,27,39,15,39,37,57,26,14};
        int findNum,location;
        Scanner keyboardInput = new Scanner(System.in);
 
        Arrays.sort(workArr);                      //對陣列排序
        System.out.print("請輸入您要找的數值:");
        findNum = Integer.parseInt(keyboardInput.nextLine());
        location = Arrays.binarySearch(workArr,findNum); //對陣列進行二分搜尋
        if(location<0)
           System.out.println("在陣列中找不到要找的數值");
        else
           System.out.println("數值存在於陣列中");
    }   
}