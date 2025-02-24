/*   檔名:ch15_11.java       功能:用Lambda運算式替代匿名類別  */

package myJava.ch15;
import java.lang.*;
import java.util.*;      //使用Collections Framework的類別需載入

public class ch15_11         //主類別
{
    public static void main(String args[])
    {        
        LinkedList<String> objLList1 = new LinkedList<String>();

        objLList1.add("abcdefg");  objLList1.add("abc");
        objLList1.add("xy");       objLList1.add("ijklm");  
        
        System.out.println(objLList1);
        Collections.sort(objLList1, 
                         (String o1,String o2) ->    //JDK11，可以將String改為var
                          {
                             if(o1.length() < o2.length())
                                  return -1;
                             else if(o1.length() > o2.length())
                                   return 1;
                             else 
                                   return 0;       
                          } 
                        );
        System.out.println(objLList1);
    }
}