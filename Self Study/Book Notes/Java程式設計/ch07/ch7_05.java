/*   郎:ch7_05.java        :篶ㄧΑ更  */

package myJava.ch07;
import java.lang.*;

public class ch7_05         //摸
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();          //龟砰玻ネ礚ま计
        CMyClass Y = new CMyClass(5,40);      //龟砰玻ネΤㄢ俱计ま计
        CMyClass Z = new CMyClass(20.2,30.6); //龟砰玻ネΤㄢ疊翴计ま计
        X.showVar();
        Y.showVar();
        Z.showVar();
    } 
}    

class CMyClass
{
    public double VarA;
    private double VarB;

    public CMyClass()               //﹚竡礚把计篶ㄧΑ
    {
        VarA = 10;
        VarB = 10;
    }
    public CMyClass(int a,int b)    //﹚竡ㄢ俱计把计篶ㄧΑ
    {
        VarA = a;
        VarB = a + b;
    }
    public CMyClass(double a,double b)    //﹚竡ㄢ疊翴计把计篶ㄧΑ
    {
        VarA = a;
        VarB = a * b;
    }
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);
    }
}
