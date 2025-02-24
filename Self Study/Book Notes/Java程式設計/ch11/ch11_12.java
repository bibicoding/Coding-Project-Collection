/*  檔名:ch11_12.java        功能:String字串的函式練習  */

package myJava.ch11;
import java.lang.*;

public class ch11_12         //主類別
{
 public static void main(String args[])
 {
    String str = "中文字串測試";
    String str1 = "This is a book"; 
    String str2;
    System.out.println("字串[" + str + "]共有" + str.length() + "個字元");
    System.out.println("字串[" + str1 + "]共有" + str1.length() + "個字元");
    System.out.println("字串的字首為is==>" + str1.startsWith("is"));
    System.out.println("轉換為大寫字元=>" + str1.toUpperCase());
    System.out.println("在字元陣列中第[5]個字元為=>" + str1.charAt(5));
        
    str2=str1.substring(5);
    System.out.println("第[5]個字元之後的子字串為" + str2);
    System.out.println("子字串的字首為is==>" + str2.startsWith("is"));
 } 
}