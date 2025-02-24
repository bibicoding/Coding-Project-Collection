/*   檔名:ch14_17.java       功能:實作Comparator<? super CStu>介面  */

package myJava.ch14;
import java.lang.*;
import java.util.*;      //使用Collections Framework的類別需載入

public class ch14_17         //主類別
{
    public static void main(String args[])
    {        
        LinkedList<CStu> objLList1 = new LinkedList<CStu>();
        
        CStu obj1 = new CStu(14007,"李小清",85);
        CStu obj2 = new CStu(14004,"陳大華",87);
        CStu obj3 = new CStu(14002,"黃大維",75);
        CStu obj4 = new CStu(14006,"林大勇",92);
        
        objLList1.add(obj1);  objLList1.add(obj2);
        objLList1.add(obj3);  objLList1.add(obj4);                
        
        CMyComparator1 objComp1= new CMyComparator1();  //排序依據1
        Collections.sort(objLList1,objComp1);    //使用排序依據1進行排序       
        
        ListIterator<CStu> objListItr1 = objLList1.listIterator();
        System.out.println("學號遞增顯示:");
        while(objListItr1.hasNext())
        {
            objListItr1.next().showData();
        }

        CMyComparator2 objComp2= new CMyComparator2();  //排序依據2
        Collections.sort(objLList1,objComp2);    //使用排序依據2進行排序
        
        ListIterator<CStu> objListItr2=objLList1.listIterator();        
        System.out.println("成績遞增顯示:");
        while(objListItr2.hasNext())
        {
            objListItr2.next().showData();
        }
    } 
}

class CMyComparator1 implements Comparator<Object>  //實作Comparator介面
{
   public int compare(Object o1,Object o2)
   {
       if(o1 instanceof CStu && o2 instanceof CStu)
       {
          if(((CStu)o1).id < ((CStu)o2).id)
           return -1;
         else if(((CStu)o1).id == ((CStu)o2).id)
           return 0;
         else if(((CStu)o1).id > ((CStu)o2).id)
           return 1;         
       }
       return 0;    
   }
}

class CMyComparator2 implements Comparator<CStu> //實作Comparator介面
{
   public int compare(CStu o1,CStu o2)
   {
       if(o1.score < o2.score)
           return -1;
       else if(o1.score == o2.score)
           return 0;
       else if(o1.score > o2.score)
           return 1;       
       return 0;    
   } 
}    

class CStu
{
   public int id;
   public String name;
   public int score;
   public CStu(int i,String j,int k){id = i; name = j; score = k;}
   public void showData()
   {
       System.out.print("學號:" + id);
       System.out.print("\t姓名:" + name);
       System.out.println("\t成績:" + score);
   }
}


