/*  檔名:ch9_04.java          功能:介面靜態方法的共用及無法改寫  */

package myJava.ch09;
import java.lang.*;

public class ch9_04         //主類別
{
    public static void main(String args[])
    {
        CCircle1 obj1 = new CCircle1();       
        CCircle2 obj2 = new CCircle2();       
        obj1.show();            //執行的是實體方法show
        ICircle.show();         //執行的是ICircle介面的靜態方法show
        CCircle2.show();        //執行的是CCircle2類別的靜態方法show        
    } 
}    

interface ICircle        //定義介面
{
    public static void show()            //宣告介面的靜態方法show()
    {
        System.out.println("介面的靜態方法");   
    }     
}

class CCircle1 implements ICircle   //實作介面
{   
   public void show()               //不可以加上@Override 
   {
        System.out.println("show實體方法");
   }   
}

class CCircle2 implements ICircle   //實作介面
{   
   public static void show()       //屬於CCirecle的靜態方法 
   {
        System.out.println("CCircle2類別定義的show");
   }   
}