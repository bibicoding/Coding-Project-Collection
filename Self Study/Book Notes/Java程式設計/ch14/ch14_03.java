/*  檔名:ch14_03.java          功能:HashSet類別(實作Set介面)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_03         //主類別
{
    public static void main(String args[])
    {
        String str1 = new String("Green");
        String str2 = "Red";
    	
        HashSet<String> objHS1 = new HashSet<>(); //集合元素為String
    	
        System.out.print("集合1目前為空:" + objHS1.isEmpty());
        System.out.println("    集合1目前長度為:" + objHS1.size());
    	
        System.out.println("加入Green是否成功:" + objHS1.add(str1));
        System.out.println("加入Red  是否成功:" + objHS1.add(str2));
        System.out.println("加入Blue 是否成功:" + objHS1.add("Blue"));
        System.out.println("加入Red  是否成功:" + objHS1.add("Red")); //會失敗
    	
        System.out.print("集合1目前長度為:" + objHS1.size());   	
        System.out.println("  集合1目前內容為:" + objHS1);
   	
        System.out.println("集合1是否包含Red :" + objHS1.contains(str2));
        System.out.println("集合1是否包含Blue:" + objHS1.contains("Blue"));
        System.out.println("集合1是否包含Pink:" + objHS1.contains("Pink"));

        System.out.println("移除Red 是否成功:" + objHS1.remove("Red"));
        System.out.println("移除Pink是否成功:" + objHS1.remove("Pink"));
        
        System.out.print("集合1目前長度為:" + objHS1.size());   	
        System.out.println("  集合1目前內容為:" + objHS1);
   	
        System.out.println("集合1是否包含Red :" + objHS1.contains("Red"));
    	
        System.out.println("-----------------------------------");
    	
        HashSet<String> objHS2 = new HashSet<>();  //集合元素為String
        objHS2.add("Pink"); objHS2.add("Blue"); objHS2.add("Black"); 
    	
        System.out.print("集合2目前長度為:" + objHS2.size());   	
        System.out.println("  集合2目前內容為:" + objHS2);
    	
        objHS2.addAll(objHS1);    //把objHS1的元素加入到objHS2
    	
        System.out.print("集合2目前長度為:" + objHS2.size());   	
        System.out.println("  集合2目前內容為:" + objHS2);    	
    }
}