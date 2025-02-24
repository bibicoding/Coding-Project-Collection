/*  檔名:ch16_18.java          功能:MouseEvent事件(滑鼠畫直線)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_18  extends Frame
{      
    int startX,startY;  //存放繪圖起始點
    public ch16_18()
    {    	
        this.setTitle("MouseEvent事件");    	   	
    	    	 
        //註冊傾聽者
        this.addWindowListener(new WindowAdapter()  //匿名類別:關閉視窗
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //關閉視窗
            }  	
        });
        this.addMouseListener(new CMyListener1());     //註冊事件傾聽者
        //註冊傾聽者結束     	
    	
        this.setSize(250,150);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_18();    	
    }

    class CMyListener1 extends MouseAdapter //以自定事件傾聽者1
    {    	   	
        public void mousePressed(MouseEvent e) //事件處理撰寫處
        {
            Graphics g = getGraphics();      //取得一個繪圖物件g
            if(e.getButton() == e.BUTTON3)   //按下滑鼠右鍵會記錄新的起始點
            {
                startX = e.getX();
                startY = e.getY();
            }
            if(e.getButton() == e.BUTTON1)   //按下滑鼠左鍵
                g.drawLine(startX,startY,e.getX(),e.getY()); //畫線
        }      	    
    }    
}