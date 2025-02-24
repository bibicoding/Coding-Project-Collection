/*   檔名:ch9_14.java     功能:介面參數與介面回傳值   */

package myJava.ch09;
import java.lang.*;

public class ch9_14         //主類別
{
    public static void main(String args[])
    {
         CA objCA = new CA();       //objCA為CA類別的物件
         CB objCB = new CB();       //objCB為CB類別的物件
         //--------------------------------------------------------
         objCB.show3(objCA);        //把CA類別的物件當作引數傳入
         //--------------------------------------------------------
         objCA=(CA)objCB.set(10);   //由於回傳值被宣告為介面，因此需要轉型
         System.out.println("objCA的欄位varB=" + objCA.varB);
    } 
}    

interface IA              //定義介面
{    
    public static final int varA=5;
    public abstract void show1();    
}

class CA implements IA   // 類別CA實作界面IA
{
    public int varB;
    public CA()      { varB = 0; } //建構子
    public CA(int i) { varB = i; } //建構子
    @Override public void show1()
    {
         System.out.println("This is CA's show1()");
    }
    public void show2()
    {
         System.out.println("This is CA's show2()");
    }
}

class CB
{
    public void show3(IA obj)     //參數被宣告為介面型態
    {
         System.out.println("傳入之物件的varA欄位為" + obj.varA);
         obj.show1();
         //obj.show2(); // 此行不合法，obj被宣告為IA介面，不可執行介面未宣告的method
    } 
    public IA set(int i)     //回傳值被宣告為介面型態IA
    {
         CA obj = new CA(i);
         return obj; //回傳的是CA類別的物件，而CA實作了IA，故不須轉型
    }       
}