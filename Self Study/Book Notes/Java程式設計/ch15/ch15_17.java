/*  檔名:ch15_15.java          功能:lambda運算式的限制  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface  interface IMyFI
{
    void testAB();    //抽象方法
    default int def(int a , int b)  //預設方法
    {
        return a + b;
    }
}

public class ch15_17       //主類別
{
    private int x = 15;
    private static int y = 35;

    public static void main(String[] args)
    {
          ch15_17 objA = new ch15_17();
          objA.test();
    }

    public void test()
    {
        String localVar1 = "abc";
        String localVar2 = "xyz";

        IMyFI obj = ()->{    //這個lambda用來填補testAB()的程式碼
            System.out.println("localVar1:"  + localVar1);     //可讀取effectively final區域變數

            //localVar2 = "ijk";                               //在lambda中不可修改區域變數

            x = x+10;
            y = y+10;
            System.out.println("外部類別的實體變數x:"  + x);
            System.out.println("外部類別的類別變數y:"  + y);

            //System.out.println(def(5,7));       //在lambda內無法呼叫預設方法
        };

        obj.testAB();        
        System.out.println(obj.def(5,7));        //在lambda之外可以呼叫預設方法    
    }
}
