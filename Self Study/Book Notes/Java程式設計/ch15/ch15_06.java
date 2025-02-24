/*  檔名:ch15_06.java          功能:匿名類別  */

package myJava.ch15;
import java.lang.*;

public class ch15_06        //主類別
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
    public void show1()
    {
        System.out.println("類別CA的show1執行中,Var=" + Var); 
    }
    public void show2()
    {
        System.out.println("類別CA的show2執行中,Var=" + Var);
    }
}

class CB
{ 
    public void runMehtod1()
    {     
        //匿名類別開始
        CA obj1 = new CA() 
        {
            public void show1()
            {
                System.out.print("這是由匿名類別改寫的show1函式");
                System.out.println(",Var=" + Var);
            }
            public void show3()
            {
                System.out.print("這是由匿名類別新增的show3函式");
                System.out.println(",Var=" + Var);
            }
        };  //匿名類別結束
     
        obj1.Var=50;
        obj1.show1();     
        obj1.show2();
        //obj1.show3();  //無法執行新增的show3函式
        
        CA obj2 = new CA();
        System.out.println("---------------------------------");
        obj2.Var=30;
        obj2.show1();     
        obj2.show2();
        //obj2.show3(); //無法執行新增的show3函式   
    }  
}