/*  檔名:ch16_08.java          功能:GridLayoout版面管理員  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ch16_08 
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //視窗實體    	
        frm1.setLayout(new GridLayout(0,3));  //欄數為3，不限定列數
    	
        frm1.setTitle("使用GridLayout版面管理員");
        frm1.add(new Button("按鈕1"));
        frm1.add(new Button("按鈕2"));
        frm1.add(new Button("按鈕3"));
        frm1.add(new Button("按鈕4"));
        frm1.add(new Button("按鈕5"));
          
        frm1.setSize(300,300);  
        frm1.setVisible(true);         	
    } 
}