package myJava.exercise.ch10;
import java.lang.*;

public class ex10_01         //主類別
{
    public static void main(String args[])  //勿修改 main內容
    {    	  
    	     System.out.println("2的 5次方=" +powerXY(2,5));
             System.out.println("2的 0次方=" +powerXY(2,0));
    	     System.out.println("0的 0次方=" +powerXY(0,0));  //例外
    	     System.out.println("2的 -2次方=" +powerXY(2,-2)); //例外
    }
    
    static int powerXY(int x,int y)   //可修改powerXY內容
    {
    	int result=1;    	

    	  for(int i=1;i<=y;i++)
    	  {
    	    result = result * x;
    	  }    	  

    	return result;       
    }    
}    

class CmyException                      //可修改CmyException類別
{

}
