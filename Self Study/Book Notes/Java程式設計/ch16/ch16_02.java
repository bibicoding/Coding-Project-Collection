/*  檔名:ch16_02.java          功能:AWT Frame-視窗程式  (類別成員與函式變數方式)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ch16_02 extends Frame      //主類別繼承Frame類別
{
    static ch16_02 frm1 = new ch16_02();    //類別成員
       
    public static void main(String args[])
    {
        Frame frm2 = new Frame();           //函式變數
        frm1.setTitle("這是第一個AWT視窗"); //設定視窗的標題列
        frm1.setSize(300,200);              //設定視窗的寬與高    	
        frm1.setVisible(true);              //設定視窗是否可被看見
    	
        frm2.setTitle("這是另一個AWT視窗"); //設定視窗的標題列
        frm2.setSize(200,300);              //設定視窗的寬與高
        frm2.setLocation(350,50);           //設定視窗的位置
        frm2.setVisible(true);              //設定視窗是否可被看見
    } 
}