/*  檔名:ch10_13.java          功能:Precise rethrow with a final Exception    */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_13         //主類別
{
    public static void main(String args[]) 
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("請輸入陣列大小:");
        int lottoSize=0;
        CmyClass1 obj1 = new CmyClass1();

        try
        {   	   
            lottoSize = obj1.check(keyboardInput.nextLine());   //可能會產生例外         
        }        
        catch(CmyException1 e)
        { 
            System.out.println("例外訊息:球數過大，重設為6");
            lottoSize = 6;
        }
        catch(CmyException2 e)
        { 
            System.out.println("例外訊息:球數過小，重設為6");
            lottoSize = 6;
        }    	
        catch(NumberFormatException e)
        {
            System.out.println("球數不為數字,將被設定為6球");
            lottoSize = 6;
        } 
        catch(Exception e)
        {
            System.out.println("例外訊息:產生其他例外未處理");
        }       	
        finally
        {
            System.out.println("樂透開獎球數為" + lottoSize);
        }
    	
        int lottoAry[] = new int[lottoSize];
        System.out.println("存放樂透開獎的陣列實體產生完畢");
    } 
}    

class CmyClass1
{
    private int lottoSize;         
    public int check(String inputStr) 
               throws CmyException1,CmyException2,NumberFormatException
    {
      try 
      {
            lottoSize = Integer.parseInt(inputStr);     
            if(lottoSize > 48)
                 throw new CmyException1("例外訊息:陣列太大"); 
            else if(lottoSize < 6)
                 throw new CmyException2("例外訊息:陣列太小"); 
            return lottoSize;  
     }
      catch(final Exception e)
      {
            throw e;
      }     
    }   
}

class CmyException1 extends Exception
{
    public CmyException1() { super(); } //建構子
    public CmyException1(String msg)   //建構子
    {
        super();
        System.out.println(msg);
    }        
}

class CmyException2 extends Exception
{
    public CmyException2(){ super(); } //建構子
    public CmyException2(String msg)   //建構子
    {
        super();
        System.out.println(msg);
    }     
}
