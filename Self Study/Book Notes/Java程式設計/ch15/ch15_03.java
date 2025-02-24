/*  檔名:ch15_03.java          功能:將內部類別多加一層封裝  */

package myJava.ch15;
import java.lang.*;

public class ch15_03        //主類別
{
    public static void main(String args[])
    {
        CMyOutClass outX = new CMyOutClass(); //宣告並產生外部類別物件
        //CMyOutClass.CMyInnerClass innerX = outX.new CMyInnerClass();     
    
        outX.runInnerMethod();  //將產生執行結果第一行的輸出 
        outX.changeInnerVar();  //將改變內部類別物件成員
        outX.printInnerVar();   //將產生執行結果第二行的輸出 
        outX.runInnerMethod();  //將產生執行結果第三行的輸出  
    } 
}       

class CMyOutClass
{
    private class CMyInnerClass  //private等級的內部類別定義
    {
        public int innerVar;
        public CMyInnerClass(){innerVar=20;}
        public void innerShow()
        {
            System.out.println("內部類別函式執行中 innerVar=" + innerVar); 
        }
    }
    
    public CMyInnerClass objInner;  //以內部類別作為資料型態宣告物件變數
    public CMyOutClass()            //外部類別的建構子
    {
        objInner = new CMyInnerClass();  //產生內部類別的物件實體
    }
    public void printInnerVar()
    {
        System.out.println("外部類別函式執行中 innerVar=" + objInner.innerVar);
    } 
  
    public void changeInnerVar()
    {   
        //因為有內部類別的物件objInner的實體,所以可讀取內部類別的成員
        objInner.innerVar=50;  
    }
    public void runInnerMethod()
    {
        //因為有內部類別的物件objInner的實體,所以可執行內部類別的成員	
        objInner.innerShow();//正確的敘述
    }
}