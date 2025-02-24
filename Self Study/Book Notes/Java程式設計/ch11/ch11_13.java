/*  檔名:ch11_13.java          功能:StringBuffer字串的函式練習  */

package myJava.ch11;
import java.lang.*;

public class ch11_13         //主類別
{
 public static void main(String args[])
 {
    StringBuffer strBuf = new StringBuffer("中文字串測試");
    StringBuffer strBuf1 = new StringBuffer("This is a book!");
    System.out.print("字串[" + strBuf + "]共有");
    System.out.println(strBuf.length() + "個字元");
    StringBuffer strBuf2 = strBuf.reverse(); //strBuf與strBuf2指向同一物件
    System.out.println("strBuf字串容量為" + strBuf.capacity() + "個字元");
    System.out.println("strBuf反轉後為[" + strBuf +"]");
    strBuf.setCharAt(3,'t');      
    System.out.println("strBuf2為[" + strBuf2 +"]");
  
    System.out.print("strBuf1原始字串內容為" + strBuf1);
    System.out.println("長度為" + strBuf1.length());
    strBuf1.replace(10,14,"pen");     //修正第10~13個字元為pen
    System.out.print("strBuf1更改後其內容為" + strBuf1);
    System.out.println("長度為" + strBuf1.length());  
 } 
}