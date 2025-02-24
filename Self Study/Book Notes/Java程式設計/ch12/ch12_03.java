/*  檔名:ch12_03.java          功能:try-with-resources  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_03         //主類別
{
    public static void main(String args[])
    {
        char cbuf[] = new char[256];
       
        try(FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt"))
        {
           int num = fr.read(cbuf);   //讀取最多256個字元到cbuf陣列中
           String str1 = new String(cbuf,0,num);  //字元陣列轉換為字串
           System.out.println("總共讀取" + num + "個字元數");
           System.out.println("檔案內容如下");
           System.out.println(str1); 
           fr.close();       //關檔
        }
        catch(FileNotFoundException e)
        {
            System.out.println("例外發生:找不到該檔案");
        }
        catch(final IOException e)
        {
            System.out.println("例外發生:檔案存取錯誤");
        }        
    } 
}   
