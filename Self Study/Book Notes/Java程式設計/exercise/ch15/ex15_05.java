package myJava.exercise.ch15;
import java.lang.*;

public class ex15_05         //主類別
{
    public static void main(String args[])
    {
             X obj = new X();
             obj.go();
    }        
}  



class X
{
   public void go()
   {
             int n=40;    	  
    	     Runnable task1 = new Runnable(){  //匿名類別  //未來要執行的為Recursive版
    	          
            };
    
    	     Runnable task2 = new Runnable(){    //匿名類別  //未來要執行的為Loop版
                  
            };

    	     Runnable task3 = new Runnable(){    //匿名類別  //未來要執行的為Formula版
                  
            };
    	        	     
    	     Thread obj1 = new Thread(task1);
    	     Thread obj2 = new Thread(task2);
    	     Thread obj3 = new Thread(task3);

             obj1.start(); 
    	     obj2.start(); 
    	     obj3.start(); 
   }
}  

class CFib 
{    
    public int FibRecursive(int n)
    {
        
    }

    public int FibLoop(int n)
    {
        
    }
    
    public double FibFormula(int n)
    {
        
    }
}