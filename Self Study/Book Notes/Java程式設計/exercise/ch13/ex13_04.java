package myJava.exercise.ch13;
import java.lang.*;

public class ex13_04         //主類別
{
    public static void main(String args[])
    {    	  
    	     CFib obj1 = new CFib(40,1);  //未來要執行的為Recursive版
    	     CFib obj2 = new CFib(40,2);  //未來要執行的為Loop版
    	     CFib obj3 = new CFib(40,3);  //未來要執行的為Formula版
    	        	     
    	     obj1.start(); 
    	     obj2.start(); 
    	     obj3.start();      	    	     
    }        
}    

