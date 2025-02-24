/*  檔名:ch14_08.java          功能:HashMap<K,V>類別(實作Map<K,V>介面)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_08         //主類別
{
    public static void main(String args[])
    {    	    	
    	HashMap<Integer, String> objHM1 = new HashMap<>();
    	
    	System.out.print("Map目前為空:" + objHM1.isEmpty());
    	System.out.println(" Map目前共有" + objHM1.size() + "個成對元素");
    	
    	System.out.println("加入key=14002:" + objHM1.put(14002,"李小清"));
    	System.out.println("加入key=14001:" + objHM1.put(14001,"陳大華"));
    	System.out.println("加入key=14003:" + objHM1.put(14003,"黃大維"));
    	
    	System.out.print("Map目前共有" + objHM1.size() + "個成對元素");
    	System.out.println("  目前內容為:" + objHM1);
    	
    	//覆蓋舊值 
    	System.out.println("加入key=14002覆蓋了原有的:" + objHM1.put(14002,"林大勇"));
    	    	
    	System.out.print("Map目前共有" + objHM1.size() + "個成對元素");
    	System.out.println("  目前內容為:" + objHM1);   	
    	
    	System.out.print("關鍵值key=14003的對應值為:");
    	System.out.println(objHM1.get(14003));
    	System.out.print("Map中是否包含關鍵值key=14004的元素:");
    	System.out.println(objHM1.containsKey(14004));
    	System.out.print("Map中是否包含關鍵值key=14002的元素:");
    	System.out.println(objHM1.containsKey(14002));
    	System.out.print("Map中是否包含對應值vlaue=陳大華的元素:");
    	System.out.println(objHM1.containsValue("陳大華"));
    	
    	//覆蓋舊值
    	System.out.println("加入key=14001:回傳舊值" + objHM1.put(14001,"黃大維"));
    	System.out.print("Map目前共有" + objHM1.size() + "個成對元素");
    	System.out.println("  目前內容為:" + objHM1);
    	
    	Set<Integer> objSet = objHM1.keySet();
    	System.out.println("學號集合內容為:" + objSet);
    	Collection<String> objCol = objHM1.values();
    	System.out.println("姓名集合內容為:" + objCol);
    	
    	System.out.println("移除key=14003:" + objHM1.remove(14003));
    	System.out.print("Map目前共有" + objHM1.size() + "個成對元素");
    	System.out.println("  目前內容為:" + objHM1);
    } 
}