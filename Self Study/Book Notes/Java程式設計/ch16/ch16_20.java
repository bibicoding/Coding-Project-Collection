/*  檔名:ch16_20.java          功能:KeyEvent事件  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_20  extends Frame
{         
    //元件區

    TextField txf;
    TextArea  txa1,txa2;
    
    public ch16_20()
    {    	
        this.setTitle("KeyEvent事件");
    	
        //  版面配置開始
        this.setLayout(null);        //手動配置元件    	
        txf = new TextField(28);     //設定長度為28
        txa1 = new TextArea("",10,30,TextArea.SCROLLBARS_NONE);
        txa1.setEditable(false);     //TextArea不可編輯
        txa2 = new TextArea("",4,9,TextArea.SCROLLBARS_NONE);
        txa2.setEditable(false);     //TextArea不可編輯
    	    	
        txf.setBounds(20,35,340,20);
        txa1.setBounds(20,70,160,100);
        txa2.setBounds(200,70,160,100);
    	
        this.add(txf);    	this.add(txa1);   this.add(txa2);
   	//  版面配置結束
    	    	 
        //註冊傾聽者
        this.addWindowListener(new WindowAdapter()  //匿名類別:關閉視窗
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //關閉視窗
            }  	
        });
        txf.addKeyListener(new CMyListener1());     //註冊事件傾聽者
        //註冊傾聽者結束    	    	
    	
        this.setBackground(Color.PINK);
        this.setSize(400,220);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_20();    	
    }
    
    //以下內部類別為事件傾聽者
    class CMyListener1 implements KeyListener //自定事件傾聽者1
    {
        public void keyPressed(KeyEvent e)  //事件處理撰寫處
        {
            txa1.setText("");  //清空
            txa1.append("按下的鍵字元為" + e.getKeyChar() +"\n");
            txa1.append("按下的鍵字碼為" + e.getKeyCode() +"\n");
            if(e.isActionKey() == true)   //判斷哪種鍵被按下
            {
                txa1.append("按下的是Action Key\n");
            }
            if(e.isControlDown() == true)
                txa1.append("Ctrl被按下\n");
             
            if(e.isShiftDown()==true)
                txa1.append("Shift被按下\n");
             
            if(e.isAltDown()==true)
                txa1.append("Alt被按下\n");
            
            txa2.setText("");  //清空
            txa2.append("keyPressed is running\n");
        }
        public void keyTyped(KeyEvent e) 
        {
            txa2.append("keyTyped is running\n");	
        }
        public void keyReleased(KeyEvent e)
        {
            txa2.append("keyReleased is running\n");	
            //txf.setText("");  //清空,取消註解後可以測試連按不放
        }
    }   
}