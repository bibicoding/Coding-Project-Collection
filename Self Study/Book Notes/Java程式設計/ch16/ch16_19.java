/*  檔名:ch16_19.java            
    功能:MouseEvent與InputEvent事件(滑鼠+特殊鍵盤鍵)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_19  extends Frame
{      
    int startX,startY,endX,endY;  //存放繪圖點
    public ch16_19()
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
        this.addMouseListener(new CMyListener1());        //註冊事件傾聽者
        this.addMouseMotionListener(new CMyListener1());  //註冊事件傾聽者
        //註冊傾聽者結束     	
    	
        this.setSize(250,150);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_19();    	
    }

    class CMyListener1 extends MouseAdapter //以自定事件傾聽者1
    {    	   	
        public void mousePressed(MouseEvent e)  //事件處理撰寫處
        {
            startX = e.getX();
            startY = e.getY();    	     
        }
    	
        public void mouseDragged(MouseEvent e) //事件處理撰寫處
        {           
            Graphics g = getGraphics();      //取得一個繪圖物件g
           
            if(e.isControlDown() == true)   //判斷Ctrl是否被按下
                g.setColor(Color.RED);
            else
                g.setColor(Color.BLACK);
    	   
            endX = e.getX();
            endY = e.getY();
            g.drawLine(startX,startY,endX,endY); //畫線
            startX = endX;    //舊的結束點作為新的起始點
            startY = endY;    //舊的結束點作為新的起始點
        }      	    
    }    
}