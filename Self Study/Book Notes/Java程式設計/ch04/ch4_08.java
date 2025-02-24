/*  郎:ch4_08.java    :else-ifΑ絤策   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_08         //摸
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Score;
     
      System.out.print("叫块璸阀Θ罿:");
      Score = Integer.parseInt(keyboardInput.nextLine());
      if(Score<60) { System.out.println("だ计单单"); }
      else if(Score<=69) { System.out.println("だ计单单"); }
      else if(Score<=79) { System.out.println("だ计单单"); }
      else if(Score<=89) { System.out.println("だ计单ヒ单"); }
      else if(Score<=99) { System.out.println("だ计单纔单"); }
      else if(Score==100) { System.out.println("Чだ计"); }
      else { System.out.println("眤块ぃ猭だ计"); }
    }
}