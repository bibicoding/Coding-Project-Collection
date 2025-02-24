/*   檔名:ch15_15.java       功能:Lambda運算式與Runnable介面  */

package myJava.ch15;
import java.lang.*;

public class ch15_15         //主類別
{    
    public static void main(String args[])
    {
        Runnable task1 = new Runnable(){   //以匿名內部類別方式完成
            public void run()
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
            }
        };   

        Thread obj1 = new Thread(task1);          
        Thread obj2 = new Thread((Runnable) () -> 
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
            }); 

        obj1.start();  //只有使用Thread物件才能執行start()啟動多執行緒
        obj2.start();
    }
}