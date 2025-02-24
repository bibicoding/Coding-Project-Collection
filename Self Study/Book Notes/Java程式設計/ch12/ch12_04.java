/*  檔名:ch12_04.java          功能:以字元串流寫入文字檔  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_04         //主類別
{
    public static void main(String args[]) throws IOException 
    {
        String str1 = "費氏數列如下:";
        char endCh[] = {'C','o','n','t','i','n','u','e','.','.','.'};
        int numF;
        FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text2.txt");
        
        fw.write(str1); 
        fw.write('\r');   fw.write('\n');   //寫入換行字元

        for(int i=1;i<10;i++)
        {
            numF = Fib(i);
            fw.write(numF+" ");   //int與字串連結,會自動轉型為字串
        }
        
        fw.write(endCh);        
        fw.close();       //關檔
    } 
    public static int Fib(int n)
    {
        if((n==1) || (n==0))
           return n;
        else
           return Fib(n-1) + Fib(n-2);
    }
}   
