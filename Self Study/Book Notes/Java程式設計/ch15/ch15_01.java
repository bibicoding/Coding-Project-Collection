/*  檔名:ch15_01.java          功能:外部程式存取內部類別  */

package myJava.ch15;
import java.lang.*;

public class ch15_01        //主類別
{
    public static void main(String args[])
    {
        //宣告並產生內部類別物件
        CMyOutClass.CMyInnerClass innerX = (new CMyOutClass(10)).new CMyInnerClass(20);
      
        CMyOutClass outY = new CMyOutClass(100); //宣告並產生外部類別物件
        //這樣也可以產生內部類別的物件
        CMyOutClass.CMyInnerClass innerY = outY.new CMyInnerClass(200);  
   
        innerX.innerShow("第17行的呼叫");
        innerY.innerShow("第18行的呼叫");        
    } 
}       

class CMyOutClass
{
    private int outVar;
    public CMyOutClass(){}                 //外部類別的建構子
    public CMyOutClass(int i){outVar=i;}   //外部類別的建構子 
    class CMyInnerClass  //內部類別的定義
    {
        private int innerVar;
        public CMyInnerClass(){}                //內部類別的建構子
        public CMyInnerClass(int i){innerVar=i;}//內部類別的建構子
        public void innerShow(String str)
        {      
        //可讀取外部類別的成員
            System.out.println(str + ",run內部類別函式 outVar=" + outVar);
            System.out.println(str + ",run內部類別函式 innerVar=" + innerVar);
        }    
    }      
}