/*  檔名:ch11_08.java          功能:類別名稱相同-特別匯入類別  */

package ch11;
import java.lang.*;
import javax.swing.*;     //內含Timer類別
import java.util.*;       //內含Timer類別
import java.util.Timer;   //指定要使用java.util.Timer類別

public class ch11_08         //主類別
{
    public static void main(String args[])
    {
        Timer obj = new Timer();
        System.out.println(obj.toString());  
        obj.cancel();
    } 
}