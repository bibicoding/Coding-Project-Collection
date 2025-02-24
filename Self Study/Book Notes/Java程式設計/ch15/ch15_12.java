/*   檔名:ch15_12.java       功能:用Lambda運算式替代匿名類別  */

package myJava.ch15;
import java.lang.*;
import java.util.*;      //使用Collections Framework的類別需載入

public class ch15_12         //主類別
{
    public static void main(String args[])
    {        
        LinkedList<String> objLList1 = new LinkedList<String>();

        objLList1.add("abcdefg");  objLList1.add("abc");
        objLList1.add("xy");       objLList1.add("ijklm");  
        
        System.out.println(objLList1);
        Collections.sort(objLList1, 
                         (o1,o2) -> Integer.compare(o1.length(),o2.length())
                        );
        System.out.println(objLList1);
    }
}