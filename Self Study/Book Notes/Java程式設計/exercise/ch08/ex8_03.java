package myJava.exercise.ch08;
import java.lang.*;

public class ex8_03         //主類別
{
    public static void main(String args[])
    {
        //c加入程式碼
        
         for(int i=0;i<objArr.length;i++)
            objArr[i].angle();
         for(int i=0;i<objArr.length;i++)
            System.out.println(objArr[i].toString());
         
    }    
}    

abstract class CShape                          //抽象類別
{
  public int number;                   //邊數
  public int totalAngle;       //內角和,公式為totalAangle=(number-2)*180
  public abstract void angle();        //抽象方法
  
  //b加入程式碼
  
}

//a加入程式碼
