/*  檔名:ch12_08.java          功能:使用緩衝區寫入文字檔  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_08         //主類別
{
    public static void main(String args[]) throws IOException 
    {
        String str1 = "費氏數列如下:";
        char endCh[] = {'C','o','n','t','i','n','u','e','.','.','.'};
        int numF;
        FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text4.txt");
        BufferedWriter bufferOut = new BufferedWriter(fw,20);
                
        bufferOut.write(str1); 
        bufferOut.newLine();       //寫入換行字元
        for(int i=1;i<10;i++)
        {
            numF = Fib(i);
            bufferOut.write(numF+" ");   //int與字串連結,會自動轉型為字串
        }
        bufferOut.newLine();       //寫入換行字元
        bufferOut.write(endCh);
        bufferOut.flush();         //重要,請看註解
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
