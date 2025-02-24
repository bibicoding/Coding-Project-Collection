/*   郎:ch7_14.java          :ン皚籔篶ㄧΑ   */

package myJava.ch07;
import java.lang.*;

public class ch7_14         //摸
{
    public static void main(String args[])
    {
        CMyClass X[] = new CMyClass[3];
        System.out.println("------------------");
        for(int i=0;i<X.length;i++)
            X[i] = new CMyClass();
                   
        CMyClass Y[] = new CMyClass[3];
        System.out.println("------------------");
        for(int i=0;i<Y.length;i++)
            Y[i] = new CMyClass(i+10);
    } 
}    

class CMyClass
{
    public int VarA;
    private int VarB;
    public CMyClass()       //礚把计篶ㄧΑ
    {
        System.out.println("礚把计篶ㄧΑ磅︽い");
    }
    public CMyClass(int i)
    {
        System.out.println("Τ把计篶ㄧΑ磅︽い,把计" + i);
    }
}