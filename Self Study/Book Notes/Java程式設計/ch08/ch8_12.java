/*  檔名:ch8_12.java          功能:toString()的改寫  */

package myJava.ch08;
import java.lang.*;

public class ch8_12         //主類別
{
    public static void main(String args[])
    {
        CRect X = new CRect();
        CCircle Y = new CCircle();
        String str = new String();
        str = X.toString();
        System.out.println("CRect類別物件執行toString():\t" + str);
        str = Y.toString();
        System.out.println("CCircle類別物件執行toString():\t" + str);        
    } 
}    

class CRect
{
    private int length,width;    
}

class CCircle
{
    private int radius;
    @Override public String toString()
    {
        return "CCircle類別是用來存放圓形";
    }    
}