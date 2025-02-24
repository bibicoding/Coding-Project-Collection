/*  檔名:ch4_21.java        功能:do-while迴圈的示範  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_21         //主類別
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      char inputChar;
      String inputStr=new String();      
     
      System.out.println("Game Over...");
      do
      {
         System.out.print("Play Again?(y/n)");
         inputStr=keyboardInput.nextLine();         //讀取鍵盤輸入的一行字串
         inputChar=inputStr.charAt(0);              //見說明
      }while((inputChar!='y') && (inputChar!='n'));
    }
}