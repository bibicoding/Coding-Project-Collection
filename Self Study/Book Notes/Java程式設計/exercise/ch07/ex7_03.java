package myJava.exercise.ch07;
import java.lang.*;
import java.util.Scanner;

public class ex7_03         //主類別
{
    public static void main(String args[])            //3-g  已提供
    {
    	CPersonAccount obj = new CPersonAccount();
    	char runFunc='d';
        Scanner keyboardInput = new Scanner(System.in);
        
        while(runFunc!='q')
        {
          System.out.print("請選擇作業");
          System.out.print("(i=輸入資料 s=依月薪資排序 d=顯示資料 q=離開):");
          runFunc = keyboardInput.nextLine().charAt(0);
          switch (runFunc)
          {
            case 'i':
               obj.inputData();
               break;            
            case 's':
               obj.sortBySalary();
               break;
            case 'd':
               obj.displayData();
               break;
           default:
               break;
          }
        }
   }  
}    

class CPersonData              
{

}

class CPersonAccount
{

}