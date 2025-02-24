/*  檔名:ch15_07.java          功能:執行匿名類別新增的函式  */

package myJava.ch15;
import java.lang.*;

public class ch15_07        //主類別
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
    public void runMehtod1()
    {            
        (new CA()  //匿名類別開始
         {
            public void show()
            {
                System.out.print("這是由匿名類別新增的show函式");
                System.out.println(",Var=" + Var);
            }
         }).show();     //執行新增的show函式       
    }  
}