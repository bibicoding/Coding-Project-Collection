/*  郎:ch4_12.java       :switch-case絤策  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_12         //摸
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Score;
     
      System.out.print("叫块璸阀Θ罿:");
      Score=Integer.parseInt(keyboardInput.nextLine());            
      if((Score>=0) && (Score<=100))
         switch(Score / 10)
         {
           case 10:
               System.out.println("Чだ计");
               break;
           case 9:
               System.out.println("だ计单纔单");
               break;
           case 8:
               System.out.println("だ计单ヒ单");
               break;
           case 7:
               System.out.println("だ计单单");
               break;
           case 6:
               System.out.println("だ计单单");
               break;
           default:
               System.out.println("だ计单单");
               break;
         }
    }
}