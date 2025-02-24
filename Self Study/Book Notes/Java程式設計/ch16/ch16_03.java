/*  檔名:ch16_03.java          功能:Frame視窗內加入元件  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ch16_03 
{       
    public static void main(String args[])
    {
        CMyWindow frm1 = new CMyWindow();     //視窗實體
    	
        frm1.addNewLabel("新增標籤");       	
    } 
}

class CMyWindow  extends Frame       //類別繼承Frame類別
{
    //使用類別成員方式宣告視窗內的元件
    Button btn1;  //類別成員
    Button btn2;  //類別成員 
    public CMyWindow()     //建構子
    {
        this.setLayout(null);  //設定版面編排,手動指定各元件位置
    	
        btn1 = new Button();   //建構各元件的實體
        btn2 = new Button();   //建構各元件的實體
    	
    	//設定各元件的屬性，例如外觀，大小等等
        btn1.setLabel("按鈕1");        
        btn1.setBounds(75,100,100,75); //設定按鈕位置與大小等等    	
        btn2.setBounds(25,50,50,25);   //設定按鈕位置與大小等等    	
    	
    	//設定各元件對應的事件傾聽機制，暫時省略
    	
    	//透過Frame的add()方法，將各元件加入本視窗中
        this.add(btn1);      //視窗加入按鈕1
        this.add(btn2);      //視窗加入按鈕2
    	
        this.setTitle("加入元件的Frame視窗");  //設定視窗的屬性
        this.setSize(300,300);                 //設定視窗的屬性
    	
    	//設定視窗對應的事件傾聽機制，暫時省略        

        this.setVisible(true);   //顯示視窗    	
    }
    public void addNewLabel(String str1)
    { 
        Label lab = new Label(str1);     //產生標籤實體   	
        lab.setBounds(170,150,60,60);    //設定標籤位置與大小
        this.add(lab);                   //視窗加入標籤
    	
        this.setBackground(Color.green);
        btn1.setBackground(Color.red);    	
    } 
    
    // 事件傾聽機制，暫時省略    
}