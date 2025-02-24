/*  檔名:ch16_05.java          功能:BorderLayoout版面管理員  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ch16_05 
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //視窗實體    	
        frm1.setLayout(new BorderLayout());    	//可省略	
        frm1.setTitle("使用BorderLayout版面管理員");
        frm1.add(new Button("東按鈕"),BorderLayout.EAST);  
        frm1.add(new Button("西按鈕"),BorderLayout.WEST);
        frm1.add(new Button("南按鈕"),BorderLayout.SOUTH);
        frm1.add(new Button("北按鈕"),BorderLayout.NORTH);
        frm1.add(new Label("中央標籤",Label.CENTER),BorderLayout.CENTER); 
        frm1.setSize(300,300);  
        frm1.setVisible(true);         	
    } 
}
