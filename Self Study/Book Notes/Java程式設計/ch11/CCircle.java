// ÀÉ¦W:CCircle.java          
//¥¼«Å§ipackage

class CCircle
{
   protected double area;
   protected double radius;
   protected final double pi=3.14;
   public CCircle(double i){ radius = i; }
   public void showArea()
   {
        area = radius * radius * pi;
        System.out.println("Area=" + area);
   }  
}