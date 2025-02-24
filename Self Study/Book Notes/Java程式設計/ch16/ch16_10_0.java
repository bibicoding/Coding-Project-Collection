/* 檔名:ch16_10_0.java          
   功能:未加入事件處理機制 */

package myJava.ch16;
import java.lang.*;
import java.awt.*;


public class ch16_10_0  extends Frame
{                     
    
    Button btn;
    
    public ch16_10_0()
    {    	
        this.setTitle("視窗實作ActionListener介面"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);                

        this.setSize(200,100);      
        this.setVisible(true);  
    }


    public static void main(String args[])
    {    	
        new ch16_10_0();    	
    }
}