/*   檔名:ch8_13.java       功能:抽象類別與抽象方法  */

package myJava.ch08;
import java.lang.*;

public class ch8_13         //主類別
{
    public static void main(String args[])
    {   
        //CShape obj =  new CShape(); //錯誤，抽象類別不能產生物件    	
        CRect obj1 = new CRect(5.0,15.0);
        CCircle obj2 = new CCircle(3.0);    	 	
        obj1.computeArea();       //計算面積   
        obj2.computeArea();       //計算面積   
        System.out.print("矩形");
        obj1.show();
        System.out.print("圓形");
        obj2.show();
    } 
}    

abstract class CShape   //定義抽象類別
{
    protected double area;
    
    public void show()
    {
        System.out.println("area=" + area);          	
    }
    public abstract void computeArea(); //宣告抽象方法
}

class CRect extends CShape   // 子類別CRect繼承自類別CShape
{
    protected double length,width;
    public CRect(double i,double j){ length = i; width = j; }
    @Override public void computeArea()   //改寫，實作computeArea()
    {
        area = length * width;
    }    
}

class CCircle extends CShape   // 類別CCircle繼承自類別CShape
{
    protected double radius;
    protected final double pi=3.14;
    public CCircle(double i) { radius = i; }    
    @Override public void computeArea()   //改寫，實作computeArea()
    {
        area = radius * radius * pi;
    }   
}