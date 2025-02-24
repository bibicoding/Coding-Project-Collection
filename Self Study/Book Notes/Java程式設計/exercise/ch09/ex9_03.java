package myJava.exercise.ch09;
import java.lang.*;

public class ex9_03         //¥DÃþ§O
{
    public static void main(String args[])
    {
         CCalculator obj1 = new CCalculator();
         double a,b;
         a = Math.random()*20;
         b = Math.random()*10;
         
         System.out.println(a + " Add " + b + " = " +obj1.Add(a,b));
         System.out.println(a + " Sub " + b + " = " +obj1.Sub(a,b));
         System.out.println(a + " Mul " + b + " = " +obj1.Mul(a,b));
         System.out.println(a + " Div " + b + " = " +obj1.Div(a,b));
         System.out.println("log(" + a + ") = "   +obj1.LOG(a));
         System.out.println("ln(" + a + ") = "    +obj1.LN(a));
    }    
}    

interface IAdvCompute
{
  
}

interface IBasicCompute
{
 
}

class CCalculator
{
  
}