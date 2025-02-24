/*  檔名:ch12_02.java          功能:使用迴圈讀取文字檔的全部內容  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_02         //主類別
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        char cbuf[] = new char[16];
        FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt");
        int num;
        String str1;
        while((num = fr.read(cbuf)) !=-1) //使用迴圈讀取文字檔的全部內容
        {
            str1 = new String(cbuf,0,num);  //字元陣列轉換為字串
            System.out.println("總共讀取" + num + "字元數");
            System.out.println(str1); 
            System.out.println("-----------------------");
        }
        fr.close();       //關檔
    } 
}   
