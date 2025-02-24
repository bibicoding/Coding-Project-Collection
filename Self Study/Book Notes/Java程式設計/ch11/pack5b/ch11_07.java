/*  檔名:位於pack5b\ch11_07.java          功能:子類別庫  */

package pack5b;        //本檔案內的類別屬於pack5b類別庫

import pack5a.subpacka.CCircle;   //匯入類別庫
import pack5a.subpackb.CRect;     //匯入類別庫

public class ch11_07         //主類別
{
    public static CCircle obj1;
    public static CRect obj2;
    public static void main(String args[])
    {
        obj1 = new CCircle(5.0);
        obj1.showArea(); 
        obj2 = new CRect(5.0,3.0);
        obj2.showArea();  
    } 
}