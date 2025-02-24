/*  檔名:ch16_12_2.java          
    功能:註冊事件傾聽者  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;         
import java.awt.event.*;   

public class ch16_12_2  extends Frame
{     
    Button btn;
    public ch16_12_2()
    {    	
        this.setTitle("內部類別extends MouseAdapter類別"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);                           
        btn.addMouseListener(new CMyListener());   //註冊事件傾聽者
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_12_2();    	
    }
    
    class CMyListener extends MouseAdapter 
    {
    	   
    }    
    
    
    
        
}