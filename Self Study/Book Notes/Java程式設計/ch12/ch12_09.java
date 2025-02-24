/*  檔名:ch12_09.java          功能:複製檔案  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_09         //主類別
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        byte byteData[] = new byte[1];
        FileInputStream fi = new FileInputStream("c:\\myJava\\ch12\\file\\pic1.jpg");
        FileOutputStream fo = new FileOutputStream("c:\\myJava\\ch12\\file\\pic2.jpg");
        int fileSize = fi.available();
        int num;        
        while((num = fi.read(byteData)) !=-1) //使用迴圈逐一複製每一個位元組
             fo.write(byteData);        
        System.out.println("檔案大小=" + fileSize + "位元組複製完畢");
        fi.close();       //關檔
        fo.close();       //關檔
    } 
}