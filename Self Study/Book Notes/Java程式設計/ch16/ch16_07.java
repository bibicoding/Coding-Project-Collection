/*  檔名:ch16_07.java          功能:FlowLayoout版面管理員  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ch16_07 
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //視窗實體    	
        frm1.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
    	
        frm1.setTitle("使用FlowLayout版面管理員");
        frm1.add(new Button("按鈕1"));
        frm1.add(new Button("按鈕2"));
        frm1.add(new Button("按鈕3"));
        frm1.add(new Button("按鈕4"));
        frm1.add(new Button("按鈕5"));
         
        frm1.setSize(360,240);  
        frm1.setVisible(true);         	
    } 
}
