/*  檔名:ch16_14.java          功能:Lambda運算式取代actionPerformed(ActionEvent e)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫

public class ch16_14  extends Frame
{         
    Button btn;

    public ch16_14()
    {    	
        this.setTitle("用Lambda運算式實作視窗程式"); 
        this.setLayout(new FlowLayout());
        btn = new Button("按鈕1");
        this.add(btn);                 //將btn加入視窗

        //下個敘述，以Lambda運算式設計actionPerformed(ActionEvent e)
        btn.addActionListener((ActionEvent e) ->  
            {
                if(btn.getLabel()=="按鈕1")
                   btn.setLabel("btn1");
                else
                   btn.setLabel("按鈕1");
            } 	
        );

        this.addWindowListener( new WindowAdapter()  
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //關閉視窗
            }  	
        } ); 
    	
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_14();    	
    }
}