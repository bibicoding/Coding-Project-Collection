/*  檔名:ch14_02.java          功能:泛型類別  */

package myJava.ch14;
import java.lang.*;


public class ch14_02         //主類別
{
    public static void main(String args[])
    {
        CMyclass<String> obj1 = new CMyclass<String>();  	
        CMyclass<Integer> obj2 = new CMyclass<Integer>(); 
        System.out.println("第一個為"+obj1.first("Hello","World"));
        System.out.println("最後一個為"+obj1.last("Hello","World"));
        System.out.println("第一個為"+obj2.first(7,5));
        System.out.println("最後一個為"+obj2.last(7,5));
    } 
}

class CMyclass<N>
{
    public N first(N a,N b)
    {   
        return a;     
    }  
    public N last(N a,N b)
    {   
        return b;     
    }    
}
