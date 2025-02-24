package myJava.exercise.ch05;
import java.lang.*;
import java.util.Arrays;   //引入Arrays類別

public class ex5_06         //主類別
{
    public static void main(String args[])
    {
       int x[]={25,10,39,40,33,12};
       int y[];
       int spec=11;       
         
       Arrays.sort(x);
       
       //在此之下加入程式,其餘已存在之程式不可修改
       
       //在此之上加入程式,其餘已存在之程式不可修改
       System.out.println("遞增");
       for(int num : x)
            System.out.print(num+ "\t");
       System.out.println();     
       System.out.println("遞減");
       for(int num : y)
            System.out.print(num+ "\t");
       System.out.println("\n特別號\t" + spec); 
    }
}