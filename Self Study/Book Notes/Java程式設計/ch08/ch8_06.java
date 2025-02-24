/*   檔名:ch8_06.java        功能:多層繼承之建構子呼叫   */

package myJava.ch08;
import java.lang.*;

public class ch8_06         //主類別
{
    public static void main(String args[])
    {
        CC objC1 =  new CC();
        CC objC2 =  new CC(10); 
        CC objC3 =  new CC(3,5); 
        objC1.show();
        objC2.show();
        objC3.show();
    } 
}    

class CA
{
    protected int varA;
    public CA() { varA = 1;}
    public CA(int i) { varA = i;}
}

class CB extends CA   // 類別CB繼承自類別CA
{
    protected int varB;
    public CB() { varB = 1;}
    public CB(int i)
    {
        super(i);
        varB = i;
    }
}    

class CC extends CB   // 類別CC繼承自類別CB
{
    protected int varC;
    public CC() { varC = 1;}
    public CC(int i){ varC = i;}    
    public CC(int i,int j)
    {
        super(i*j);
        varC = i * j;
    }    
    public void show()
    {
        System.out.print("varA=" + varA + "\t");
        System.out.print("varB=" + varB + "\t");
        System.out.println("varC=" +varC);   	
    }
}