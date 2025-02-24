/*   檔名:ch15_14.java       功能:Lambda運算式分支含return  */

package myJava.ch15;
import java.lang.*;

interface IMyMath
{
    boolean isPositive(int x);
}

public class ch15_14         //主類別
{
    public void printAbs(int n,IMyMath obj)
    {
        if(obj.isPositive(n)==false)
           System.out.println(n + "的絕對值為" + (n*-1));
        else
           System.out.println(n + "的絕對值為" + n);
    }

    public static void main(String[] args)
    {
        ch15_14 objA = new ch15_14();
        objA.printAbs(-3, (var x) ->
                          {
                             if(x<0)   return false;
                             return true;
                          }  );        
    }
}




