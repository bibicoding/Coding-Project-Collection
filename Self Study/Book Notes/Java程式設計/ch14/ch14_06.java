/*  檔名:ch14_06.java         功能:LinkedList<E>類別(實作List<E>介面)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_06         //主類別
{
    public static void main(String args[])
    {
    	
        LinkedList<Integer> objLList1 = new LinkedList<>(); //集合元素為Integer
    	
        objLList1.add(25);  objLList1.add(18);  objLList1.add(41);
        objLList1.add(18);  objLList1.add(30);  objLList1.add(12);
    	   	
        showList(objLList1);  
        System.out.println("第一個12的索引值為" + objLList1.indexOf(12));  	
        System.out.println("第一個元素為:" + objLList1.getFirst()); //可替換為peekFirst
        System.out.println("最後一個元素為:" + objLList1.getLast());//可替換為peekLast
        System.out.print("成功刪除前方第一個18:");
        System.out.println(objLList1.removeFirstOccurrence(18));
        System.out.print("成功刪除前方第一個12:");
        System.out.println(objLList1.removeFirstOccurrence(12));
        showList(objLList1);
        System.out.println("刪除第一個元素為:" + objLList1.pollFirst());
        showList(objLList1);
        System.out.println("第一個12的索引值為" + objLList1.indexOf(12));    	    	
    }
    public static void showList(LinkedList objLList)
    {
        System.out.print("LinkedList目前長度為:" + objLList.size());
        System.out.print("   串列目前為:");
        for(int i=0;i<objLList.size();i++)
           System.out.print(objLList.get(i) + " ");
        System.out.println();  
    }
}