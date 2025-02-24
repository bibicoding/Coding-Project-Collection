/*   檔名:ch7_06.java      功能:預設的建構子  */

package myJava.ch07;
import java.lang.*;

public class ch7_06         //主類別
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(5,40);   //實體產生有兩個整數引數
        //CMyClass Y = new CMyClass();     //無法找到對應的建構子
        X.showVar();
        //Y.showVar();
    } 
}    

class CMyClass
{
    public int VarA;
    private int VarB;
    
    public CMyClass(int a,int b)    //定義兩個整數參數的建構函式
    {
        VarA = a;
        VarB = a + b;
    }
    
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);
    }
}
