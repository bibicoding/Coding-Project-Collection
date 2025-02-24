/*   檔名:ch9_16.java          功能:instanceof運算子   */

package myJava.ch09;
import java.lang.*;

public class ch9_16         //主類別
{
    public static void main(String args[])
    {
        CA objA = new CA();       //obj1為CA類別的物件
        CB objB = new CB();       //obj2為CB類別的物件
        CC objC = new CC();       //obj2為CB類別的物件
    	//----------------------------------------------------------
        if (objA instanceof CA)
            System.out.println("objA擁有一份CA類別的實體");
        if (objB instanceof CA)
            System.out.println("objB擁有一份CA類別的實體");
        if (objC instanceof CA)
            System.out.println("objC擁有一份CA類別的實體");
        if (objA instanceof CC)                       //為false
            System.out.println("objA擁有一份CC類別的實體");    	    
        if (objB instanceof IA)
            System.out.println("objB擁有一份IA介面的實作實體");
    } 
}    

interface IA              //定義介面
{    
    public static final int var1=5;
}

class CA implements IA   // 類別CA實作界面IA
{
    public int var2;    
}

class CB extends CA   // 類別CB繼承CA
{
    public int var3;    
}

class CC extends CB   // 類別CC繼承CB
{
    public int var4;    
}
