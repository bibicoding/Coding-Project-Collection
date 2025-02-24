/*   檔名:ch15_16.java       功能:在非輸入參數處使用Lambda運算式  */

package myJava.ch15;
import java.lang.*;

public class ch15_16         //主類別
{    
    public static void main(String args[])
    {
        Runnable task1 =  () -> 
            {
                for(int i=1;i<=3;i++)
                {
                    try
                    {
                        Thread.sleep((long)(1000*Math.random())); //休眠0~1秒鐘
                    }
                    catch(InterruptedException e){}
                    System.out.println(Thread.currentThread().getName()  + " is running");
                }
            };

        Thread obj1 = new Thread(task1);          
        Thread obj2 = new Thread(task1);

        obj1.start();  
        obj2.start();
    }
}