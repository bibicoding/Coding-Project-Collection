/*   檔名:ch11_15.java      功能:不同package使得protected產生作用  */

package pack6b;              //ch11_15與CB皆隸屬於pack6b package
import pack6a.CA;            //由於要使用CA,故需要引入


public class ch11_15         //主類別
{
    public static void main(String args[])
    {
        CA objA =  new CA();
        CB objB =  new CB();           //objB是子類別物件
        System.out.println("輸入類別CA的objA物件資料");
        objA.inputX();
        objA.inputY();
        objA.inputZ();
        System.out.print("類別CA的objA物件:");
        objA.show();
        System.out.println("-------------------------");
        System.out.println("輸入類別CB的objB物件資料");
        objB.inputX();
        objB.inputY();
        objB.inputZ();
        objB.varX++;
        //objB.varY++;        //外部程式無法存取protected等級資料
        objB.addOne();
        System.out.print("類別B的objB物件:");
        objB.show();
    } 
}

class CB extends CA   // 類別CB繼承自類別CA
{
    public int varW;          //新增的成員變數
    public void addOne()      //新增的成員函式
    {
        varX++;
        varY++;
        //varZ++;       //無法存取父類別private等級資料
    }
}