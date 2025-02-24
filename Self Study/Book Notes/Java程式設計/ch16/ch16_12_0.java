/*  檔名:ch16_12_0.java          
    功能:未加入事件處理機制  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_12_0  extends Frame
{     
    Button btn;
    public ch16_12_0()
    {    	
        this.setTitle("內部類別extends MouseAdapter類別"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);                           
    	
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_12_0();    	
    }
    
    
    
    
    
        
}