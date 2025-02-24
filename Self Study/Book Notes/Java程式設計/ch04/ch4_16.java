/*  檔名:ch4_16.java      功能:for迴圈的示範  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_16         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);                        
        int Sum=0,n;
            
        System.out.print("請輸入N值:");
        n=Integer.parseInt(keyboardInput.nextLine()); 
      
        for(int i=1;((n%2)==1)?(i<=n):(i<=n-1);i++)
            if((i%2)==1)
                Sum = Sum + i;
        if((n%2)==1)
            System.out.println("1+3+...+N=" + Sum);
        else
            System.out.println("1+3+...+N-1=" + Sum);
    }
}