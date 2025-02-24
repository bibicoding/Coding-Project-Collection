/*  檔名:ch16_12.java             
    功能:extends MouseAdapter類別,並以自定的內部類別作為事件傾聽者  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_12  extends Frame
{     
    Button btn;
    public ch16_12()
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
        new ch16_12();    	
    }
    
    class CMyListener extends MouseAdapter //以自定的內部類別作為事件傾聽者
    {
        public void mouseEntered(MouseEvent e)
        {
            btn.setLabel("btn1");
        }
        public void mouseExited(MouseEvent e)
        {
            btn.setLabel("按鈕1");
        }
    }
}