/*  檔名:ch9_05.java          功能:介面靜態方法的共用及無法改寫  */

package myJava.ch09;
import java.lang.*;

public class ch9_05         //主類別
{
    public static void main(String args[])
    {
        CCircle1 obj1 = new CCircle1();       
        CCircle2 obj2 = new CCircle2();       
        obj1.show2();            //執行的是實體方法show2
        obj1.show4();            //執行的是介面預設方法show4 
        //obj2.show2();          //無法執行介面的私有方法show2
        ICircle.show3();         //執行的是ICircle介面的靜態方法show3
        //ICircle.show1();       //無法執行介面的私有靜態方法show1      
    } 
}    

interface ICircle        //定義介面
{
    private static void show1()            //宣告介面的私有靜態方法show1()
    {
        System.out.println("私有靜態方法show1");   
    }     

    private void show2()            //宣告介面的私有方法show2()
    {
        System.out.println("私有方法show2");   
    }     
    
    public static void show3()
    {
        System.out.println("show3執行show1");
        ICircle.show1();
    }

    public default void show4()
    {
        System.out.println("show4執行show2");
        show2();
    }
}

class CCircle1 implements ICircle   //實作介面
{   
   public void show2()               //這不是改寫，不可以加上@Override
   {
        System.out.println("show2實體方法");
   }
}

class CCircle2 implements ICircle   //實作介面
{   
}