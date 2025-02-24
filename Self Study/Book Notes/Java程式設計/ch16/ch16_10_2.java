/*  檔名:ch16_10_2.java          
    功能:為按鈕註冊ActionListener傾聽者  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;    

public class ch16_10_2  extends Frame  implements ActionListener
{                                   
    
    Button btn;
    
    public ch16_10_2()
    {    	
        this.setTitle("視窗實作ActionListener介面"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);               
        btn.addActionListener(this);   //視窗作為btn1的ActionListener
        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e)  
    { 
    } 


    public static void main(String args[])
    {    	
        new ch16_10_2();    	
    }
}