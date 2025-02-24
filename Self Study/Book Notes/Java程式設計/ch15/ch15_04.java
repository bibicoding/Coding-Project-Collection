/*  檔名:ch15_04.java  功能:透過外部類別的建構子存取內部類別的成員  */

package myJava.ch15;
import java.lang.*;

public class ch15_04        //主類別
{
    public static void main(String args[])
    {
        ch15_04 obj = new ch15_04(); //建立主類別的物件實體,會自動呼叫建構子
        obj.objInner.innerVar=50;    //存取內部類別物件實體成員
        obj.objInner.innerShow();    //呼叫內部類別物件實體成員  
    }
    public ch15_04()            //在建構子內產生內部類別的物件實體
    {
        objInner = new CMyInnerClass();
    }
    public CMyInnerClass objInner;  //objInner是外部類別的一個欄位(field)
    class CMyInnerClass  //不必被宣告為ststic
    {
        public int innerVar;
        public CMyInnerClass(){innerVar=20;}
        public void innerShow()
        {
            System.out.println("內部類別函式執行中 innerVar=" +innerVar); 
        }
    } 
}