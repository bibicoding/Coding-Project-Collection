/*  檔名:ch9_02.java          功能:同時繼承類別並實作介面  */

package myJava.ch09;
import java.lang.*;

public class ch9_02         //主類別
{
    public static void main(String args[])
    {
        CCircle obj = new CCircle(5.0);
        obj.computeArea();
        obj.show();        
    } 
}    

interface ICircle        //定義介面
{
    double pi=3.14;     //宣告field
    public void show(); //宣告method
    void computeArea(); //宣告method
}

class CShape
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}

class CCircle extends CShape implements ICircle   //實作介面
{   
   protected double radius;
   public CCircle(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}
