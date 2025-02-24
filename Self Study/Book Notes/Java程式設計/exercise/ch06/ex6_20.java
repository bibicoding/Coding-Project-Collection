package myJava.exercise.ch06;
import java.lang.*;

public class ex6_20         //主類別
{
    public static void main(String args[])
    {                  
     int M[][]={{ 5,10,15,25}
               ,{ 8,18,31,45}
               ,{47,52,65,77}
               ,{69,74,89,92}};     
     int u;       //u為尋找目標值
     int find;
     int loc[]={-1,-1};   //紀錄{矩陣列,矩陣行}


     for(u=1;u<=100;u++) //測試尋找1~100
     {
       if(findEle(M,4,u,0,0,loc))
         System.out.println("找到"+u+"在陣列的["+ loc[0] + "]["+ loc[1] +"]位置中");
       else
         System.out.println("-----------------"+u+" 不在陣列中");
     }   
    }
    
    
   static boolean findEle(int M[][],int n,int x,int s,int t,int loc[])    //x為尋找目標值，對應u,找到x回傳true,找不到x回傳false
   {
       //...請撰寫程式
   }
}