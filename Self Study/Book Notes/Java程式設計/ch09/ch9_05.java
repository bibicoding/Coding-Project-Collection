/*  �ɦW:ch9_05.java          �\��:�����R�A��k���@�ΤεL�k��g  */

package myJava.ch09;
import java.lang.*;

public class ch9_05         //�D���O
{
    public static void main(String args[])
    {
        CCircle1 obj1 = new CCircle1();       
        CCircle2 obj2 = new CCircle2();       
        obj1.show2();            //���檺�O�����kshow2
        obj1.show4();            //���檺�O�����w�]��kshow4 
        //obj2.show2();          //�L�k���椶�����p����kshow2
        ICircle.show3();         //���檺�OICircle�������R�A��kshow3
        //ICircle.show1();       //�L�k���椶�����p���R�A��kshow1      
    } 
}    

interface ICircle        //�w�q����
{
    private static void show1()            //�ŧi�������p���R�A��kshow1()
    {
        System.out.println("�p���R�A��kshow1");   
    }     

    private void show2()            //�ŧi�������p����kshow2()
    {
        System.out.println("�p����kshow2");   
    }     
    
    public static void show3()
    {
        System.out.println("show3����show1");
        ICircle.show1();
    }

    public default void show4()
    {
        System.out.println("show4����show2");
        show2();
    }
}

class CCircle1 implements ICircle   //��@����
{   
   public void show2()               //�o���O��g�A���i�H�[�W@Override
   {
        System.out.println("show2�����k");
   }
}

class CCircle2 implements ICircle   //��@����
{   
}