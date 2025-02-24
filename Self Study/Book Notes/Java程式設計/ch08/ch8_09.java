/*   檔名:ch8_09.java        功能:final在不同位置的修飾用途   */

package myJava.ch08;
import java.lang.*;

public class ch8_09         //主類別
{
    public static void main(String args[])
    {
        final String str = new String ("final修飾字的示範");
        //str = new String(".....");
        System.out.println(str);
        CB obj = new CB();    	
        obj.add();
        obj.show();    //執行繼承自父類別的show()
    } 
}    

class CA
{
    public final int var1;
    public int var2;
    public CA()
    {
        var1 = 10;
        var2 = 10;
    }
    public void add()
    {
        //var1++; 
        var2++;
    }
    public final void show()   //不可被改寫的函式
    {
      	System.out.println("var1=" + var1 + "\tvar2=" + var2);
    }    
}

class CB extends CA   // 子類別CB繼承自類別CA
{
    public void add()
    {
        //var1 = var1 + 10;
        var2 = var1 + var2;
    }
    //public void show(){}    
}

final class CC  //類別不可被繼承
{
    public int var3;
}

//class CD extends CC{}  
