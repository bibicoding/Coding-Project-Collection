// 檔名:位於pack2a\CRect.java          
package pack2a;        //本檔案內的類別屬於pack2a類別庫

public class CRect  //宣告為public才可以讓其他類別庫使用
{
   protected double area;
   protected double len,width;
   public CRect(double i,double j){ len = i; width = j; }
   public void showArea()
   {
        area = len * width;
        System.out.println("Area=" + area);
   }  
}