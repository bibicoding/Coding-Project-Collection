/*  檔名:ch15_20.java          功能:lambda運算式與類別實體方法參考  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IFIABS{
    int abs(CABS obj,int a);
}

public class ch15_20       //主類別
{
    public static void main(String[] args)
    {
          ch15_20 objA = new ch15_20();
          objA.test();
    }

    public void test()
    {
        IFIABS obj1 = (CABS o,int i) ->  o.myabs(i);  //單行的lambda                     
        System.out.println(obj1.abs(new CABS(),-4));

        IFIABS obj2 = CABS::myabs;                 //類別實體方法參考              
        System.out.println(obj2.abs(new CABS(),-3));  
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

