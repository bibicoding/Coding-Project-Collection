/*  檔名:ch12_06.java          功能:複製文字檔  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_06         //主類別
{
    public static void main(String args[]) 
                       throws IOException,FileNotFoundException 
    {
        char cbuf[] = new char[1];
        FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt");
        FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text3.txt");
        int num;
        String str1;
        while((num = fr.read(cbuf)) !=-1) //使用迴圈逐一複製文字檔內容
              fw.write(cbuf);        
        fr.close();       //關檔
        fw.close();       //關檔
    } 
}