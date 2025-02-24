package myJava.exercise.ch09;
import java.lang.*;

public class ex9_05         //¥DÃþ§O
{
    public static void main(String args[])
    {
         CCalculator obj1 = new CCalculator();
         CTriFunc obj2 = new CTriFunc();
         double a,b;
         a = Math.random()*20;
         b = Math.random()*10;
         
         System.out.println(a + " Add " + b + " = " +obj1.Add(a,b));
         System.out.println(a + " Sub " + b + " = " +obj1.Sub(a,b));
         System.out.println(a + " Mul " + b + " = " +obj1.Mul(a,b));
         System.out.println(a + " Div " + b + " = " +obj1.Div(a,b));
         System.out.println("log(" + a + ") = "   +obj1.LOG(a));
         System.out.println("ln(" + a + ") = "    +obj1.LN(a));
         System.out.println("sin(" + b + ") = "   +obj1.SIN(b*10));
         System.out.println("cos(" + b + ") = "   +obj1.COS(b*10));
         System.out.println("tan(" + b + ") = "   +obj1.TAN(b*10));
         System.out.println("sin(" + b + ") = "   +obj2.SIN(b*10) + "by run CTriFunc method");
         System.out.println("cos(" + b + ") = "   +obj2.COS(b*10) + "by run CTriFunc method");
         System.out.println("tan(" + b + ") = "   +obj2.TAN(b*10) + "by run CTriFunc method");
    }    
}    

class CTriFunc
{
  
}
interface IAdvCompute
{
 
}

interface IBasicCompute
{

}

interface IFullCompute
{
}



class CCalculator
{

}