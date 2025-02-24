package myJava.exercise.ch13;
import java.lang.*;

public class ex13_01         //主類別
{
    public static void main(String args[])
    {    	  
    	     String str1 = new String();
    	     
    	     CDinner Soup = new CDinner("湯");
    	     CDinner Salad = new CDinner("沙拉");
    	     CDinner Entree = new CDinner("主菜");
    	     CDinner Dessert = new CDinner("甜點");    	     
    	     
    	     Soup.start(); 
    	     Salad.start(); 
    	     Entree.start();  
    	     Dessert.start();    	     
    }        
}    

class CDinner 
{                               
    String food;
    public CDinner(String str){ food = str; }    
    
    private void serving()
    {
    	   System.out.println("上菜:" + food);
    }
}