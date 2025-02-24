/*   檔名:ch15_13.java       功能:活用函數式介面及Lambda運算式  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IDuplicate //函數式介面
{
    String duplicateOperation(String str);
}

interface ITrans        //這也是函數式介面
{
    String transOperation(String str);
}

public class ch15_13         //主類別
{    
    public static void main(String[] args)
    {
        CPrint objA = new CPrint();

        System.out.println("印出一段重複，中間空白，並轉為大寫的文字");   
        objA.printDupBig("HelloLambda"
                         , (var s) -> s + " " + s 
                         , (var s) -> s.toUpperCase()
                         );         
    }
}

class CPrint
{
    public void printDupBig(String s1,IDuplicate obj1,ITrans obj2)
    {         
         s1 = obj1.duplicateOperation(s1);   //呼叫方法幫我們做事
         s1 = obj2.transOperation(s1);       //呼叫方法幫我們做事
         System.out.println(s1);
    }
    
    public String printSmall(String s1,ITrans obj)  //當作習題
    {
        s1 = obj.transOperation(s1);         //呼叫方法幫我們做事
        return s1;
    }
}