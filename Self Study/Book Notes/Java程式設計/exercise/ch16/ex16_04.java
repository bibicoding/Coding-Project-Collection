package myJava.exercise.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ex16_04 extends Frame      //主類別繼承Frame類別
{       
    
    Button btnArr[] = new Button[9];        //按鈕物件陣列
    
    Button btn;                           //重新開始按鈕
    Label lab;                            //標籤文字
    
    public ex16_04()
    {    	 	
        	
    }
    
    public static void main(String args[])
    {
    	new ex16_04();    	
    }
}