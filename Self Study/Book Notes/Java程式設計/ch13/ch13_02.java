/*  檔名:ch13_02.java          功能:繼承Thread類別的多執行緒程式  */

package myJava.ch13;
import java.lang.*;

public class ch13_02         //主類別
{
    public static void main(String args[])
    {
        CCar obj1 = new CCar("Ford");
        CCar obj2 = new CCar("Toyota");
        obj1.start();
        obj2.start();    	
    } 
}

class CCar extends Thread  //繼承Thread可實現多執行緒
{
    String manufacturer;
    public CCar(String str){ manufacturer = str; }    
    public void run()        //JVM自動執行
    {
        for(int i=1;i<=3;i++)
        {
           for(int t=1;t<100000000;t++) 
                ;  //空迴圈,可延長第27行執行兩次之間的時間
           System.out.println(manufacturer + " is running");
        }
    }
}
