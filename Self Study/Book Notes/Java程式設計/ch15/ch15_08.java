/*  檔名:ch15_08.java          功能:匿名類別的限制  */

package myJava.ch15;
import java.lang.*;

public class ch15_08       //主類別
{
   public static void main(String args[])
   {
      CB objX = new CB(); 
      objX.runMehtod1();
   } 
}       

class CA  //類別定義
{
   public int Var;
   public CA(){Var=20;}     
}

class CB
{ 
   public int Var1=5;

   public void runMehtod1()
   { 
      int localVar1=100;           //非final變數
      final int localVar2=100;     //final變數
       
      ( new CA()  //匿名類別開始
        {
            public int a=10;
            //public static int b=10;//  不能宣告static變數
            public void show()
            {
                  System.out.println("這是由匿名類別新增的show函式");
                  System.out.println("Var1=" + Var1);  //讀取外部類別成員
                  System.out.println("a=" + a);
                  System.out.println(localVar1);    //SE7無法讀取非final變數
                  //localVar1++;
                  System.out.println("localVar2=" + localVar2);
     	   }
        } ).show();     //執行新增的show函式       
   }  
}