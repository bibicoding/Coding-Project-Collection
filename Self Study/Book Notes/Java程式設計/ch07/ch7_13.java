/*   郎:ch7_13.java        :ンゑ耕   */

package myJava.ch07;
import java.lang.*;

public class ch7_13         //摸
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(5);
        CMyClass Y = new CMyClass(5);
        CMyClass Z = X;
        System.out.print("ンX籔ンY  ");
        X.compare2Obj(Y);
        System.out.print("ンX籔ンZ  ");
        X.compare2Obj(Z);
    } 
}    

class CMyClass
{
    private int Var;
    public CMyClass(){}       //▆策篋琌干⊿Τ把计篶ㄧΑ
    public CMyClass(int i)    //俱计把计篶ㄧΑ
    {
        Var = i;       
    }
    
    public void compare2Obj(CMyClass Obj)
    {
        if(this==Obj)
           System.out.println("ㄢン单");
        else
           System.out.println("ㄢンぃ单");        
    }
}