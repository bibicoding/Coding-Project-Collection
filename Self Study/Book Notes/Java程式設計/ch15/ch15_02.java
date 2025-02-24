/*  檔名:ch15_02.java          功能:外部類別存取內部類別成員  */

package myJava.ch15;
import java.lang.*;

public class ch15_02        //主類別
{
    public static void main(String args[])
    {
        CMyOutClass outY = new CMyOutClass(); //宣告並產生外部類別物件
        
        outY.outShow("第12行的呼叫");
        outY.changeInnerVar("第13行的呼叫");  
    } 
}       

class CMyOutClass
{
    class CMyInnerClass  //內部類別的定義
    {
        public int innerVar;
        public CMyInnerClass(){innerVar=20;}//內部類別的建構子
        public void innerShow()
        {
            System.out.println("run內部類別函式執行中 innerVar=" + innerVar); 
        }
    }
    
    public int outVar;
    public CMyOutClass(){outVar=10;}   //外部類別的建構子
    public void outShow(String str)
    {
        System.out.println(str +",run外部類別函式 outVar=" + outVar);
        //innerVar=0;        //錯誤的敘述,因為沒有內部類別的物件實體
    }    
    public CMyInnerClass objInner;  //以內部類別作為資料型態宣告物件變數
    public void changeInnerVar(String str)
    {
        objInner = new CMyInnerClass();  //產生內部類別的物件實體
        System.out.print(str);
        System.out.println(",run外部類別函式,準備修改內部類別物件實體的資料");
        //因為有內部類別的物件objInner的實體,所以可讀取內部類別的成員
        objInner.innerVar=50;//正確的敘述
        objInner.innerShow();//呼叫內部類別的成員函式
    }    
}