/*  檔名:ch16_09.java          功能:收納器中的收納器  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ch16_09
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //視窗實體    	
        frm1.setLayout(new GridLayout(0,3));  //欄數為3，不限定列數
    	
        Panel pn1 = new Panel();
        pn1.setLayout(new GridLayout(1,2));   //1列2欄       
        pn1.add(new Button("按鈕a"));
        pn1.add(new Button("按鈕b"));
        
        frm1.setTitle("收納器中的收納器");
        frm1.add(new Button("按鈕1"));
        frm1.add(pn1);
        frm1.add(new Button("按鈕2"));
        frm1.add(new Button("按鈕3"));
        frm1.add(new Button("按鈕4"));
        frm1.add(new Button("按鈕5"));
          
        frm1.setSize(300,300);  
        frm1.setVisible(true);         	
    } 
}