/*  檔名:ch16_10_3.java          
    功能:撰寫事件處理程式碼  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;    

public class ch16_10_3  extends Frame  implements ActionListener
{                                   
    
    Button btn;
    
    public ch16_10_3()
    {    	
        this.setTitle("視窗實作ActionListener介面"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);               
        btn.addActionListener(this);  
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
        new ch16_10_3();    	
    }
}