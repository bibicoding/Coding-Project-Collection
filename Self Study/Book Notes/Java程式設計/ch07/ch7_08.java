/*   檔名:ch7_08.java     功能:物件的傳參考值呼叫   */

package myJava.ch07;
import java.lang.*;

public class ch7_08         //主類別
{
    public static void main(String args[])
    {
         CVector2 i = new CVector2();
         i.set(20,40);
         CVector2 j = new CVector2();
         j.set(15,45);
         System.out.println("-----原始------");         
         System.out.println("Vector i=(" + i.x + "," + i.y + ")");
         System.out.println("Vector j=(" + j.x + "," + j.y + ")");
         CMyClass X = new CMyClass();
         X.swap(i,j);
         System.out.println("-----swap後-------");
         System.out.println("Vector i=(" + i.x + "," + i.y + ")");
         System.out.println("Vector j=(" + j.x + "," + j.y + ")");          
    } 
}    

class CMyClass
{
    public void swap(CVector2 a,CVector2 b)  //互換函式
    {
        CVector2 temp;
        temp = a;
        a = b;
        b = temp;
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