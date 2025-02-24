/*  檔名:ch14_09.java          功能:TreeMap<K,V>類別(實作Map<K,V>介面或SortedMap<K,V>介面)  */

package myJava.ch14;
import java.lang.*;
import java.io.*;
import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_09         //主類別
{
    public static void main(String args[])
    {    	    	
    	TreeMap<Integer, String> objTM1 = new TreeMap<>();
    	
    	System.out.print("TreeMap目前為空:" + objTM1.isEmpty());
    	
    	objTM1.put(14007,"李小清");
    	objTM1.put(14004,"陳大華");
    	objTM1.put(14002,"黃大維");
    	objTM1.put(14006,"林大勇");
    	
    	System.out.println("TreeMap目前共有" + objTM1.size() + "個元素");
    	System.out.println("目前內容為:" + objTM1);
    	
    	System.out.print("第一個元素為   " + objTM1.firstKey());
    	System.out.println(" " + objTM1.get(objTM1.firstKey()));
    	System.out.print("最後一個元素為 " + objTM1.lastKey());
    	System.out.println(" " + objTM1.get(objTM1.lastKey()));
    	System.out.print("比14005大的最小關鍵值為");
    	System.out.println(objTM1.higherKey(14005));
    	System.out.print("比14005小的最大關鍵值為");
    	System.out.println(objTM1.lowerKey(14005));
    	System.out.print("介於14004(含)~14007(不含)的子TreeMap為:");
    	System.out.println(objTM1.subMap(14004,14007));    	
    } 
}