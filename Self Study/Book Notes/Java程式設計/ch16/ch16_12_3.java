/*  郎:ch16_12_3.java          
    :级糶ㄆン矪瞶祘Α絏  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;         
import java.awt.event.*;  

public class ch16_12_3  extends Frame
{     
    Button btn;
    public ch16_12_3()
    {    	
        this.setTitle("ず场摸extends MouseAdapter摸"); 
        this.setLayout(new FlowLayout());
        btn = new Button("秙1");
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
        public void mouseEntered(MouseEvent e) //级糶ㄆン矪瞶祘Α絏
        {
            btn.setLabel("btn1");
        }
        public void mouseExited(MouseEvent e)   //级糶ㄆン矪瞶祘Α絏
        {
            btn.setLabel("秙1");
        }   	   
    } 
}