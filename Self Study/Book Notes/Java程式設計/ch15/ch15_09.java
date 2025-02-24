/*  檔名:ch15_09.java          功能:匿名類別的限制  */

package myJava.ch15;
import java.lang.*;

public class ch15_09       //主類別
{
   public static void main(String args[])
   {
      CB objX = new CB(); 
      objX.runMehtod1();
   } 
}       

class CB
{ 
   public int Var1=5;

   public void runMehtod1()
   { 
      int localVar1=100;           //非final變數
      final int localVar2=100;     //final變數
       
      ( new Object()  //匿名類別開始
        {            
            public void show()
            {
                  System.out.println("這是由匿名類別新增的show函式"); 
                  System.out.println("localVar2=" + localVar2);                
     	    }
        } ).show();     //執行新增的show函式       
   }  
}