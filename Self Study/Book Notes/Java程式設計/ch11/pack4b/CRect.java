// 檔名:位於pack4b\CRect.java          
package pack4b;        //本檔案內的類別屬於pack4b類別庫

public class CRect extends pack4a.CShape   //public才可以讓其他類別庫使用
{
   protected double len,width;
   public CRect(double i,double j){ len = i; width = j; }
   public void showArea()
   {
        area = len * width;
        System.out.println("Area=" + area);
   }  
}