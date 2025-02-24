/*   檔名:ch12_01.java          功能:以字元串流讀取文字檔  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_01         //主類別
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        char cbuf[] = new char[256];
        FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt");
        
        int num = fr.read(cbuf);     //讀取最多256個字元到cbuf陣列中
        String str1 = new String(cbuf,0,num);  //字元陣列轉換為字串
        System.out.println("總共讀取" + num + "個字元數");
        System.out.println("檔案內容如下");
        System.out.println(str1); 
        fr.close();       //關檔
    } 
}   
