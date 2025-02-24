/*  檔名:app_02.java          功能:Frame改寫為Applet  */

//改寫處0,不宣告所屬類別庫(因為檔案隨時可能移動)
import java.lang.*;
import java.awt.*;           //載入AWT類別庫
import java.awt.event.*;     //載入AWT事件類別庫
import java.applet.Applet;   //載入Applet類別,改寫處1

public class app_02  extends Applet   //改寫處2
{         
    //元件區
    Button btn,btnClr;
    CheckboxGroup ckbgrp1,ckbgrp2,ckbgrp3;
    Checkbox ckb1,ckb2,ckb3,ckb4,ckb5,ckb6,ckb7,ckb8;
    Panel pnl1,pnl2,pnl3;
    Label lab1,lab2;    
    
    public void init()   //改寫處3,以init()取代建構子
    {    	   	
    	//this.setTitle("ItemEvent事件");   //改寫處4
    	
    	//  版面配置開始
    	this.setLayout(null);     //手動配置元件
    	pnl1 = new Panel(new GridLayout(0,1));    	
    	pnl1.setBackground(Color.YELLOW);   
    	pnl2 = new Panel(new GridLayout(0,1));    	
    	pnl2.setBackground(Color.CYAN);      
    	pnl3 = new Panel(new GridLayout(0,1));    	
    	pnl3.setBackground(Color.GREEN);    
    	    	    	
    	btn = new Button("投票");
    	btnClr = new Button("清除");
    	lab1 = new Label("年度最佳棒球選手票選");
    	lab1.setFont(new Font("新細明體",Font.BOLD,20));   	
    	lab2 = new Label();    
    	ckbgrp1 = new CheckboxGroup();
    	ckbgrp2 = new CheckboxGroup();
    	ckbgrp3 = new CheckboxGroup();	    	
    	ckb1 = new Checkbox("野手",ckbgrp1,true);    
    	ckb2 = new Checkbox("投手",ckbgrp1,false);
    	ckb3 = new Checkbox("陳金鋒",ckbgrp2,true);   
    	ckb4 = new Checkbox("胡金龍",ckbgrp2,false);
    	ckb5 = new Checkbox("彭政閔",ckbgrp2,false);
    	ckb6 = new Checkbox("王建民",ckbgrp3,true);   
    	ckb7 = new Checkbox("郭泓志",ckbgrp3,false);
    	ckb8 = new Checkbox("潘威倫",ckbgrp3,false);
    	
    	pnl1.add(ckb1);  pnl1.add(ckb2);                
    	pnl2.add(ckb3);  pnl2.add(ckb4); pnl2.add(ckb5);
    	pnl3.add(ckb6);  pnl3.add(ckb7); pnl3.add(ckb8);
    	    	
    	pnl2.setVisible(true);  
    	pnl3.setVisible(false);  
    	
    	//設定元件位置
    	lab1.setBounds(20,35,250,50);
    	pnl1.setBounds(20,90,100,50);
    	pnl2.setBounds(150,90,90,100); 
    	pnl3.setBounds(150,90,90,100); 
    	btnClr.setBounds(20,150,40,20);
    	btn.setBounds(80,150,40,20);
    	lab2.setBounds(20,180,250,50);
   	
   	//元件加入
    	this.add(lab1);    	this.add(pnl1);
    	this.add(pnl2);    	this.add(pnl3);
    	this.add(btnClr);    	this.add(btn);     	
    	this.add(lab2);    	
    	//  版面配置結束
    	
    	    	 
    	//註冊傾聽者
    	
    	//改寫處5，不必設計關閉視窗的傾聽者
    	    
    	ckb1.addItemListener(new CMyItemListener());         
    	ckb2.addItemListener(new CMyItemListener());        
    	btn.addActionListener(new CMyActionListener1());     
    	btnClr.addActionListener(new CMyActionListener2());  
        //註冊傾聽者結束
    	
    	this.setBackground(Color.PINK); 
    	lab1.setBackground(Color.PINK); //其他改寫
    	lab2.setBackground(Color.PINK); //其他改寫
    	//this.setSize(280,250);       //改寫處6,大小移至HTML中決定
    	//this.setVisible(true);       //改寫處7
    }  
    

     //改寫處8，刪除main()
    
    
    
    
    //以下內部類別為事件傾聽者
    class CMyItemListener implements ItemListener 
    {
    	public void itemStateChanged(ItemEvent e)  
        {
    	   if(ckb1.getState()==true)
    	   {
    	      pnl2.setVisible(true);  
    	      pnl3.setVisible(false);  
    	   }
    	   else
    	   {
    	      pnl3.setVisible(true);  
    	      pnl2.setVisible(false); 
    	   }    	   
        }    
    }
    
    class CMyActionListener1 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) 
        {
    	   Checkbox ckb;
    	   if(ckb1.getState()==true)
    	   {
    	      ckb=ckbgrp2.getSelectedCheckbox();    	      
    	   }
    	   else
    	   {
    	      ckb=ckbgrp3.getSelectedCheckbox();  
    	   }
    	   if(ckb==null)
    	     lab2.setText("請選擇一人");            	    
    	   else
    	     lab2.setText(ckb.getLabel() + "得一票");            	    
        }    
    }
    
    class CMyActionListener2 implements ActionListener 
    {
    	public void actionPerformed(ActionEvent e)
        {   	   
    	   lab2.setText("");
    	   pnl2.setVisible(true);  
    	   pnl3.setVisible(false);  
    	   ckb1.setState(true);
    	   ckb3.setState(true);
    	   ckb6.setState(true);    	   
        }    
    }
}