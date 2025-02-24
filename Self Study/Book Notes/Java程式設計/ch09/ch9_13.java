/*   檔名:ch9_13.java         功能:類別型態的轉型  */

package myJava.ch09;
import java.lang.*;

public class ch9_13         //主類別
{
    public static void main(String args[])
    {
    	CA obj1;             //宣告父類別型態變數
    	
        obj1 = new CB();     //obj1指向子類別CB物件實體        
        // obj1.show1();      //未轉型不能執行父類別未宣告的show1()
        ((CB)obj1).show1();  //轉型後可執行show1()
        obj1.show2();        //可執行父類別宣告的show2()
        //obj1.show3();      //未轉型不能執行父類別未宣告的show3()
        ((CB)obj1).show3();  //轉型後可執行與show3()
        System.out.println("--------------------");
        CB obj2;             //宣告子類別型態變數
        obj2 = (CB) obj1;    //obj2指向obj1所指物件(需要轉型,不能直接指定)
        obj2.show1();      
        obj2.show2();      
        obj2.show3();           
    } 
}    

interface IA              //定義介面
{    
    public abstract void show1();    
}

abstract class CA         //定義父類別
{
    public void show2()
    {
        System.out.println("This is CA's show2()");
    }  
}

class CB extends CA implements IA   // 類別CB實作界面IA
{
    @Override public void show1()
    {
        System.out.println("This is CB's show1()");
    }
    public void show3()
    {
        System.out.println("This is CB's show3()");
    }
}