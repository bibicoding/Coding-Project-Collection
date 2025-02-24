/*  檔名:ch16_13.java          功能:匿名類別撰寫視窗事件  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫


public class ch16_13  extends Frame
{         
    public ch16_13()
    {    	
        this.setTitle("匿名類別撰寫視窗事件"); 
        //下面一個敘述句的功能為  註冊匿名類別為事件傾聽者
        this.addWindowListener( new WindowAdapter()  
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //關閉視窗
            }  	
        } ); 
   	
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_13();    	
    }
}