/*  檔名:ch7_07.java      功能:傳遞物件與接收物件  */

package myJava.ch07;
import java.lang.*;

public class ch7_07         //主類別
{
    public static void main(String args[])
    {
         CVector2 i = new CVector2();
         i.set(20,40);
         CVector2 j = new CVector2();
         j.set(15,45);
         CVector2 k;     //k是CVector2物件變數,在第16行用來接收回傳值
         CMyClass X = new CMyClass();
         k = X.sum(i,j);
         System.out.println("Vector i=(" + i.x + "," + i.y + ")");
         System.out.println("Vector j=(" + j.x + "," + j.y + ")"); 
         System.out.println("Vector k=i+j=(" + k.x + "," + k.y + ")");
    } 
}    

class CMyClass
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }
        
    public CVector2 sum(CVector2 a,CVector2 b)//二維向量的加法成員函式
    {
        CVector2 tempVector = new CVector2();
        tempVector.x = a.x + b.x;
        tempVector.y = a.y + b.y;
        return tempVector;
    }
}

class CVector2                      //二維向量類別
{
  public int x,y;               //二維向量的兩項元素資料
  public void set(int m,int n)  //用於設定二維向量的兩項元素資料
  {
        x = m;
        y = n;      
  }
}
