/*  檔名:ch15_23.java          功能:平行化排序  */

package myJava.ch15;
import java.lang.*;
import java.util.Arrays;      //使用Arrays類別需載入

public class ch15_23       //主類別
{
    public static int sum = 0;
    public static void main(String args[])
    {    
        int[] arr1 = new int[]{42,37,6,15,39,24};
        Arrays.parallelSort(arr1);

        for(int ele : arr1)
           System.out.print(ele + "\t");
    }
}
