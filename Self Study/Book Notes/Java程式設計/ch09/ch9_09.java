/*   檔名:ch9_09.java         功能:繼承多個介面改寫衝突的預設方法  */

package myJava.ch09;
import java.lang.*;

public class ch9_09         //主類別
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

interface IZ extends IX,IY
{
   public default void show()       //一定要改寫show()方法，否則就要將之再宣告為抽象方法
   {
         IY.super.show();
   } 
}

class CA implements IZ  //實作IZ
{     
}