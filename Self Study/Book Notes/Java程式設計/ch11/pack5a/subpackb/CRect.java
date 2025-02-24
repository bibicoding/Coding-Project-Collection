// 檔名:位於pack5a\subpackb\CRect.java          
package pack5a.subpackb;        //本檔案內的類別屬於subpackb子類別庫

public class CRect extends  pack5a.CShape 
{
   protected double len,width;
   public CRect(double i,double j){ len = i; width = j; }
   public void showArea()
   {
        area = len * width;
        System.out.println("Rect Area=" + area);
   }  
}