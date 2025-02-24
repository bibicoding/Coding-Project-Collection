/*  檔名:ch16_12_1.java          
    功能:製作一個內部類別繼承xxxAdapter  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_12_1  extends Frame
{     
    Button btn;
    public ch16_12_1()
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
        new ch16_12_1();    	
    }
    
    class CMyListener extends MouseAdapter //以自定的內部類別作為事件傾聽者
    {
    	   
    }
    
    
    
        
}