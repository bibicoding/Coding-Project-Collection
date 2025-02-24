/*  檔名:ch16_15.java          功能:ActionEvent事件  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_15  extends Frame
{         
    //元件區
    Button btn,btnClr;
    TextField txf;
    Panel pnl;
    Label lab1;
    Label lab2;
    
    public ch16_15()
    {    	
        this.setTitle("ActionEvent事件");
    	
        //  版面配置開始
        this.setLayout(null);     //手動配置元件
        pnl = new Panel();    	
        pnl.setLayout(new GridLayout(0,1));
        pnl.setBackground(Color.YELLOW);
    	
        txf = new TextField(18);  //設定長度為18
        btn = new Button("查詢");
        lab1 = new Label();
        lab2 = new Label();
        btnClr = new Button("清除");    	
    	
        txf.setBounds(20,35,150,20);
        btn.setBounds(190,35,40,20);
        btnClr.setBounds(190,65,40,20);
        pnl.setBounds(20,65,150,50);
    	
        this.add(txf);    	this.add(btn);
        pnl.add(lab1);    	pnl.add(lab2);
        this.add(pnl);    	this.add(btnClr);    	    	
        //  版面配置結束
    	    	 
        //註冊傾聽者
        this.addWindowListener(new WindowAdapter()  //匿名類別:關閉視窗
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //關閉視窗
            }  	
        });
        txf.addActionListener(new CMyListener1());     //註冊事件傾聽者
        btn.addActionListener(new CMyListener1());     //註冊事件傾聽者
        btnClr.addActionListener((ActionEvent e) ->  //註冊事件傾聽者
        {   // actionPerformed(ActionEvent e)事件處理程式區塊
            txf.setText("");
            lab1.setText("");   
            lab2.setText("");           
        });  
        //註冊傾聽者結束    	    	
    	
        this.setBackground(Color.PINK);
        this.setSize(250,150);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_15();    	
    }
    
    //以下內部類別為事件傾聽者
    class CMyListener1 implements ActionListener //自定事件傾聽者1
    {
        public void actionPerformed(ActionEvent e) //事件處理撰寫處
        {
            lab1.setText(txf.getText());   
            if(e.getSource()==btn)
                lab2.setText("您按下了查詢鈕");
            else
                lab2.setText("您未按下查詢鈕");
        }    
    }
}