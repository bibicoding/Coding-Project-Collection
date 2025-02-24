package myJava.exercise.ch16;
import java.lang.*;
import java.awt.*;     //載入AWT類別庫

public class ex16_05 extends Frame      //主類別繼承Frame類別
{       
    
    Button numBtnArr[] = new Button[10];        //10個數字按鈕的物件陣列
    Button funcBtnArr[] = new Button[4];        //4個功能按鈕的物件陣列
    Button specFuncBtnArr[] = new Button[3];    //3個特殊功能按鈕的物件陣列
    
    
    Label lab;                               //顯示計算結果的標籤
    
    public ex16_05()
    {    	 	
    	String numArr[] = {"0","1","2","3","4","5","6","7","8","9"};
    	String funcArr[] = {"+","-","*","/"};
    	String specFuncArr[] = {"±","CE","="};
    	
    	
    }
    
    public static void main(String args[])
    {
    	new ex16_05();    	
    }
}