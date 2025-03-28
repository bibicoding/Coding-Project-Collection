/*  檔名:ch16_12_3.java          
    功能:撰寫事件處理程式碼  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;         
import java.awt.event.*;  

public class ch16_12_3  extends Frame
{     
    Button btn;
    public ch16_12_3()
    {    	
        this.setTitle("內部類別extends MouseAdapter類別"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);                           
        btn.addMouseListener(new CMyListener());
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_12_3();    	
    }
    
    class CMyListener extends MouseAdapter 
    {
        public void mouseEntered(MouseEvent e) //撰寫事件處理程式碼
        {
            btn.setLabel("btn1");
        }
        public void mouseExited(MouseEvent e)   //撰寫事件處理程式碼
        {
            btn.setLabel("按鈕1");
        }   	   
    } 
}