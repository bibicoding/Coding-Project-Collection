/*  檔名:ch15_19.java          功能:lambda運算式與物件實體方法參考  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IFIABS{
    int abs(int a);
}

public class ch15_19       //主類別
{
    public static void main(String[] args)
    {
          ch15_19 objA = new ch15_19();
          objA.test();
    }

    public void test()
    {
        CABS objAbs = new CABS();                 //產生一個物件實體

        IFIABS obj1 = (int i) ->  objAbs.myabs(i);  //單行的lambda                     
        System.out.println(obj1.abs(-4));

        IFIABS obj2 = objAbs::myabs;              //物件實體方法參考              
        System.out.println(obj2.abs(-3)); 
    }
}

class CABS
{
    public int myabs(int x)
    {   
         if(x<0) return (-1)*x;
         return x;
    }
}

