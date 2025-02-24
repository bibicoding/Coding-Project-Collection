/*   檔名:ch9_06.java         功能:實作多個介面  */

package myJava.ch09;
import java.lang.*;

public class ch9_06         //主類別
{
    public static void main(String args[])
    {
        CCircle obj = new CCircle(5.0);
        obj.computeArea();
        obj.show();
        obj.draw(1);        
    } 
}    

interface ICircle        //定義介面
{
    public static final double pi=3.14;  
    public abstract void show();
    public abstract void computeArea();
}

interface IColor        //定義介面
{
    public abstract void draw(int i);
}

class CShape
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}

class CCircle extends CShape implements ICircle,IColor   //實作兩個介面
{   
   protected double radius;
   public CCircle(double i){ radius=i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }
   @Override public void draw(int i)
   {
        if(i==0)      System.out.println("圖形為藍色圓形");
        else if(i==1) System.out.println("圖形為紅色圓形");
        else if(i==2) System.out.println("圖形為綠色圓形");
        else          System.out.println("顏色錯誤");
   }     
}