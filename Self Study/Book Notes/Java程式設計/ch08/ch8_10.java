/*   郎:ch8_10.java        :ンゑ耕   */

package myJava.ch08;
import java.lang.*;

public class ch8_10         //摸
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(5);
        CMyClass Y = new CMyClass(5);
        CMyClass Z = X;
        System.out.print("ンX籔ンY  ");
        if(X.equals(Y))
           System.out.println("ㄢン单");
        else
           System.out.println("ㄢンぃ单");  
        System.out.print("ンX籔ンZ  ");
        if(X.equals(Z))
           System.out.println("ㄢン单");
        else
           System.out.println("ㄢンぃ单");
    } 
}    

class CMyClass
{
    private int Var;
    public CMyClass(){}     
    public CMyClass(int i)  
    {
        Var = i;       
    }
}