/*   檔名:ch8_14.java       功能:抽象類別的多層繼承   */

package myJava.ch08;
import java.lang.*;

public class ch8_14         //主類別
{
    public static void main(String args[])
    {       	   	
        CMyRect obj = new CMyRect(5.0,15.0);    		
        obj.computeArea();       //計算面積        
        obj.show();       
    } 
}    

abstract class CShape   //定義抽象類別
{
    protected double area;
    
    public abstract void show();        //宣告抽象方法
    public abstract void computeArea(); //宣告抽象方法
}

abstract class CRect extends CShape
{   //子類別CRect繼承自類別CShape，但未完全實作全部的抽象方法，故仍為抽象類別
    protected double length,width;
    public CRect(double i,double j){ length = i; width = j; }
    @Override public void computeArea()   //改寫，實作computeArea()
    {
        area = length * width;
    }    
}

class CMyRect extends CRect   // 子類別CMyRect繼承自類別CRect
{
    public CMyRect(double i,double j)
    {
        super(i,j);
    }
    @Override public void show()          //改寫，實作show()函式
    {
        System.out.println("矩形area=" + area);          	
    }
}

