/*   檔名:ch9_07.java         功能:解決多個介面衝突的預設方法  */

package myJava.ch09;
import java.lang.*;

public class ch9_07         //主類別
{
    public static void main(String args[])
    {
        CA obj = new CA();
        obj.show();          
    } 
}    

interface IX        //定義介面
{
    public default void show()
    {
         System.out.println("IX default");
    }
}

interface IY        //定義介面
{
    public default void show()
    {
         System.out.println("IY default");
    }
}

class CA implements IX,IY   //實作兩個介面
{
   public void show()       //一定要改寫show()方法
   {
         IY.super.show();
   }  
}