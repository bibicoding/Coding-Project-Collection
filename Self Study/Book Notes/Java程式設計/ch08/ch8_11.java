/*  檔名:ch8_11.java        功能:getClass() method  */

package myJava.ch08;
import java.lang.*;

public class ch8_11         //主類別
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        Class Y;
        Y=X.getClass();
        System.out.println("X屬於" + Y +"的物件");
        String str = new String("..");
        Y = str.getClass();
        System.out.println("str屬於" + Y +"的物件");        
    } 
}    

class CMyClass
{
    private int var;    
}