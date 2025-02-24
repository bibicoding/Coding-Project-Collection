package myJava.exercise.ch01;
import java.lang.*;
import java.util.Scanner;

public class ex1_02         
{
    public static void main(String args[])  
    {    	  
    	   Scanner keyboardInput = new Scanner(System.in); 
    	   int x;
    	   System.out.print("請輸入x=");
    	   x=Integer.parseInt(keyboardInput.nextLine());    //例外產生處
    	   System.out.println("x的平方為=" + (x*x));             
    }    
}