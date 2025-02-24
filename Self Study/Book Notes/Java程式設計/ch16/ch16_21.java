/*  檔名:ch16_21.java          功能:KeyEvent事件  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_21  extends Frame
{         
    Button btn;
    Label lab;
    int x,y;
    
    public ch16_21()
    {    	
        this.setTitle("KeyEvent事件");
    	
        //  版面配置開始
        this.setLayout(null);        //手動配置元件    	
        btn = new Button("按鈕");
        lab = new Label("【Shift】與【Ctrl】鍵同時按下時可利用方向鍵移動按鈕");
        lab.setFont(new Font("新細明體",Font.BOLD,18));
        lab.setBounds(20,30,480,40);
        x = 280; y = 180;  //起始位置
        btn.setBounds(x,y,40,40);
        this.add(lab);   	
        this.add(btn);  
        //  版面配置結束
    	    	 
        //註冊傾聽者
        this.addWindowListener(new WindowAdapter()  //匿名類別:關閉視窗
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //關閉視窗
            }  	
        });
        btn.addKeyListener(new CMyListener1());     //註冊事件傾聽者
        //註冊傾聽者結束    	    	
    	
        this.setBackground(Color.PINK);
        this.setSize(600,400);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_21();    	
    }
    
    //以下內部類別為事件傾聽者
    class CMyListener1 implements KeyListener //以自定事件傾聽者1
    {
        public void keyPressed(KeyEvent e)  //事件處理撰寫處
        {
            if((e.isControlDown() == true) && (e.isShiftDown() == true))
            {
                switch(e.getKeyCode())
                {
                   case 37: //向左移動
                    x = x - 20;
                    if(x<10) x=10;   //左邊界控制
                    break;
                   case 38: //向上移動
                    y = y - 20 ;
                    if(y<80) y=80;   //上邊界控制
                    break;
                   case 39: //向右移動                    
                    x = x + 20 ;
                    if(x>550) x=550; //右邊界控制
                    break;
                   case 40: //向下移動
                    y = y + 20;
                    if(y>350) y=350; //下邊界控制
                    break;
                   default:
                    break;
                }
                btn.setBounds(x,y,40,40);  //設定元件新的位置
            }
        }
        public void keyTyped(KeyEvent e) 
        {            
        }
        public void keyReleased(KeyEvent e)
        {
            if((e.isControlDown() == false) && (e.isShiftDown() == false))
            {
                x = 280; y = 180;  //回復起始位置
                btn.setBounds(x,y,40,40);  //設定為原起始位置
            }
        }
    }   
}