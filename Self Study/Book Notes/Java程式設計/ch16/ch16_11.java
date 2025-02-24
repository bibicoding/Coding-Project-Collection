/*  檔名:ch16_11.java          功能:兩個按鈕共用事件(註冊同一個傾聽者)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           
import java.awt.event.*;     

public class ch16_11  extends Frame implements ActionListener  
{                    
    
    Button btn1,btn2;
    
    public ch16_11()
    {    	
        this.setTitle("兩個按鈕共用事件(註冊同一個傾聽者)"); 
        this.setLayout(new FlowLayout());
        btn1 = new Button("按鈕1");
        btn2 = new Button("按鈕2");
        this.add(btn1);         
        this.add(btn2);         
        btn1.addActionListener(this);   //視窗作為btn1的ActionListener 
        btn2.addActionListener(this);   //視窗作為btn2的ActionListener
     	
        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e) //共用事件
    {
        if(e.getSource()==btn1)         //判斷事件來源
        {
            if(btn1.getLabel()=="按鈕1")   btn1.setLabel("btn1");
            else                           btn1.setLabel("按鈕1");
        }
        else if(e.getSource()==btn2)
        {
            if(btn2.getLabel()=="按鈕2")   btn2.setLabel("btn2");
            else                           btn2.setLabel("按鈕2");
        }
    }

    public static void main(String args[])
    {    	
        new ch16_11();    	
    }
}