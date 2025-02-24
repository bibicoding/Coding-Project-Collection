/*  檔名:ch16_10.java 
    功能:implements ActionListener介面,以該視窗類別作為事件傾聽者  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_10  extends Frame implements ActionListener  
{                     //主類別繼承Frame類別,並實作ActionListener介面
    
    Button btn;
    
    public ch16_10()
    {    	
        this.setTitle("視窗實作ActionListener介面"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);                 //將btn加入視窗
        btn.addActionListener(this);   //視窗作為btn1的ActionListener 
        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e) //事件處理撰寫處
    {
        if(btn.getLabel()=="按鈕1")
            btn.setLabel("btn1");
        else
            btn.setLabel("按鈕1");
    }    

    public static void main(String args[])
    {    	
        new ch16_10();    	
    }
}