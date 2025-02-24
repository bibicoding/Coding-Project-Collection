/*  檔名:ch9_03.java          功能:介面預設方法與繼承類別的衝突  */

package myJava.ch09;
import java.lang.*;

public class ch9_03         //主類別
{
    public static void main(String args[])
    {
        CCircle1 obj1 = new CCircle1(5.0);
        CCircle2 obj2 = new CCircle2(5.0);
        CCircle3 obj3 = new CCircle3(5.0);
        obj1.computeArea();
        obj1.show();  
        obj2.computeArea();
        obj2.show();       
        obj3.computeArea();
        obj3.show();
    } 
}    

interface ICircle        //定義介面
{
    public static final double pi=3.14;  //宣告field
    public abstract void computeArea();  //宣告method
    public default void show()       //宣告預設method
    {
        System.out.println("pi=" + pi);   
    }    
}

class CShape
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}

class CCircle1 implements ICircle   //實作介面
{   
   protected double radius;
   protected double area;
   public CCircle1(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}

class CCircle2 extends CShape implements ICircle   //繼承並實作介面
{   
   protected double radius;
   public CCircle2(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}

class CCircle3 extends CShape implements ICircle   //繼承並實作介面
{   
   protected double radius;
   public CCircle3(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }
   @Override public void show()
   {
        System.out.println("radius=" + radius + " area=" +area);
   }
}