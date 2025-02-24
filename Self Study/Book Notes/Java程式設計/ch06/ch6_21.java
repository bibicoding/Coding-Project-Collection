/*   檔名:ch6_21.java        功能:函式的多載  */

package myJava.ch06;
import java.lang.*;

public class ch6_21         //主類別
{
    public static void main(String args[])
    {
        printHello();         //呼叫第18~21行的函式
        System.out.println("----------");
        printHello(2);        //呼叫第23~37行的函式
        System.out.println("----------");
        printHello("three");  //呼叫第38~44行的函式
        //printHello(2.1);    //錯誤的函式呼叫
    } 
    
    public static void printHello()
    {
        System.out.println("Hello Java");        
    }
    
    public static void printHello(int n)
    {
        if(n>3)
        {
           System.out.println("sorry,more than 3!");
           return;
        }
        else if(n<0)
        {
           System.out.println("sorry,bad command!");
           return;
        }
        for(int i=0;i<n;i++)
           printHello();       //呼叫第18~21行的函式             
    }
    public static void printHello(String str1)
    {
        if(str1=="one") printHello();         //呼叫第18~21行的函式
        else if(str1=="two") printHello(2);   //呼叫第23~37行的函式
        else if(str1=="three") printHello(3); //呼叫第23~37行的函式
        else System.out.println("sorry,more than 3 or bad command!");
    }    
}