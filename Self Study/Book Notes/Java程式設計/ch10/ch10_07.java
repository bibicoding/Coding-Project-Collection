/*  檔名:ch10_07.java           功能:多個例外處理   */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;
    
public class ch10_07         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("請輸入陣列大小:");
        int lottoSize=0;
        
        try
        {          
            lottoSize = Integer.parseInt(keyboardInput.nextLine());         
            if(lottoSize > 48)
                 throw new CmyException1("例外訊息:陣列太大");            
            else if(lottoSize < 6)
                 throw new CmyException2("例外訊息:陣列太小");            
        }
        catch(NumberFormatException e)
        {
            System.out.println("球數不為數字,將被設定為6球");
            lottoSize = 6;
        } 
        catch(CmyException1 | CmyException2 e)
        {   //不論是CmyException1或CmyException2類型的例外，都執行下列動作           
            System.out.println("例外訊息:陣列大小將被重設為6");
            lottoSize = 6;
        }       
        finally
        {
            System.out.println("樂透開獎球數為" + lottoSize);
        }
        
        int lottoAry[] = new int[lottoSize];
        System.out.println("存放樂透開獎的陣列實體產生完畢");
    } 
}    

class CmyException1 extends Exception
{
    public CmyException1()   //建構子
    {
         super();
    }
    public CmyException1(String msg)   //建構子
    {
        super();
        System.out.println(msg);
    }        
}

class CmyException2 extends Exception
{
    public CmyException2()   //建構子
    {
         super();
    }
    public CmyException2(String msg)   //建構子
    {
        super();
        System.out.println(msg);
    }     
}