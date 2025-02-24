// 檔名:位於pack1\abc.java         
package pack1;        //本檔案內的類別屬於pack1類別庫

class CRect
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