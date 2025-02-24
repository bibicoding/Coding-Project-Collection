/*  檔名:ch11_11.java          功能:String字串的觀念  */

package myJava.ch11;
import java.lang.*;

public class ch11_11         //主類別
{
    public static void main(String args[])
    {
        String str1 = "test"; 
        String str2 = "test"; 
        if(str1==str2)        //答案為true,因為指向同一個字串
           System.out.println("str1與str2指向同一個字串物件");
          
 //----------------------------------------------------------------       
        String str3 = new String("abc"); 
        String str4 = new String("abc"); 
        if(str3==str4)       //答案為false,因為指向不同字串物件
           System.out.println("str3與str4指向同一個字串物件");
        else
           System.out.println("str3與str4指向不同字串物件");
        if(str3.equals(str4))   //答案為true
           System.out.println("str3與str4內容相同");
           
 //----------------------------------------------------------------
        String str5 = "Hello";
        String str6 = "World";
        String str7 = "HelloWorld";
        String str8;
        str8 = str5 + str6;
        String str9 = (str5 + str6).intern();
        if(str7 == str8)      //答案為false,因為指向不同字串物件
           System.out.println("str7與str8指向同一個字串物件");
        else
           System.out.println("str7與str8指向不同字串物件");  
        if(str7.equals(str8))   //答案為true
           System.out.println("str7與str8內容相同");    
        if(str7 == str9)      //答案為true,因為指向同一個字串物件
           System.out.println("str7與str9指向同一個字串物件");       
    } 
}