package myJava.exercise.ch13;
import java.lang.*;

public class ex13_05         //主類別
{
    public static void main(String args[])
    {    	  
    	  CSell.printAll();//訂位前
    	  
    	  CSell objArr[] = new CSell[10];
    	  for(int i=0;i<objArr.length;i++)
    	  {
    	      objArr[i] = new CSell();    	     
    	  }
    	  for(int i=0;i<objArr.length;i++)
    	  {
    	      //objArr[i].start();   //改為多執行緒
    	      objArr[i].toOrder();   //改為多執行緒後請將此設為註解
    	  } 
    	      	  
    	  try  {Thread.sleep((long)(30000*Math.random())); } //sleep模擬其他因素導致Thread被暫停
	  catch(InterruptedException e){}
	  CSell.printAll();//訂位後
    }        
}    

class CSell
{                               
    public static boolean seat[] = new boolean[20];
    
    public CSell()
    {    	   	 
    }    
    
    public static void toOrder() 
    {
         int r=-1;
         do
	 {
	  r = (int)(20*Math.random());
	  if(CSell.seat[r]==false)
	  {	     
	     try  {Thread.sleep((long)(1000*Math.random())); } //sleep模擬其他因素導致Thread被暫停
	     catch(InterruptedException e){}	     
	     CSell.seat[r] = true;	     
	     break;
	  }	 
	 }while(r >=0 && CSell.seat[r]==true);
	 System.out.println("訂票完成,第" + Thread.currentThread().getName() +"櫃檯賣出座位,編號為" + r);  
    }
    
    public static void printAll()
    {
    	for(int i=0;i<20;i++)  //訂位前
    	{
    	      if(CSell.seat[i]==true)
    	         System.out.print("賣出\t");
    	      else
    	         System.out.print("空位\t");    	      
    	} 
    } 
       
}