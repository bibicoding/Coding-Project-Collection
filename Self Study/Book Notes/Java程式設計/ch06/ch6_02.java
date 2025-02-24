/*  檔名:ch6_02.java      功能:定義,呼叫函式   */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;

public class ch6_02         //主類別
{
    public static void main(String args[])
    {
        int k;
        double Ans;
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("計算3.5的k次方?請輸入k=");
        k = Integer.parseInt(keyboardInput.nextLine());
        Ans = power(3.5,k);                         //  呼叫函式
        System.out.println("3.5的" + k + "次方=" + Ans);  	
    }
    
    public static double power(double X,int n)    //函式定義
    {
        int i;
        double powerXn=1; 
        for(i=1;i<=n;i++)
            powerXn = powerXn * X;
        return powerXn;
    }
}