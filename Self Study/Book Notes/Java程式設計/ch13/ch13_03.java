/*  檔名:ch13_03.java          功能:實作Runnable的多執行緒程式  */

package myJava.ch13;
import java.lang.*;

public class ch13_03         //主類別
{
    public static void main(String args[])
    {
        CCar car1 = new CCar("Ford");
        CCar car2 = new CCar("Toyota");
        Thread obj1 = new Thread(car1);   //必須產生Thread物件
        Thread obj2 = new Thread(car2);   //必須產生Thread物件
        obj1.start();  //只有使用Thread物件才能執行start()啟動多執行緒
        obj2.start();  //只有使用Thread物件才能執行start()啟動多執行緒
    }
}

class CWheeledDevices
{
        int wheel;
}

class CCar extends CWheeledDevices implements Runnable
{                                //實作Runnable可實現多執行緒
    String manufacturer;
    public CCar(String str){ wheel = 4; manufacturer = str; }    
    public void run()        //JVM自動執行
    {
        for(int i=1;i<=3;i++)
        {
           for(int t=1;t<100000000;t++) 
                ;  //空迴圈,可延長第34行執行兩次之間的時間
           System.out.println(manufacturer + " is running");
        }
    }
}
