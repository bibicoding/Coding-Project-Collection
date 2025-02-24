/*  檔名:ch16_04.java          功能:JFrame視窗內加入元件  */

package myJava.ch16;
import java.lang.*;
import javax.swing.*;     //載入Swing類別庫
import java.awt.*;        //載入AWT類別庫,例如Color類別為AWT類別庫

public class ch16_04 
{       
    public static void main(String args[])
    {
        CMyJWindow jfrm1 = new CMyJWindow();     //視窗實體
    	
        jfrm1.addNewLabel("新增標籤");       	
    } 
}

class CMyJWindow  extends JFrame       //類別繼承JFrame類別
{
    //使用類別成員方式宣告視窗內的元件
    JButton btn1;  //類別成員
    JButton btn2;  //類別成員 
    public CMyJWindow()     //建構子
    {
        Container cp = this.getContentPane(); //取得視窗的ContentPane
        cp.setLayout(null);          //設定版面編排,手動指定各元件位置
    	
        btn1 = new JButton("按鈕1");   //建構各元件的實體    	
        btn2 = new JButton();
    	
        //設定各元件的屬性，例如外觀，大小等等
    	   
        btn1.setBounds(75,100,100,75);   //設定按鈕位置與大小等等
        btn2.setBounds(25,50,50,25);     //設定按鈕位置與大小等等
        btn1.setFont(new Font("Serif",Font.BOLD,12)); //設定字型
    	
        //設定各元件對應的事件傾聽機制，暫時省略
    	
        //透過Frame的add()方法，將各元件加入本視窗中
        cp.add(btn1);      //ContentPane加入按鈕1
        cp.add(btn2);      //ContentPane加入按鈕2
    	
        cp.setBackground(Color.yellow);  //設定ContentPane的背景顏色
    	
        this.setTitle("加入元件的JFrame視窗");  //設定視窗的屬性
        this.setSize(300,300);                  //設定視窗的屬性
    	
        //設定視窗對應的事件傾聽機制，暫時省略        

        this.setVisible(true);   //顯示視窗    	
    }
    public void addNewLabel(String str1)
    {    
        JLabel lab = new JLabel(str1);       //產生標籤實體   	
        lab.setBounds(170,150,60,60);        //設定標籤位置與大小
        lab.setFont(new Font("Serif",Font.BOLD,12)); //設定字型
        Container cp1 = this.getContentPane();    	
        cp1.add(lab);                     //ContentPane加入標籤
    	
        cp1.setBackground(Color.green);
        btn1.setBackground(Color.red);    
    } 
    
    // 事件傾聽機制，暫時省略    
}