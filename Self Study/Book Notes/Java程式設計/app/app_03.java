/*  檔名:app_03.java          功能:取得HTML的資料  */

import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.applet.Applet;   //載入Applet類別

public class app_03  extends Applet  //代表applet的主類別
{      
    Label lab;
    String str;
    public void init()
    {    	
    	lab=new Label("");
    	this.add(lab);
    	str=this.getParameter("backcolor");
    	if(str!=null)  //非null代表HTML提供此一參數    	
    	{
    	   if(str.equals("Green"))
    	   {
    	     this.setBackground(Color.GREEN); 
    	     lab.setText("HTML設定Applet的顏色為綠色");  
    	   }
    	   else if(str.equals("Yellow"))
    	   {
    	     this.setBackground(Color.YELLOW);
    	     lab.setText("HTML設定Applet的顏色為黃色");  
    	   }	
    	   else
    	   {
    	   	this.setBackground(Color.PINK);    //預設顏色
    	   	lab.setText("不允許HTML設定Applet顏色為" + str);
    	   }
       }
       else         //null代表HTML並未提供此一參數
    	{
    	   this.setBackground(Color.PINK);         //預設顏色
    	   lab.setText("HTML未設定Applet的顏色");
    	}     	
    }
}