/*  檔名:ch16_17.java          功能:WindowEvent事件  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_17  extends Frame
{         
    public static void main(String args[])
    {    	
        CMyWindow frm = new CMyWindow();
        frm.dispose();    //釋放frm資源,會關閉視窗(請將本行設為註解重新執行一次)
    }
}

class CMyWindow  extends Frame       //類別繼承Frame類別
{
    //使用類別成員方式宣告視窗內的元件
    
    public CMyWindow()     //建構子
    {
        this.addWindowListener(new CMyListener());    	
        this.setBackground(Color.PINK);
        this.setSize(280,250);
        this.setVisible(true);    	   //顯示視窗
        System.out.println("視窗已被看見");
    }
    
    class CMyListener implements WindowListener
    {
        public void windowActivated(WindowEvent e) 
        {
            System.out.println("視窗變為作用視窗windowActived running..");
        }
        public void windowClosed(WindowEvent e) 
        {
            System.out.println("視窗已經被關閉windowClosed running..");
        }
        public void windowClosing(WindowEvent e) 
        {
            System.out.println("視窗關閉鈕被按下windowClosing running..");
            System.exit(0);
            System.out.println("物件被關閉..");           
        }
        public void windowDeactivated(WindowEvent e) 
        {
            System.out.println("視窗變為非作用視窗windowDeactivated running..");
        }
        public void windowDeiconified(WindowEvent e) 
        {
            System.out.println("視窗變為一般狀態windowDeiconified running..");
        }
        public void windowIconified(WindowEvent e) 
        {
            System.out.println("視窗變為最小化windowIconified running..");
        }
        public void windowOpened(WindowEvent e)
        {
            System.out.println("視窗變已開啟windowOpened running..");
        }
    }
}