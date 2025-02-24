package myJava.exercise.ch10;
import java.lang.*;
import java.util.Scanner;

public class ex10_02         //主類別
{
    public static void main(String args[])  //請修改 main內容
    {    	  
    	Scanner keyboardInput = new Scanner(System.in);
    	int x,y;
    	
    		   
    	    System.out.print("請輸入x:");
    	    x = Integer.parseInt(keyboardInput.nextLine());
    	    System.out.print("請輸入y:");
    	    y = Integer.parseInt(keyboardInput.nextLine());    	    
    	
    	  
    		
        System.out.println(x + "的 " + y +"次方=" +powerXY(x,y));
    	    
    }
        
    static int powerXY(int x,int y)   //請使用上一題設計完成的method內容
    {
    	
    }    
}    

class CmyException                   //請使用上一題設計完成的類別內容
{
    

}
