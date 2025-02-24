/*   檔名:ch10_01.java          功能:發生例外狀況的範例  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_01         //主類別
{
    public static void main(String args[])
    {
     	fraction obj = new fraction();
     	obj.set_value();
     	obj.print_value();        
    } 
}    

class fraction
{
    private Scanner keyboardInput;
    private int numerator;        //分子
    private int denominator;      //分母
    
    public fraction(){ keyboardInput = new Scanner(System.in); }
    
    public void set_value()
    {
     	System.out.print("輸入分子:");
     	numerator = Integer.parseInt(keyboardInput.nextLine());   
     	System.out.print("輸入分母:");
     	denominator = Integer.parseInt(keyboardInput.nextLine());         
    }
    public void print_value()
    {
     	System.out.print(numerator + "/" + denominator + "=");
     	System.out.println(numerator/denominator);
    }
}