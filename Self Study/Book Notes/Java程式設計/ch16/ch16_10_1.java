/*  檔名:ch16_10_1.java          
    功能:讓視窗實作ActionListener 介面 */

package myJava.ch16;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;      //載入AWT事件類別庫

public class ch16_10_1  extends Frame  implements ActionListener
{                                       //實作ActionListener介面
    
    Button btn;
    
    public ch16_10_1()
    {    	
        this.setTitle("視窗實作ActionListener介面"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);               

        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e)   //將所有必須實作的方法填上，內容暫時為空
    { 
    } 


    public static void main(String args[])
    {    	
        new ch16_10_1();    	
    }
}