/*  檔名:ch10_10.java          功能:由方法轉交例外  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_10         //主類別
{
    public static void main(String args[])
    {    	  	
        CmyClass2 obj2 =  new CmyClass2();
    	
        try
        {   	   
            obj2.run();           //此方法可能產生例外 	    
        }
        catch(NumberFormatException e)
        {
            System.out.println("例外產生:請輸入數字");
        }
        catch(ArithmeticException e)
        {
            System.out.println("例外產生:分母為0");
        }  
        catch(Exception e)
        {
            System.out.println("有未考慮到的例外發生了");
        }    	
        finally
        {
        }    	    	 	
    } 
}

class CmyClass1
{
    private int numerator,denominator;    
    public Scanner keyboardInput = new Scanner(System.in);
      
    public void setValue() throws NumberFormatException
    {
        System.out.print("輸入分子:");
        numerator = Integer.parseInt(keyboardInput.nextLine());              
        System.out.print("輸入分母:");
        denominator = Integer.parseInt(keyboardInput.nextLine());         
        System.out.println("資料輸入完畢"); 
    }
    
    public void printValue() throws ArithmeticException
    {
        System.out.println("除法結果為" + numerator/denominator);
        System.out.println("除法執行完畢");
    }
}

class CmyClass2
{
  public CmyClass1 obj1 = new CmyClass1();
  public void run()  throws NumberFormatException,ArithmeticException
  {
        obj1.setValue();           //此方法可能產生例外
        obj1.printValue();         //此方法可能產生例外.
  }
}	