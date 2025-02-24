/*  檔名:ch4_13.java       功能:switch-case的字串條件練習  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_13         //主類別
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
     
      System.out.print("請輸入計概等第(中文):");
      switch(keyboardInput.nextLine())
         {
           case "優等":
               System.out.println("英文等第為A");
               break;
           case "甲等":
               System.out.println("英文等第為B");
               break;
           case "乙等":
               System.out.println("英文等第為C");
               break;
           case "丙等":
               System.out.println("英文等第為D");
               break;
           case "丁等":
               System.out.println("英文等第為F");
               break;
           default:
               System.out.println("您輸入了錯誤的等第");
               break;
         }
    }
}