package myJava.exercise.ch15;
import java.lang.*;

public class ex15_03         //主類別
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
             String str1 = new String();
    	     
    	     Runnable Soup = new Runnable(){    //匿名類別
    	       
    	     };

    	     Runnable Salad = new Runnable(){    //匿名類別 
    	       
    	     };

    	     Runnable Entree = new Runnable(){    //匿名類別          
    	       
    	     };

    	     Runnable Dessert = new Runnable(){    //匿名類別          
    	       
    	     }; 
	     
    	     Thread obj1 = new Thread(Soup);
    	     Thread obj2 = new Thread(Salad);
    	     Thread obj3 = new Thread(Entree);
    	     Thread obj4 = new Thread(Dessert);
             obj1.start(); 
    	     obj2.start(); 
    	     obj3.start();  
    	     obj4.start();  
   }
}

    

