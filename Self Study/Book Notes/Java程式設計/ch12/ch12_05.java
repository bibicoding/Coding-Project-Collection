/*  檔名:ch12_05.java          功能:加入文字在文字檔後方  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_05         //主類別
{
  public static void main(String args[]) throws IOException 
  {
     String str1 = "費氏數列是一個無限數列";
    	
     FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text2.txt",true);
     fw.write('\r');   fw.write('\n');   //寫入換行字元
     fw.write(str1); 
        
     fw.close();       //關檔
  }     
}   
