/*  檔名:ch14_10.java          功能:Iterator介面  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_10         //主類別
{
    public static void main(String args[])
    {
    	
        TreeSet<Integer> objTS1 = new TreeSet<>(); 
    	
        objTS1.add(15);  objTS1.add(18);  objTS1.add(14);
        objTS1.add(37);  objTS1.add(20);  objTS1.add(6);
    	    	
        System.out.print("集合目前長度為:" + objTS1.size()); 	
        System.out.println("  集合目前內容為:" + objTS1); 	
    	    	
        Iterator<Integer> objItr1 = objTS1.iterator();  //必須設定相同泛型Integer  
        while(objItr1.hasNext())
        {
            System.out.print(objItr1.next() + " ");
        }
        System.out.println();
        objItr1.remove();
    	
        System.out.print("集合目前長度為:" + objTS1.size());   	
        System.out.println("  集合目前內容為:" + objTS1);   	
    } 	
}