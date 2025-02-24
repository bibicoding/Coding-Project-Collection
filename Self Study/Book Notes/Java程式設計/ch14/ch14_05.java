/*  檔名:ch14_05.java          功能:TreeSet(Collection<? extends E> c)建構子  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_05         //主類別
{
    public static void main(String args[])
    {
        HashSet<Integer> objHS = new HashSet<Integer>();
        objHS.add(7);        objHS.add(3);
        objHS.add(6);        objHS.add(3);
        objHS.add(5);        objHS.add(6);        

        System.out.print("HashSet集合:");
        for (Integer hs : objHS)
            System.out.print(hs + "\t");
        System.out.println();    

        TreeSet<Number> objTS = new TreeSet<Number>(objHS);  //建構子的引數為限定的泛型，objHS型態是HashSet<Integer>
        System.out.print("TreeSet集合:");
        for (Number ts : objTS)
            System.out.print(ts + "\t");
        System.out.println();
        System.out.println("----------------------------");  

        HashSet<String> objHSstr = new HashSet<String>();
        objHSstr.add("Pink");        objHSstr.add("Black");
        objHSstr.add("Green");       objHSstr.add("Blue");

        System.out.println("HashSet集合目前內容為:" + objHSstr);
        TreeSet<String> objTSstr = new TreeSet<String>(objHSstr);
        System.out.println("TreeSet集合目前內容為:" + objTSstr); 
    }
}