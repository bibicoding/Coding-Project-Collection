/*   檔名:ch5_08.java     功能:對陣列排序    */

package myJava.ch05;
import java.lang.*;
import java.util.Arrays;   //引入Arrays類別

public class ch5_08         //主類別
{
    public static void main(String args[])
    {
       int x[]={25,10,39,40,33,12};
       int spec=11;
         
       Arrays.sort(x);
       for(int num : x)
            System.out.print(num+ "\t");
       System.out.println("\n特別號\t" + spec); 
    }
}