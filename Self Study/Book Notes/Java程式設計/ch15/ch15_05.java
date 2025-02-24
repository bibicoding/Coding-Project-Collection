/*  檔名:ch15_05.java          功能:區域內部類別  */

package myJava.ch15;
import java.lang.*;

public class ch15_05        //主類別
{
    public static void main(String args[])
    {
        CMyOutClass outX = new CMyOutClass(); //宣告並產生外部類別物件
        outX.runOutClassMehtod1();
      //CMyOutClass.CMyInnerClass innerX = (new CMyOutClass()).new CMyInnerClass();
    } 
}       

class CMyOutClass
{  
    public void runOutClassMehtod1()
    {     
        class CMyInnerClass  //區域內部類別定義
        {
            public int innerVar;
            public CMyInnerClass(){innerVar=20;}
            public void innerShow()
            {
                System.out.println("區域內部類別函式執行中 innerVar=" + innerVar); 
            }
        }
        CMyInnerClass objInner = new CMyInnerClass();
        System.out.println("外部類別函式執行中 innerVar=" + objInner.innerVar);
        objInner.innerVar=50;
        objInner.innerShow();
        System.out.println("外部類別函式執行中 innerVar=" + objInner.innerVar);
    }
    //CMyInnerClass objInner2;   //錯誤,不能宣告區域內部類別的物件變數
    public void runOutClassMehtod2()
    {
        //CMyInnerClass objInner2;  //錯誤,不能宣告非本區域內部類別的物件變數 
    }  
}