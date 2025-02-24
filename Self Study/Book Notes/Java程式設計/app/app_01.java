/*  檔名:app_01.java        功能:Applet各自動執行方法的執行時機  */

import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.applet.Applet;   //載入Applet類別

public class app_01  extends Applet  //代表applet的主類別
{      
    Label lab;
    public void init()
    {    	
    	lab = new Label("輸出至Java主控台");
    	this.add(lab);
    	this.setBackground(Color.PINK);
    	this.setSize(400,300);         //對瀏覽器無作用
    	this.setVisible(false);        //此行無用
    	System.out.println("執行init()...");   	
    }    
    public void start()
    {
    	System.out.println("執行start()...");
    }    
    public void stop()
    {
    	System.out.println("執行stop()...");
    }	    
    public void destroy()
    {
    	System.out.println("執行destroy()...");
    }
}