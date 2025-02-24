/*  檔名:ch6_01.java      功能:呼叫static method   */

package myJava.ch06;
import java.lang.*;
import java.lang.Math;      //pow,log10所屬類別,可省略

public class ch6_01         //主類別
{
    public static void main(String args[])
    {
        double i=7.0,j=4.0;
        double powNum,logNum;
    	    	
        powNum = Math.pow(i,j);
        System.out.println(i + "的" + j + "次方=" + powNum);
        logNum = Math.log10(powNum);
        System.out.println(powNum + "取10的對數=" + logNum);    	
    }
}