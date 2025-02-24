/*  檔名:位於pack2b\ch11_04.java        功能:使用其他類別庫的類別  */

package pack2b;        //本檔案內的類別屬於pack2b類別庫

public class ch11_04         //主類別
{
    public static pack2a.CRect obj;
    public static void main(String args[])
    {
        obj = new pack2a.CRect(5.0,3.0);
        obj.showArea(); 
    } 
}