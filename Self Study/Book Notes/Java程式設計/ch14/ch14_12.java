/*  檔名:ch14_12.java          功能:ListIterator<E>介面  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_12         //主類別
{
    public static void main(String args[])
    {    	
    	
    	LinkedList<Integer> objLList1 = new LinkedList<>(); //集合元素為Integer
    	
    	objLList1.add(24);  objLList1.add(17);  objLList1.add(41);
    	objLList1.add(18);  objLList1.add(30);  objLList1.add(12);   	
    	    	
    	int len=objLList1.size();
    	System.out.print("集合目前長度為:" + len);
    	System.out.println("  集合目前內容為:" + objLList1); 	
    	    	
    	ListIterator<Integer> objListItr1 = objLList1.listIterator();  //必須設定相同泛型Integer   
    	ListIterator<Integer> objListItr2 = objLList1.listIterator(len);  //必須設定相同泛型Integer  
    	
    	System.out.print("正向走訪:");
    	while(objListItr1.hasNext())
    	{
            System.out.print(objListItr1.next() + " ");
    	}
    	System.out.println();    	
    	
    	System.out.print("反向走訪:");
    	while(objListItr2.hasPrevious())
    	{
            System.out.print(objListItr2.previous() + " ");
    	}
    	System.out.println();
    } 	
}