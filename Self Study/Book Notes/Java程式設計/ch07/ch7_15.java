/*   檔名:ch7_15.java        功能:傳遞物件陣列與物件配置情形   */

package myJava.ch07;
import java.lang.*;

public class ch7_15         //主類別
{
    public static void main(String args[])
    {
        CMyClass X[] = new CMyClass[5];
        for(int i=0;i<X.length;i++)
            X[i] = new CMyClass();
        COtherClass Obj = new COtherClass();
        Obj.show(X);
    } 
}    

class COtherClass
{    
    public void show(CMyClass X[])
    {
        for(int i=0;i<X.length;i++)
            System.out.println("物件X[" + i + "]實體的位址在" + X[i]);
    }
}

class CMyClass
{
    public int VarA;
    private int VarB;
}