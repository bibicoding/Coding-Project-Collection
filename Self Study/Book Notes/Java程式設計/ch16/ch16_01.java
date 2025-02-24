/*  檔名:ch16_01.java       功能:AWT Frame-視窗程式  (主類別繼承方式)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ch16_01  extends Frame      //主類別繼承Frame類別
{
    public ch16_01()
    {
        this.setTitle("這是AWT視窗"); //設定視窗的標題列
        this.setSize(300,200);        //設定視窗的寬與高
        this.setVisible(true);        //設定視窗是否可被看見
    }

    public static void main(String args[])
    {
        new ch16_01();
    } 
}